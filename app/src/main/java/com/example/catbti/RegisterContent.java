package com.example.catbti;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

@Entity
public class RegisterContent {

//    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
  //  String ID = user.getEmail();

    @PrimaryKey()
    @NonNull
    private String title;
    private String content;

    public RegisterContent(String title, String content){
        this.title=title;
        this.content =content;
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
