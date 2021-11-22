package com.example.catbti;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private ArrayList<PostItem> postItems;
    private Context mContext;
    private DBHelper mDBHelper;
    private ArrayList<Comment> comments;
    private CommentDBHelper mCommentDBHelper;
    private CommentAdapter mCommentAdapter;


    public PostAdapter(ArrayList<PostItem> postItems, Context mContext) {
        this.postItems = postItems;
        this.mContext = mContext;
        mDBHelper = new DBHelper(mContext);
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.boardlist, parent, false);
        return new ViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        holder.tv_title.setText(postItems.get(position).getTitle());
        holder.tv_content.setText(postItems.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;
        private TextView tv_content;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_content);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int curPos = getAdapterPosition(); //현재 리스트 아이템 위치
                    PostItem postItem = postItems.get(curPos);
                    String[] strChoiceItems = {"상세보기"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setItems(strChoiceItems, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //상세보기
                            if (i==0){

                                Dialog dialog = new Dialog(mContext, android.R.style.Theme_Material_Light_Dialog);
                                dialog.setContentView(R.layout.activity_detail);
                                TextView dtitle_tv = dialog.findViewById(R.id.dtitle_tv);
                                TextView dcontent_tv = dialog.findViewById(R.id.dcontent_tv);

                                dtitle_tv.setText(postItem.getTitle());
                                dcontent_tv.setText(postItem.getContent());

                                Button comment_btn = dialog.findViewById(R.id.comment_btn);
                                comment_btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        Intent intent = new Intent(mContext, CommentActivity.class);
                                        mContext.startActivity(intent);
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
    public void addItem(PostItem _item){
        postItems.add(0, _item);
        notifyItemInserted(0);
    }
}
