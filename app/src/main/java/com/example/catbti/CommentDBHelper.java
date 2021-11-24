package com.example.catbti;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CommentDBHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "comment.db3";



    public CommentDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Comment (commentNum INTEGER , commentContent TEXT NOT NULL, commentMbti TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    //할일 목록을 조회
    public ArrayList<Comment> getCommentList(){
        ArrayList<Comment> comments = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Comment ORDER BY commentNum DESC ", null);
        if(cursor.getCount() != 0){
            while(cursor.moveToNext()){

                int commentNum = cursor.getInt(cursor.getColumnIndexOrThrow("commentNum"));
                String commentContent = cursor.getString(cursor.getColumnIndexOrThrow("commentContent"));
                String commentMbti = cursor.getString(cursor.getColumnIndexOrThrow("commentMbti"));
                Comment comment = new Comment();
                comment.setCommentNum(commentNum);
                comment.setCommentContent(commentContent);
                comment.setCommentMbti(commentMbti);
                comments.add(comment);
            }
        }
        cursor.close();

        return comments;
    }

    public void InsertComment(int _commentNum, String _content, String _mbti){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Comment (commentNum,commentContent, commentMbti) VALUES('" +_commentNum+"','" +_content+"','" +_mbti+"');");
    }
/*
    public void UpdatePost(String _title, String _content, int _postNum){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE Post SET title='"+ _title+"',content='"+ _content+"' WHERE postNum ='"+ _postNum+"'");

    }

    public void DeletePost(int _postNum){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM Post WHERE postNum = '"+ _postNum+"'");
    }*/
}
