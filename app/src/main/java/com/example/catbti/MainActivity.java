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

    }

}