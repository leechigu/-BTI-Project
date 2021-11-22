package com.example.catbti;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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


    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.testlist, parent,false);
        TextView answerText = convertView.findViewById(R.id.answer_text);
        RadioGroup radioGroup = convertView.findViewById(R.id.radioGroup);
        if(mData.get(position).isChecked()==false){
            mData.get(position).setRadioGroup(radioGroup);
            if(mData.get(position).getCheckedNum()>0){
                radioGroup.check(mData.get(position).getCheckedNum());
            }
        }
        else{
            radioGroup.check(mData.get(position).getCheckedNum());
        }

        answerText.setText(mData.get(position).getAnswer());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.rb1){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);

                }
                else if (i==R.id.rb2){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }
                else if(i==R.id.rb3){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }
                else if(i==R.id.rb4){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }
                else if(i==R.id.rb5){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }
                else if(i==R.id.rb6){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }
                else if(i==R.id.rb7){
                    mData.get(position).setChecked(true);
                    mData.get(position).setCheckedNum(i);
                }


            }
        });

        return convertView;

    }

}