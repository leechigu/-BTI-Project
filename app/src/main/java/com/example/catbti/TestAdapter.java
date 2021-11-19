package com.example.catbti;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class TestAdapter extends BaseAdapter {

    private List<Answer> mData;

    public TestAdapter(List<Answer> data) {this.mData = data;}

    public boolean isChecked(int position){
        return mData.get(position).isChecked();

    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.testlist, parent,false);

        TextView answerText = convertView.findViewById(R.id.answer_text);
        RadioGroup radioGroup = convertView.findViewById(R.id.radioGroup);
        Answer answer = mData.get(position);
        answer.setRadioGroup(radioGroup);
        answerText.setText(answer.getAnswer());
        return convertView;


    }

}
