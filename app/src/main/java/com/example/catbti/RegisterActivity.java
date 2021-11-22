package com.example.catbti;
/*
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class RegisterActivity extends AppCompatActivity {
    private EditText title_et,content_et;


    private TextView title_tv, content_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        title_et = findViewById(R.id.title_et);
        content_et = findViewById(R.id.content_et);
        title_tv = findViewById(R.id.title_tv);
        content_tv = findViewById(R.id.content_tv);

        final AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "registerContent-db")
                .allowMainThreadQueries()
                .build();

        title_et.setText(db.postDao().getAll().toString());

        findViewById(R.id.reg_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                db.postDao().insertRC(new Post(title_et.getText().toString(),content_et.getText().toString()));
            }
        });

    }
*/





