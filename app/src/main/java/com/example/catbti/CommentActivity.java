package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CommentActivity extends AppCompatActivity {

    private RecyclerView rv_comment;
    private FloatingActionButton btn_write_comment;
    private ArrayList<Comment> comments;
    private CommentDBHelper mCommentDBHelper;
    private CommentAdapter mCommentAdapter;
    private ArrayList<PostItem> postItems;
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    PostAdapter postAdapter;
    int postN;

    public int getPostN() {
        return postN;
    }

    public void setPostN(int postN) {
        this.postN = postN;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        Intent intent  =getIntent();
        setPostN(intent.getExtras().getInt("postNum"));


        setInit();

    }


    //초기화
    private void setInit() {
        mCommentDBHelper = new CommentDBHelper(this);

        rv_comment = findViewById(R.id.rv_comment);
        btn_write_comment = findViewById(R.id.btn_write_comment);
        comments = new ArrayList<>();

        //load recent DB
        loadRecentDB();

        btn_write_comment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //팝업 창
                Dialog dialog = new Dialog(CommentActivity.this, android.R.style.Theme_Material_Light_Dialog);
                dialog.setContentView(R.layout.comment_register);
                TextView mbti_tv = dialog.findViewById(R.id.mbti_tv);
                Button mbti_btn = dialog.findViewById(R.id.mbti_btn);
                mbti_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String[] listItems = {"ENFJ", "ENTJ", "ENTP", "ENFP", "INFJ","INTJ","INTP", "INFP", "ESFJ", "ESTJ","ESFP", "ESTP","ISFJ", "ISTJ", "ISFP", "INTP"};


                        AlertDialog.Builder builder = new AlertDialog.Builder(CommentActivity.this);
                        builder.setTitle("MBTI를 선택하세요.");

                        int checkedItem = 0; //this will checked the item when user open the dialog
                        builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(CommentActivity.this, listItems[which], Toast.LENGTH_SHORT).show();
                                setA(listItems[which]);
                                mbti_tv.setText(getA());
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
                //EditText title_et = dialog.findViewById(R.id.title_et);
                EditText et_comment = dialog.findViewById(R.id.et_comment);

                Button reg_button = dialog.findViewById(R.id.reg_comment_btn);

                reg_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //insert db

                        mCommentDBHelper.InsertComment(getPostN() ,et_comment.getText().toString(),getA());

                        //insert UI
                        Comment item = new Comment();

                        item.setCommentContent(et_comment.getText().toString());
                        item.setCommentMbti(getA());
                        mCommentAdapter.addItem(item);

                        rv_comment.smoothScrollToPosition(0);
                        dialog.dismiss();
                        Toast.makeText(CommentActivity.this,"댓글 작성 완료", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }
    //저장되어있던 db를 가져옴
    private void loadRecentDB() {
        comments = mCommentDBHelper.getCommentList(getPostN());
        if(mCommentAdapter == null){
            mCommentAdapter = new CommentAdapter(comments, this);
            rv_comment.setHasFixedSize(true);
            rv_comment.setAdapter(mCommentAdapter);
        }
    }
}