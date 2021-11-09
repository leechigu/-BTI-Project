package com.example.catbti;

import android.widget.RadioGroup;

public class Answer {

    private String answer;
    private RadioGroup radioGroup;


    public void setRadioGroup(RadioGroup radioGroup){
        this.radioGroup = radioGroup;
    }

    public RadioGroup getRadioGroup(){
        return radioGroup;
    }

    public Answer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){return answer;}

    public void setAnswer(String answer) {this.answer = answer;}

    @Override
    public String toString(){
        return answer;
    }

}
