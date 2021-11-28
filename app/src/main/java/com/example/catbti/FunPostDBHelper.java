package com.example.catbti;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FunPostDBHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "FunPost.db";


    public FunPostDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS FunPost (funPostNum INTEGER PRIMARY KEY AUTOINCREMENT, funPostTitle TEXT NOT NULL, funPostContents TEXT NOT NULL, funPostObj1 TEXT NOT NULL, funPostObj2 NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }


    public ArrayList<FunPost> getAllPostList(){
        ArrayList<FunPost> funPosts = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM FunPost ORDER BY funpostNum DESC", null);
        if(cursor.getCount() != 0){
            while(cursor.moveToNext()){
                int funPostNum = cursor.getInt(cursor.getColumnIndexOrThrow("funPostNum"));
                String title = cursor.getString(cursor.getColumnIndexOrThrow("funPostTitle"));
                String contents = cursor.getString(cursor.getColumnIndexOrThrow("funPostContents"));
                String obj1 = cursor.getString(cursor.getColumnIndexOrThrow("funPostObj1"));
                String obj2 = cursor.getString(cursor.getColumnIndexOrThrow("funPostObj2"));
                FunPost funpost = new FunPost();
                funpost.setPostNum(funPostNum);
                funpost.setTitle(title);
                funpost.setContents(contents);
                funpost.setObj1(obj1);
                funpost.setObj2(obj2);
                funPosts.add(funpost);
            }
        }
        cursor.close();

        return funPosts;
    }


    public void InsertPost(String title,String contents,String obj1,String obj2){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO FunPost (funPostTitle,funPostContents,funPostObj1,funPostObj2 ) VALUES('" +title+"','" +contents+"','" +obj1+"','"+obj2+"');");
    }
}
