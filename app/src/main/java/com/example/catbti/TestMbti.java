package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class TestMbti extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mbti);
        Button finishbtn = findViewById(R.id.testFinishButton);
        ArrayList<Answer> data = new ArrayList<>();

        data.add(new Answer("i,e_1"));
        data.add(new Answer("i,e_2"));
        data.add(new Answer("i,e_3"));
        data.add(new Answer("i,e_4"));
        // i,e
        //data.add(new Answer("n,s_1"));
        //data.add(new Answer("n,s_2"));
        //data.add(new Answer("n,s_3"));
        //data.add(new Answer("n,s_4"));
        // n,s
        //data.add(new Answer("t,f_1"));
        //data.add(new Answer("t,f_2"));
        //data.add(new Answer("t,f_3"));
        //data.add(new Answer("t,f_4"));
        // t,f
        //data.add(new Answer("j,p_1"));
        //data.add(new Answer("j,p_2"));
        //data.add(new Answer("j,p_3"));
        //data.add(new Answer("j,p_4"));
        // j,p


        TestAdapter adapter = new TestAdapter(data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);




        finishbtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                String i_e;
                String n_s;
                String t_f;
                String j_p;
                int sum_1 = 0;
                int sum_2 = 0;
                int sum_3 = 0;
                int sum_4 = 0;
                //양수라면 i 음수라면 e 0이라면?
                //결과값 도출
                for(int i = 0;i<data.size();i++){
                    int temp;
                    Answer ans = data.get(i);
                    RadioGroup rg = ans.getRadioGroup();
                    temp = rg.getCheckedRadioButtonId();
                    RadioButton rb = (RadioButton) findViewById(temp);
                    //값을 누르지 않았을 경우 에러처리
                    if(rb==null){
                        Toast.makeText(getApplicationContext(),ans.getAnswer()+"이 눌리지 않았습니다.",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    //값 계산

                    int score=0;
                    if(rb.getText()=="+3"){ score = 3; }
                    else if(rb.getText()=="+2"){ score = 2; }
                    else if(rb.getText()=="+1"){ score = 1; }
                    else if(rb.getText()=="0"){ score = 0; }
                    else if(rb.getText()=="-1"){ score = -1; }
                    else if(rb.getText()=="-2"){ score = -2; }
                    else if(rb.getText()=="-3"){ score = -3; }

                    //값 영역 지정
                    if(i>=0&&i<4) sum_1+=score;
                    else if(i>=4&&i<8) sum_2+=score;
                    else if (i>=8&&i<12) sum_3+=score;
                    else sum_4+=score;
                }
                // 값을 통한 mbti 설정
                if(sum_1>=0) i_e = "i";
                else i_e = "e";
                if(sum_2>=0) n_s = "n";
                else n_s = "s";
                if(sum_3>=0) t_f = "t";
                else t_f = "f";
                if(sum_4>=0) j_p = "j";
                else j_p = "p";
                String mbti = i_e+n_s+t_f+j_p;
                Toast.makeText(getApplicationContext(),mbti,Toast.LENGTH_SHORT).show();

            }
        });











    }




}