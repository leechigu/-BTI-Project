package com.example.catbti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FunCommentAdapter extends RecyclerView.Adapter<FunCommentAdapter.ViewHolder>{


    private ArrayList<FunPost> fposts;
    private Context mContext;
    private FunPostDBHelper fDBHelper;
    private ArrayList<FunComment> fcomments;
    private FunCommentDBHelper fCommentDB;

    FunCommentAdapter(ArrayList<FunComment> fcomments, Context mContext) {

        this.fcomments = fcomments;
        this.mContext = mContext;
        fCommentDB = new FunCommentDBHelper(mContext);
    }

    @NonNull
    @Override
    public FunCommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.fcommentlist, parent, false);
        return new FunCommentAdapter.ViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.fcommentmbti.setText(fcomments.get(position).getFCommentMbti());
        holder.obj.setText(fcomments.get(position).getCommentObj());

    }

    @Override
    public int getItemCount() {
        return fcomments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView fcommentmbti;
        private TextView obj;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fcommentmbti = itemView.findViewById(R.id.tv_fmbti);
            obj = itemView.findViewById(R.id.tv_fcommentobj);

        }

    }

    public void addItem(FunComment item){
        fcomments.add(0, item);
        notifyItemInserted(0);
    }
}