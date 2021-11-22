package com.example.catbti;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;


public class DBHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "post.db";

    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Post (postNum INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, content TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    //할일 목록을 조회
    public ArrayList<PostItem> getPostList(){
        ArrayList<PostItem> postItems = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Post ORDER BY postNum DESC", null);
        if(cursor.getCount() != 0){
            while(cursor.moveToNext()){
                int postNum = cursor.getInt(cursor.getColumnIndexOrThrow("postNum"));
                String title = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                String content = cursor.getString(cursor.getColumnIndexOrThrow("content"));

                PostItem postItem = new PostItem();
                postItem.setPostNum(postNum);
                postItem.setTitle(title);
                postItem.setContent(content);
                postItems.add(postItem);
            }
        }
        cursor.close();

        return postItems;
    }

    public void InsertPost(String _title, String _content){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Post (title, content) VALUES('" +_title+"','" +_content+"');");
    }

    public void UpdatePost(String _title, String _content, int _postNum){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE Post SET title='"+ _title+"',content='"+ _content+"' WHERE postNum ='"+ _postNum+"'");

    }

    public void DeletePost(int _postNum){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM Post WHERE postNum = '"+ _postNum+"'");
    }
}
