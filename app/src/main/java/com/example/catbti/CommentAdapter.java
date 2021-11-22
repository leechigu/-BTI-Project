package com.example.catbti;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private ArrayList<PostItem> postItems;
    private Context mContext;
    private DBHelper mDBHelper;
    private ArrayList<Comment> comments;
    private CommentDBHelper mCommentDBHelper;


    public CommentAdapter(ArrayList<Comment> comments, Context mContext) {
        this.comments = comments;
        this.mContext = mContext;
        mDBHelper = new DBHelper(mContext);
    }



    @NonNull
    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.commentlist, parent, false);
        return new CommentAdapter.ViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.ViewHolder holder, int position) {
        holder.tv_comment.setText(comments.get(position).getCommentContent());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_comment;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_comment = itemView.findViewById(R.id.tv_comment);
/*
            itemView.setOnClickListener(new View.OnClickListener() {
               @Override
                public void onClick(View view) {
                    int curPos = getAdapterPosition(); //현재 리스트 아이템 위치
                    Comment comment = comments.get(curPos);
                    String[] strChoiceItems = {"댓글 보기"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setItems(strChoiceItems, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //댓글 보기
                            if (i==0){

                                Dialog dialog = new Dialog(mContext, android.R.style.Theme_Material_Light_Dialog);
                                dialog.setContentView(R.layout.activity_comment);

                                TextView comment_tv = dialog.findViewById(R.id.tv_comment);

                                comment_tv.setText(comment.getCommentContent());





                                dialog.dismiss();

                                dialog.show();



                            }
                        }
                    });
                    builder.show();

                }
            }); */
        }

    }

    public void addItem(Comment _item){
        comments.add(0, _item);
        notifyItemInserted(0);
    }
}
