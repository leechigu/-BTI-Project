package com.example.catbti;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Post {
    @PrimaryKey(autoGenerate = true)
    private int postId;

    @NonNull
    private String title;
    private String content;

    public Post( String title, String content){

        this.title=title;
        this.content =content;
    }
    public void setPostId(int id){
        this.postId = id;
    }
    public int getPostId(){
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




}
