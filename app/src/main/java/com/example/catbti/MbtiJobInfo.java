package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MbtiJobInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_job_info);

        final TextView title_mbti = (TextView)findViewById(R.id.txt1);
        final TextView info_txt = (TextView)findViewById(R.id.txt2);


        final Button job_btn1  = (Button)findViewById(R.id.btn17);
        final Button job_btn2  = (Button)findViewById(R.id.btn17);

        final Button btn_enfj  = (Button)findViewById(R.id.btn1);
        final Button btn_entj  = (Button)findViewById(R.id.btn2);
        final Button btn_entp  = (Button)findViewById(R.id.btn3);
        final Button btn_enfp  = (Button)findViewById(R.id.btn4);
        final Button btn_infj  = (Button)findViewById(R.id.btn5);
        final Button btn_intj  = (Button)findViewById(R.id.btn6);
        final Button btn_intp  = (Button)findViewById(R.id.btn7);
        final Button btn_infp  = (Button)findViewById(R.id.btn8);
        final Button btn_esfj  = (Button)findViewById(R.id.btn9);
        final Button btn_estj  = (Button)findViewById(R.id.btn10);
        final Button btn_esfp  = (Button)findViewById(R.id.btn11);
        final Button btn_estp  = (Button)findViewById(R.id.btn12);
        final Button btn_isfj  = (Button)findViewById(R.id.btn13);
        final Button btn_istj  = (Button)findViewById(R.id.btn14);
        final Button btn_isfp  = (Button)findViewById(R.id.btn15);
        final Button btn_istp  = (Button)findViewById(R.id.btn16);
        final ImageView image_mbti  = (ImageView)findViewById(R.id.image_mbti);




        Intent intent =null;












        btn_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENFJ");
                info_txt.setText("ENTJ 특징 설명");
                job_btn1.setText("공무원");
                job_btn2.setText("의사");
                image_mbti.setImageResource(R.drawable.enfj);

            }
        });

        btn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENTP");
                info_txt.setText("ENTP 특징 설명");
                image_mbti.setImageResource(R.drawable.entp);

            }
        });

        btn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENTJ");
                info_txt.setText("ENTJ 특징 설명");
                image_mbti.setImageResource(R.drawable.entj);
            }
        });
        btn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENFP");
                info_txt.setText("ENFP 특징 설명");
                image_mbti.setImageResource(R.drawable.enfp);
            }
        });

        btn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INFJ");
                info_txt.setText("INFJ 특징 설명");
                image_mbti.setImageResource(R.drawable.infj);
            }
        });

        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INTJ");
                info_txt.setText("INTJ 특징 설명");
                image_mbti.setImageResource(R.drawable.intj);
            }
        });

        btn_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INTP");
                info_txt.setText("INTP 특징 설명");
                image_mbti.setImageResource(R.drawable.intp);
            }
        });

        btn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INFP");
                info_txt.setText("INFP 특징 설명");
                image_mbti.setImageResource(R.drawable.infp);
            }
        });

        btn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESFJ");
                info_txt.setText("ESFJ 특징 설명");
                image_mbti.setImageResource(R.drawable.esfj);
            }
        });

        btn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESTJ");
                info_txt.setText("ESTJ 특징 설명");
                image_mbti.setImageResource(R.drawable.estj);
            }
        });

        btn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESFP");
                info_txt.setText("ESFP 특징 설명");
                image_mbti.setImageResource(R.drawable.esfp);
            }
        });

        btn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESTP");
                info_txt.setText("ESTP 특징 설명");
                image_mbti.setImageResource(R.drawable.estp);
            }
        });

        btn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISFJ");
                info_txt.setText("ISFJ 특징 설명");
                image_mbti.setImageResource(R.drawable.isfj);
            }
        });

        btn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISTJ");
                info_txt.setText("ISTJ 특징 설명");
                image_mbti.setImageResource(R.drawable.istj);
            }
        });


        btn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISFP");
                info_txt.setText("ISFP 특징 설명");
                image_mbti.setImageResource(R.drawable.isfp);
            }
        });

        btn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISTP");
                info_txt.setText("ISTP 특징 설명");
                image_mbti.setImageResource(R.drawable.istp);
            }
        });


        intent =getIntent();
        if(intent.hasExtra("mbti")){
            String userMbti = null;
            userMbti = intent.getExtras().getString("mbti");
            int mbtiScores[] = new int[4];
            mbtiScores = intent.getExtras().getIntArray("scores");
            Toast.makeText(getApplicationContext(),"당신의 MBTI : "+userMbti,Toast.LENGTH_SHORT).show();
            if(userMbti.equals("enfj")){
                btn_enfj.performClick();
            }
            else if(userMbti.equals("entj")){
                btn_entj.performClick();
            }
            else if(userMbti.equals("entp")){
                btn_entp.performClick();
            }
            else if(userMbti.equals("enfp")){
                btn_enfp.performClick();
            }
            else if(userMbti.equals("infj")){
                btn_infj.performClick();
            }
            else if(userMbti.equals("intj")){
                btn_intj.performClick();
            }
            else if(userMbti.equals("intp")){
                btn_intp.performClick();
            }
            else if(userMbti.equals("infp")){
                btn_infp.performClick();
            }
            else if(userMbti.equals("esfj")){
                btn_esfj.performClick();
            }
            else if(userMbti.equals("estj")){
                btn_estj.performClick();
            }
            else if(userMbti.equals("esfp")){
                btn_esfp.performClick();
            }
            else if(userMbti.equals("estp")){
                btn_estp.performClick();
            }
            else if(userMbti.equals("isfj")) {
                btn_isfj.performClick();
            }
            else if(userMbti.equals("istj")){
                btn_istj.performClick();
            }
            else if(userMbti.equals("isfp")){
                btn_isfp.performClick();
            }
            else if(userMbti.equals("istp")){
                btn_istp.performClick();
            }

        }


    }

}
