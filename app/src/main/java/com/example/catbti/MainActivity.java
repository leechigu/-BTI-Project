package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mbtiJobButton = findViewById(R.id.mbtiJobButton);

        Button explainMbti = (Button)findViewById(R.id.mbtiButton);
        explainMbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explainMbtiIntent = new Intent(MainActivity.this, ExplainMbti.class);
                MainActivity.this.startActivity(explainMbtiIntent);

            }
        });

        Button boardList = (Button)findViewById(R.id.boardButton);
        boardList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boardListIntent = new Intent(MainActivity.this, BoardList.class);
                MainActivity.this.startActivity(boardListIntent);

            }
        });

        Button testMbti = (Button)findViewById(R.id.testButton);
        testMbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testMbtiIntent = new Intent(MainActivity.this, TestMbti.class);
                MainActivity.this.startActivity(testMbtiIntent);

            }
        });

        mbtiJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mbtiJobIntent = new Intent(MainActivity.this, MbtiJobInfo.class);
                MainActivity.this.startActivity(mbtiJobIntent);
            }
        });

    }

}