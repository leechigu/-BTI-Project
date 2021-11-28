package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MbtiFunPost extends AppCompatActivity {

    private RecyclerView rv_fpost;
    private FloatingActionButton btn_fwrite;
    private ArrayList<FunPost> fposts;
    private FunPostDBHelper fDBHelper;
    private FunPostAdapter fAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_mbti_fun_post);
        setInit();

    }


    //초기화
    private void setInit() {
        fDBHelper = new FunPostDBHelper(this);

        rv_fpost = findViewById(R.id.rv_fpost);
        btn_fwrite = findViewById(R.id.btn_fwrite);
        fposts = new ArrayList<>();
        //load recent DB
        loadRecentDB();

        btn_fwrite.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //팝업 창
                Dialog dialog = new Dialog(MbtiFunPost.this, android.R.style.Theme_Material_Light_Dialog);
                dialog.setContentView(R.layout.activity_fun_post_register_pop_up);
                EditText title_et = dialog.findViewById(R.id.ftitle_et);
                EditText content_et = dialog.findViewById(R.id.fcontent_et);
                EditText obj1 = dialog.findViewById(R.id.fObj1);
                EditText obj2 = dialog.findViewById(R.id.fObj2);

                Button reg_button = dialog.findViewById(R.id.fcommentregbtn);

                reg_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //insert db
                        fDBHelper.InsertPost(title_et.getText().toString(), content_et.getText().toString(), obj1.getText().toString(),obj2.getText().toString());
                        //insert UI
                        FunPost fp = new FunPost();
                        fp.setTitle(title_et.getText().toString());
                        fp.setContents(content_et.getText().toString());
                        fp.setObj1(obj1.getText().toString());
                        fp.setObj2(obj2.getText().toString());

                        fAdapter.addItem(fp);
                        rv_fpost.smoothScrollToPosition(0);
                        dialog.dismiss();
                        Toast.makeText(MbtiFunPost.this,"게시물 작성 완료", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }

    //저장되어있던 db를 가져옴
    private void loadRecentDB() {
        fposts = fDBHelper.getAllPostList();
        if(fAdapter == null){
            fAdapter = new FunPostAdapter(fposts, this);
            rv_fpost.setHasFixedSize(true);
            rv_fpost.setAdapter(fAdapter);
        }
    }
}