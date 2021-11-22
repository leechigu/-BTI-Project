package com.example.catbti;

import android.provider.MediaStore;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Answer {

    private String answer;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    boolean checked =false;
    private int checkedNum =-1;
    public void setRadioGroup(RadioGroup radioGroup){
        this.radioGroup = radioGroup;
    }

    public int getCheckedNum(){
        return checkedNum;
    }

    public void setChecked(boolean c){
        checked =c;
    }

    public RadioGroup getRadioGroup(){
        return radioGroup;
    }

    public Answer(String answer){
        this.answer = answer;checked = false;
    }
    public void setCheckedNum(int i){
        checkedNum =i;
    }
    public String getAnswer(){return answer;}

    public void setAnswer(String answer) {this.answer = answer;}

    @Override
    public String toString(){
        return answer;
    }


    public boolean isChecked(){
        return checked;
    }
}
