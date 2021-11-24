package com.example.catbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class mbti_job_info_popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView(R.layout.activity_mbti_job_info_popup);

        TextView titleText = (TextView)findViewById(R.id.testpopTitleText);
        TextView jobInfoText = findViewById(R.id.testIText);
        Button closeBtn = findViewById(R.id.testPopupCloseBtn);

        Intent intent = getIntent();
        String mbti = intent.getStringExtra("mbti");
        String jobName = intent.getStringExtra("jobName");
        titleText.setText(" "+mbti+"와 어울리는 직업 : "+jobName);


        if(jobName.equals("교사")){
            String teacher = " 선생님직업의 특성은....";
            jobInfoText.setText(teacher);
        }

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });













    }
}