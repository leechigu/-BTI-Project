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



        //총 질문은 16개로 설정하고 나중에 늘릴계획 지금거는 기본 질문
        data.add(new Answer("나는 집에서 노는 것보다 밖에서 노는게 더 재미있다."));
        data.add(new Answer("여행은 노는게 아니라 쉬는 것이라고 생각한다."));
        data.add(new Answer("나는 학창시절에 주로 발표하는 것을 즐겼다."));
        data.add(new Answer("엘레베이터를 타면 구석쪽에 자리를 잡는다."));
        // i,e
        data.add(new Answer("종종 초능력을 가지는 등의 비현실적인 상상을 한다. "));
        data.add(new Answer("새로운 무언가를 도전 하는 것이 두렵다. "));
        data.add(new Answer("시를 읽으면 표현이 아름답다고 생각한다."));
        data.add(new Answer("내가 현실적인 사람이라고 생각한다."));
        // n,s
        data.add(new Answer("결과가 과정보다 중요하다고 생각한다."));
        data.add(new Answer("고민 상담시에 조언보다는 위로를 해주는 편이다."));
        data.add(new Answer("옳고 그름을 정하는 것은 중요하다고 생각한다."));
        data.add(new Answer("실적이 없는 직원은 가차없이 해고해야 한다."));
        // t,f
        data.add(new Answer("계획을 세우고 그 계획에 맞춰 생활을 하는 편이다."));
        data.add(new Answer("여행을 할 때 계획과 다르게 즉흥적으로 움직인다."));
        data.add(new Answer("옷장이나 책상이 정리가 잘 되어있는 편이다."));
        data.add(new Answer("체계적인 것 보다 유동적인것을 선호한다."));
        // j,p

        TestAdapter adapter = new TestAdapter(data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        finishbtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                String e_i;
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
                        return;
                    }
                    //값 계산

                    int score=0;
                    if(rb.getText().equals("+3")){ score = 3; }
                    else if(rb.getText().equals("+2")){ score = 2; }
                    else if(rb.getText().equals("+1")){ score = 1; }
                    else if(rb.getText().equals("0")){ score = 0; }
                    else if(rb.getText().equals("-1")){ score = -1; }
                    else if(rb.getText().equals("-2")){ score = -2; }
                    else if(rb.getText().equals("-3")){ score = -3; }
                    if(i%2==1)
                        score *= -1;
                    //값 영역 지정
                    if(i>=0&&i<4)
                        sum_1+=score;
                    else if(i>=4&&i<8)
                        sum_2+=score;
                    else if (i>=8&&i<12)
                        sum_3+=score;
                    else
                        sum_4+=score;
                }
                // 값을 통한 mbti 설정
                if(sum_1>=0) e_i = "e";
                else e_i = "i";
                if(sum_2>=0) n_s = "n";
                else n_s = "s";
                if(sum_3>=0) t_f = "t";
                else t_f = "f";
                if(sum_4>=0) j_p = "j";
                else j_p = "p";
                String mbti = e_i+n_s+t_f+j_p;
                int scores[] = new int[4];
                scores[0] = sum_1;
                scores[1] = sum_2;
                scores[2] = sum_3;
                scores[3] = sum_4;
                Intent testFinishIntent = new Intent(TestMbti.this,MbtiJobInfo.class);

                testFinishIntent.putExtra("mbti",mbti);
                testFinishIntent.putExtra("scores",scores);
                TestMbti.this.startActivity(testFinishIntent);
                //점수를 환산해서 각 스펠링 별로 %도 표현...

            }
        });

    }

}