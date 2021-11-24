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
        mCommentDBHelper = new CommentDBHelper(mContext);

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
        holder.tv_mbti.setText(comments.get(position).getCommentMbti());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_comment;
        private TextView tv_mbti;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_comment = itemView.findViewById(R.id.tv_comment);
            tv_mbti = itemView.findViewById(R.id.tv_mbti);

        }

    }

    public void addItem(Comment _item){
        comments.add(0, _item);
        notifyItemInserted(0);
    }
}
