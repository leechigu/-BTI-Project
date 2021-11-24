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
        final Button job_btn2  = (Button)findViewById(R.id.btn18);

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
                info_txt.setText("따뜻하고, 감정이입을 하며, 표현이 활발하고, 책임감이 있다. 비전과 목표에 대해서 사람들을 동기화시키는 리더십을 발휘한다.");
                job_btn1.setText("CEO");
                job_btn2.setText("언어교사");
                image_mbti.setImageResource(R.drawable.enfj);

            }
        });

        btn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENTP");
                info_txt.setText("상황을 빠르게 이해하고, 활기차고, 거리낌 없이 표현한다. 관심의 폭이 넓고, 한 가지 새로운 흥미는 또 다른 것으로 바뀌기 쉽다.");
                job_btn1.setText("영화감독");
                job_btn2.setText("벤처 사업가");
                image_mbti.setImageResource(R.drawable.entp);

            }
        });

        btn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENTJ");
                info_txt.setText("솔직하며, 결단력 있고, 타인들을 이끌고자 한다. 장기 계획과 목표를 설정하고 자신들의 아이디어와 비전을 뚜렷하게 표현하고 관철시킨다.");
                job_btn1.setText("경영 컨설턴트");
                job_btn2.setText("경제분석가");
                image_mbti.setImageResource(R.drawable.entj);
            }
        });
        btn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ENFP");
                info_txt.setText("열정적이고, 따뜻하며, 상상력이 풍부하다. 자발적이고, 융통성이 있으며, 때로는 자신만의 즉흥적, 유창한 언변을 발휘한다.");
                job_btn1.setText("디자이너");
                job_btn2.setText("방송프로듀서");
                image_mbti.setImageResource(R.drawable.enfp);
            }
        });

        btn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INFJ");
                info_txt.setText("다른 사람들에 대해 통찰력을 지니고 있다. 자신의 비전을 수행하기 위해 사람들을 조직화하고 동기화시킨다.");
                job_btn1.setText("특수 교사");
                job_btn2.setText("아트디렉터");
                image_mbti.setImageResource(R.drawable.infj);
            }
        });

        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INTJ");
                info_txt.setText("독창적이고 창의적인 마인드를 지니고 있다. 회의적이고 독립적이며, 자신과 타인들에 대한 능력과 수행에 높은 기준을 지니고 있다.");
                job_btn1.setText("웹 개발자");
                job_btn2.setText("경영컨설턴트");
                image_mbti.setImageResource(R.drawable.intj);
            }
        });

        btn_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INTP");
                info_txt.setText("타인과의 상호작용보다는 아이디어에 더 많은 관심을 가지고 있다. 회의적이며, 때로는 비판적이고, 항상 분석적이다.");
                job_btn1.setText("경제학자");
                job_btn2.setText("연구원");
                image_mbti.setImageResource(R.drawable.intp);
            }
        });

        btn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("INFP");
                info_txt.setText("호기심이 많고, 어떠한 일의 가능성을 보는 경향이 있다. 자신들의 가치가 위협받지 않는 한 잘 적응하고, 융통성이 있다.");
                job_btn1.setText("작곡가");
                job_btn2.setText("사서");
                image_mbti.setImageResource(R.drawable.infp);
            }
        });

        btn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESFJ");
                info_txt.setText("마음이 따뜻하고, 양심적이며, 협조적이다. 일상생활에서 타인들의 필요를 잘 알아패며, 그것을 제공하기 위해 노력한다.");
                job_btn1.setText("간호사");
                job_btn2.setText("초등학교 교사");
                image_mbti.setImageResource(R.drawable.esfj);
            }
        });

        btn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESTJ");
                info_txt.setText("구체적이고, 현실적이며, 사실적이다. 결정을 하고자하고, 결정된 것들을 이행하기 위해 빠르게 움직인다.");
                job_btn1.setText("예산분석가");
                job_btn2.setText("교육전문가");
                image_mbti.setImageResource(R.drawable.estj);
            }
        });

        btn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESFP");
                info_txt.setText("사교적이고, 다정하며, 수용적이며, 긍정적이다. 새로운 사람들과 환경에 빨리 적응한다.");
                job_btn1.setText("의상디자이너");
                job_btn2.setText("애니메이터");
                image_mbti.setImageResource(R.drawable.esfp);
            }
        });

        btn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ESTP");
                info_txt.setText("상황에 유연하며, 문제해결을 위해 활동적으로 움직인다. 지금 벌어지는 일에 관심이 많고, 타인들과 활기차게 할 수 있는 매 순간을 즐긴다.");
                job_btn1.setText("건축엔지니어");
                job_btn2.setText("은행원");
                image_mbti.setImageResource(R.drawable.estp);
            }
        });

        btn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISFJ");
                info_txt.setText("조용하고, 다정하며, 성실하고, 책임감이 강하다. 자신들의 의무에 헌신적이고, 이를 꾸준하게 실현해 나간다.");
                job_btn1.setText("물리치료사");
                job_btn2.setText("행정보조원");
                image_mbti.setImageResource(R.drawable.isfj);
            }
        });

        btn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISTJ");
                info_txt.setText("조용하고, 신중하며, 철저함과 확실성으로 좋은 결과를 얻고자 한다. 해야 할 것을 논리적으로 결정하고, 흐트러짐 없이 꾸준히 해 나간다.");
                job_btn1.setText("통계학자");
                job_btn2.setText("웹 개발자");
                image_mbti.setImageResource(R.drawable.istj);
            }
        });


        btn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISFP");
                info_txt.setText("조용하고, 다정하며, 정서에 민감하고, 친절하다. 논쟁과 갈등을 싫어하며, 자신의 의견이나 가치를 다른 사람들에게 강요하지 않는다.");
                job_btn1.setText("만화가");
                job_btn2.setText("음향디자이너");
                image_mbti.setImageResource(R.drawable.isfp);
            }
        });

        btn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title_mbti.setText("ISTP");
                info_txt.setText("상황에 대해 관조적이고 유연하다. 사실을 논리적으로 구조화하고자 하며, 효울성에 가치를 둔다.");
                job_btn1.setText("운동선수");
                job_btn2.setText("경제학자");
                image_mbti.setImageResource(R.drawable.istp);
            }
        });

        job_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jobName = job_btn1.getText().toString();
                Intent job1Intent = new Intent(MbtiJobInfo.this, mbti_job_info_popup.class);
                job1Intent.putExtra("mbti",title_mbti.getText().toString());
                job1Intent.putExtra("job",jobName);
                MbtiJobInfo.this.startActivity(job1Intent);
            }
        });
        job_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jobName = job_btn2.getText().toString();
                Intent job2Intent = new Intent(MbtiJobInfo.this, mbti_job_info_popup.class);
                job2Intent.putExtra("mbti",title_mbti.getText().toString());
                job2Intent.putExtra("jobName",jobName);
                MbtiJobInfo.this.startActivity(job2Intent);

            }
        });


        intent =getIntent();
        if(intent.hasExtra("mbti")){
            String userMbti = null;
            userMbti = intent.getExtras().getString("mbti");

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
