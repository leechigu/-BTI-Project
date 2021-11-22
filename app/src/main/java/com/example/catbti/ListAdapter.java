package com.example.catbti;
/*
import android.annotation.SuppressLint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    ArrayList<Post> lists;


    public ListAdapter(List<Post> data) {this.lists= (ArrayList<Post>) data;}

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Context c = parent.getContext();
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.boardlist, parent,false);

        // if(convertView == null){
        // LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // convertView = li.inflate(R.layout.boardlist, parent, false);
        //   }
        TextView postTitle = convertView.findViewById(R.id.board_tv);
        Post post = lists.get(position);
        postTitle.setText(post.getTitle().toString());
        return convertView;
    }


}*/