package com.example.catbti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class FunCommentResult extends AppCompatActivity {


    private FunCommentDBHelper fCommentDBHelper;
    private ArrayList<FunComment> fComments;
    //int enfj =0; int entp =1; int enfp =2; int entj =3;
    //int infj = 4; int intj = 5; int intp =6; int infp = 7;
   // int esfj =8; int estj =9; int esfp =10; int estp =11;
   // int isfj =12; int isfp = 13;int istj =14;int istp = 15;

    int mbtiarr1[] = new int[16];
    int mbtiarr2[] = new int[16];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_comment_result);
        fCommentDBHelper = new FunCommentDBHelper(this);

        for(int i = 0;i<16;i++){
            mbtiarr1[i] =0;
            mbtiarr2[i] =0;
        }
        Intent intent = getIntent();
        int postNum = intent.getExtras().getInt("res_postNum");
        String obj1 = intent.getExtras().getString("res_obj1");
        String obj2 = intent.getExtras().getString("res_obj2");

        TextView enfj1 = findViewById(R.id.enfj1);TextView entp1 = findViewById(R.id.entp1);
        TextView enfp1 = findViewById(R.id.enfp1);TextView entj1 = findViewById(R.id.entj1);
        TextView infj1 = findViewById(R.id.infj1);TextView intj1 = findViewById(R.id.intj1);
        TextView intp1 = findViewById(R.id.intp1);TextView infp1 = findViewById(R.id.infp1);
        TextView esfj1 = findViewById(R.id.esfj1);TextView estj1 = findViewById(R.id.estj1);
        TextView esfp1 = findViewById(R.id.esfp1);TextView estp1 = findViewById(R.id.estp1);
        TextView isfj1 = findViewById(R.id.isfj1);TextView isfp1 = findViewById(R.id.isfp1);
        TextView istj1 = findViewById(R.id.istj1);TextView istp1 = findViewById(R.id.istp1);


        TextView enfj2 = findViewById(R.id.enfj2);TextView entp2 = findViewById(R.id.entp2);
        TextView enfp2 = findViewById(R.id.enfp2);TextView entj2 = findViewById(R.id.entj2);
        TextView infj2 = findViewById(R.id.infj2);TextView intj2 = findViewById(R.id.intj2);
        TextView intp2 = findViewById(R.id.intp2);TextView infp2 = findViewById(R.id.infp2);
        TextView esfj2 = findViewById(R.id.esfj2);TextView estj2  = findViewById(R.id.estj2);
        TextView esfp2 = findViewById(R.id.esfp2);TextView estp2 = findViewById(R.id.estp2);
        TextView isfj2 = findViewById(R.id.isfj2);TextView isfp2 = findViewById(R.id.isfp2);
        TextView istj2 = findViewById(R.id.istj2);TextView istp2 = findViewById(R.id.istp2);


        fComments = fCommentDBHelper.getPostCommentList(postNum);

        for(int i = 0 ;i<fComments.size();i++){
            if(fComments.get(i).getFCommentMbti().equals("enfj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[0]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[0]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("entp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[1]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[1]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("enfp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[2]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[2]++;
                }

            }
            else if(fComments.get(i).getFCommentMbti().equals("entj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[3]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[3]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("infj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[4]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[4]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("intj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[5]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[5]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("intp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[6]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[6]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("infp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[7]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[7]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("esfj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[8]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[8]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("estj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[9]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[9]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("esfp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[10]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[10]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("estp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[11]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[11]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("isfj")) {
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[12]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[12]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("isfp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[13]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[13]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("istj")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[14]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[14]++;
                }
            }
            else if(fComments.get(i).getFCommentMbti().equals("istp")){
                if(fComments.get(i).getCommentObj().equals(obj1)){
                    mbtiarr1[15]++;
                }
                else if(fComments.get(i).getCommentObj().equals(obj2)){
                    mbtiarr2[15]++;
                }
            }
        }

        enfj1.setText(mbtiarr1[0]);enfj2.setText(mbtiarr2[0]);
        entp1.setText(mbtiarr1[1]);entp2.setText(mbtiarr2[1]);
        enfp1.setText(mbtiarr1[2]);enfp2.setText(mbtiarr2[2]);
        entj1.setText(mbtiarr1[3]);entj2.setText(mbtiarr2[3]);
        infj1.setText(mbtiarr1[4]);infj2.setText(mbtiarr2[4]);
        intj1.setText(mbtiarr1[5]);intj2.setText(mbtiarr2[5]);
        intp1.setText(mbtiarr1[6]);intp2.setText(mbtiarr2[6]);
        infp1.setText(mbtiarr1[7]);infp2.setText(mbtiarr2[7]);
        esfj1.setText(mbtiarr1[8]);esfj2.setText(mbtiarr2[8]);
        estj1.setText(mbtiarr1[9]);estj2.setText(mbtiarr2[9]);
        esfp1.setText(mbtiarr1[10]);esfp2.setText(mbtiarr2[10]);
        estp1.setText(mbtiarr1[11]);estp2.setText(mbtiarr2[11]);
        isfj1.setText(mbtiarr1[12]);isfj2.setText(mbtiarr2[12]);
        isfp1.setText(mbtiarr1[13]);isfp2.setText(mbtiarr2[13]);
        istj1.setText(mbtiarr1[14]);istj2.setText(mbtiarr2[14]);
        istp1.setText(mbtiarr1[15]);istp2.setText(mbtiarr2[15]);


    }


}
