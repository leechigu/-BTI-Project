package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {

    private RecyclerView rv_post;
    private FloatingActionButton btn_write;
    private ArrayList<PostItem> postItems;
    private DBHelper mDBHelper;
    private PostAdapter mAdapter;

    String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        setInit();

    }


    //초기화
    private void setInit() {
        mDBHelper = new DBHelper(this);

        rv_post = findViewById(R.id.rv_post);
        btn_write = findViewById(R.id.btn_write);
        postItems = new ArrayList<>();


        //load recent DB
        loadRecentDB();

        btn_write.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                //팝업 창
                Dialog dialog = new Dialog(PostActivity.this, android.R.style.Theme_Material_Light_Dialog);
                dialog.setContentView(R.layout.activity_register);
                TextView mbti_tv = dialog.findViewById(R.id.mbti_tv);
                Button mbti_btn = dialog.findViewById(R.id.mbti_btn);
                mbti_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String[] listItems = {"ENFJ", "ENTJ", "ENTP", "ENFP", "INFJ","INTJ","INTP", "INFP", "ESFJ", "ESTJ","ESFP", "ESTP","ISFJ", "ISTJ", "ISFP", "INTP"};


                        AlertDialog.Builder builder = new AlertDialog.Builder(PostActivity.this);
                        builder.setTitle("MBTI를 선택하세요.");

                        int checkedItem = 0; //this will checked the item when user open the dialog
                        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(PostActivity.this, listItems[which], Toast.LENGTH_SHORT).show();
                                setS(listItems[which]);
                                mbti_tv.setText(getS());
                            }
                        });

                        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.dismiss();
                            }
                        });

                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                });

                EditText title_et = dialog.findViewById(R.id.title_et);
                EditText content_et = dialog.findViewById(R.id.content_et);

                Button reg_button = dialog.findViewById(R.id.reg_button);

                reg_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //insert db
                        mDBHelper.InsertPost(title_et.getText().toString(), content_et.getText().toString(), getS());

                        //insert UI
                        PostItem item = new PostItem();
                        item.setTitle(title_et.getText().toString());
                        item.setContent(content_et.getText().toString());
                        item.setMbti(getS());

                        mAdapter.addItem(item);
                        rv_post.smoothScrollToPosition(0);
                        dialog.dismiss();
                        Toast.makeText(PostActivity.this,"게시물 작성 완료", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }
    //저장되어있던 db를 가져옴
    private void loadRecentDB() {
        postItems = mDBHelper.getPostList();
        if(mAdapter == null){
            mAdapter = new PostAdapter(postItems, this);
            rv_post.setHasFixedSize(true);
            rv_post.setAdapter(mAdapter);
        }
    }
}