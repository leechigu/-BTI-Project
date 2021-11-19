package com.example.catbti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private List<Post> mData;

    public PostAdapter(List<Post> data) {this.mData = data;}

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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context c = parent.getContext();
        if(convertView == null){
            LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.boardlist, parent, false);
        }
        TextView answerText = convertView.findViewById(R.id.answer_text);
        RadioGroup radioGroup = convertView.findViewById(R.id.radioGroup);
        Post post = mData.get(position);

        return convertView;

    }
}
