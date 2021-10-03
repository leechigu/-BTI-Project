package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_list);
        Button registerPost = (Button)findViewById(R.id.registerButton);
        registerPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerPostIntent = new Intent(BoardList.this, RegisterPost.class);
                BoardList.this.startActivity(registerPostIntent);

            }
        });

    }
}