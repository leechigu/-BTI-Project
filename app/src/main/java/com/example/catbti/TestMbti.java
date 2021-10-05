package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TestMbti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mbti);
        ArrayList<Answer> data = new ArrayList<>();
        data.add(new Answer("answer1"));
        data.add(new Answer("answer2"));
        data.add(new Answer("answer3"));
        data.add(new Answer("answer4"));
        data.add(new Answer("answer5"));
        data.add(new Answer("answer6"));
        data.add(new Answer("answer7"));
        data.add(new Answer("answer8"));
        data.add(new Answer("answer9"));
        data.add(new Answer("answer10"));
        data.add(new Answer("answer11"));
        data.add(new Answer("answer12"));


        TestAdapter adapter = new TestAdapter(data);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }




}