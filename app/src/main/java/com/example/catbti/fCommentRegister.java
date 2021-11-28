package com.example.catbti;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fCommentRegister extends AppCompatActivity {

    private FunCommentDBHelper fCommentDBHelper;
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    int postN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fcomment_register);

        Button Btn = findViewById(R.id.fcommentregbtn);
        setInit();

    }


    //초기화
    private void setInit() {
        fCommentDBHelper = new FunCommentDBHelper(this);

        CheckBox obj1 = findViewById(R.id.registerObj1);
        CheckBox obj2 = findViewById(R.id.registerObj2);
        Button mbti_btn = findViewById(R.id.mbti_btn);
        TextView mbti_tv = findViewById(R.id.mbti_tv);
        Button regBtn = findViewById(R.id.fcommentregbtn);

        mbti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] listItems = {"ENFJ", "ENTJ", "ENTP", "ENFP", "INFJ","INTJ","INTP", "INFP", "ESFJ", "ESTJ","ESFP", "ESTP","ISFJ", "ISTJ", "ISFP", "INTP"};


                AlertDialog.Builder builder = new AlertDialog.Builder(fCommentRegister.this);
                builder.setTitle("MBTI를 선택하세요.");

                int checkedItem = 0; //this will checked the item when user open the dialog
                builder.setSingleChoiceItems(listItems, checkedItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(fCommentRegister.this, listItems[which], Toast.LENGTH_SHORT).show();
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

        Intent intent = getIntent();
        int postnum = intent.getExtras().getInt("postNum");
        String ob1 = intent.getExtras().getString("obj1");
        String ob2 = intent.getExtras().getString("obj2");

        obj1.setText(ob1);
        obj2.setText(ob2);


        regBtn.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                String mb = getS();
                if(getS()==null){
                    Toast.makeText( fCommentRegister.this, "빈칸을 채워주세요" , Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(obj1.isChecked()&&obj2.isChecked()){
                    Toast.makeText( fCommentRegister.this, "하나만 선택해 주세요." , Toast.LENGTH_SHORT).show();
                    return;
                }
                if(obj1.isChecked()){
                    fCommentDBHelper.InsertComment(postnum,ob1,mb);
                    Toast.makeText( fCommentRegister.this, "댓글 추가 완료" , Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(obj2.isChecked()){
                    fCommentDBHelper.InsertComment(postnum,ob2,mb);
                    Toast.makeText( fCommentRegister.this, "댓글 추가 완료" , Toast.LENGTH_SHORT).show();
                    return;
                    }
                }

        });

    }


}
