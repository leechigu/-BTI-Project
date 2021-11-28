package com.example.catbti;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FunPostAdapter extends RecyclerView.Adapter<FunPostAdapter.ViewHolder>{

    private int pNum;
    private ArrayList<FunPost> fposts;
    private Context mContext;
    private FunPostDBHelper fDBHelper;
    private ArrayList<FunComment> fcomments;
    private FunCommentDBHelper fCommentDBHelper;
    private FunCommentAdapter fCommentAdapter;

    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    public FunPostAdapter(ArrayList<FunPost> fposts, Context mContext) {
        this.fposts = fposts;
        this.mContext = mContext;
        fDBHelper = new FunPostDBHelper(mContext);
    }

    @NonNull
    @Override
    public FunPostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.fpostlist, parent, false);
        return new FunPostAdapter.ViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull FunPostAdapter.ViewHolder holder, int position) {
        holder.title.setText(fposts.get(position).getTitle());
        holder.contents.setText(fposts.get(position).getContents());

    }

    @Override
    public int getItemCount() {
        return fposts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView contents;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_ftitle);
            contents = itemView.findViewById(R.id.tv_fcontents);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int curPos = getAdapterPosition(); //현재 리스트 아이템 위치
                    FunPost fpost = fposts.get(curPos);
                    String[] strChoiceItems = {"상세보기"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setItems(strChoiceItems, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //상세보기
                            if (i==0){

                                Dialog dialog = new Dialog(mContext, android.R.style.Theme_Material_Light_Dialog);
                                dialog.setContentView(R.layout.activity_fpost_detail);
                                TextView fpostTitle = dialog.findViewById(R.id.dfposttitle);
                                TextView fpostContents = dialog.findViewById(R.id.dfpostContents);
                                TextView obj1 = dialog.findViewById(R.id.fCommentObj1);
                                TextView obj2 = dialog.findViewById(R.id.fCommentObj2);


                                fpostTitle.setText(fpost.getTitle());
                                fpostContents.setText(fpost.getContents());
                                obj1.setText(fpost.getObj1());
                                obj2.setText(fpost.getObj2());


                                Button fcomment_btn = dialog.findViewById(R.id.fcomment_btn);
                                Button fcommentresultBtn = dialog.findViewById(R.id.fcommentresultBtn);


                                fcomment_btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        //Intent testFinishIntent = new Intent(TestMbti.this,mbti_job_info_test_popup.class);
                                        Intent fcommentinsIntent = new Intent(mContext,  fCommentRegister.class);
                                        fcommentinsIntent.putExtra("postNum",fpost.getPostNum());
                                        fcommentinsIntent.putExtra("obj1",fpost.getObj1());
                                        fcommentinsIntent.putExtra("obj2",fpost.getObj2());
                                        mContext.startActivity(fcommentinsIntent);
                                    }
                                });
                                fcommentresultBtn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent fcresIntent = new Intent(mContext,  fCommentRegister.class);
                                        fcresIntent.putExtra("res_postNum",fpost.getPostNum());
                                        fcresIntent.putExtra("res_obj1",fpost.getObj1());
                                        fcresIntent.putExtra("res_obj2",fpost.getObj2());
                                        mContext.startActivity(fcresIntent);

                                    }
                                });



                                dialog.dismiss();
                                dialog.show();

                            }

                        }
                    });
                    builder.show();

                }
            });
        }

    }
    //엑티비티에서 호출되는 함수이며 ,현재 어댑터에 ㅅ ㅐ로운 게시글 아이템을 전달받아 추가하는 목적.
    public void addItem(FunPost item){
        fposts.add(0, item);
        notifyItemInserted(0);
    }




}