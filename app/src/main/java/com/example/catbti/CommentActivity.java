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

public class CommentActivity extends AppCompatActivity {

    private RecyclerView rv_comment;
    private FloatingActionButton btn_write_comment;
    private ArrayList<Comment> comments;
    private CommentDBHelper mCommentDBHelper;
    private CommentAdapter mCommentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

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
                dialog.setContentView(R.layout.comment_register);EditText title_et = dialog.findViewById(R.id.title_et);
                EditText et_comment = dialog.findViewById(R.id.et_comment);
                Button reg_button = dialog.findViewById(R.id.reg_comment_btn);

                reg_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //insert db
                        mCommentDBHelper.InsertComment(et_comment.getText().toString());

                        //insert UI
                        Comment item = new Comment();
                        item.setCommentContent(et_comment.getText().toString());

                        mCommentAdapter.addItem(item);
                        rv_comment.smoothScrollToPosition(0);
                        dialog.dismiss();
                        Toast.makeText(CommentActivity.this,"게시물 작성 완료", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }
    //저장되어있던 db를 가져옴
    private void loadRecentDB() {
        comments = mCommentDBHelper.getCommentList();
        if(mCommentAdapter == null){
            mCommentAdapter = new CommentAdapter(comments, this);
            rv_comment.setHasFixedSize(true);
            rv_comment.setAdapter(mCommentAdapter);
        }
    }
}