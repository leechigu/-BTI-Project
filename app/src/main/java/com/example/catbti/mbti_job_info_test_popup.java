package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class mbti_job_info_test_popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView(R.layout.activity_mbti_job_info_test_popup);

        TextView title = findViewById(R.id.testpopTitleText);
        TextView eV = findViewById(R.id.testEText);
        TextView iV = findViewById(R.id.testIText);
        TextView sV = findViewById(R.id.testSText);
        TextView nV = findViewById(R.id.testNText);
        TextView tV = findViewById(R.id.testTText);
        TextView fV = findViewById(R.id.testFText);
        TextView jV = findViewById(R.id.testJText);
        TextView pV = findViewById(R.id.testPText);

        Button clseBtn = findViewById(R.id.testPopupCloseBtn);
        Button gotoJobInfoBtn = findViewById(R.id.gotoJobInfoBtn);

        Intent intent = getIntent();
        String mbti;
        int scores[] =new int[4];

        mbti = intent.getStringExtra("mbti");
        scores = intent.getIntArrayExtra("scores");

        title.setText("당신의 mbti는 "+ mbti +" 입니다." );
        double e = 50+scores[0]*50/12; double i = 100-e;
        double s = 50+scores[1]*50/12; double n = 100-s;
        double t = 50+scores[2]*50/12; double f = 100-t;
        double j = 50+scores[3]*50/12; double p = 100-j;

        String eT = "E : " +String.valueOf(e)+"%";String iT = "I : " +String.valueOf(i)+"%";
        String sT = "S : " +String.valueOf(s)+"%";String nT = "N : " +String.valueOf(n)+"%";
        String tT = "T : " +String.valueOf(t)+"%";String fT = "F : " +String.valueOf(f)+"%";
        String jT = "J : " +String.valueOf(j)+"%";String pT = "P : " +String.valueOf(p)+"%";
        eV.setText(eT);iV.setText(iT);
        sV.setText(sT);nV.setText(nT);
        tV.setText(tT);fV.setText(fT);
        jV.setText(jT);pV.setText(pT);

        gotoJobInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoJobIntent = new Intent(mbti_job_info_test_popup.this,MbtiJobInfo.class);

                gotoJobIntent.putExtra("mbti",mbti);
                mbti_job_info_test_popup.this.startActivity(gotoJobIntent);

            }
        });


        clseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}