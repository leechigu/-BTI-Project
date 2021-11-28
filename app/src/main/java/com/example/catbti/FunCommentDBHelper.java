package com.example.catbti;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FunCommentDBHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "funcomment.db3";


    public FunCommentDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS FunComment (funCommentNum INTEGER PRIMARY KEY AUTOINCREMENT, funPostNum INTEGER NOT NULL , funCommentObj TEXT NOT NULL, funCommentMbti TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }


    public ArrayList<FunComment> getPostCommentList(int postNum) {
        ArrayList<FunComment> funComments = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String temp = "SELECT * FROM FunComment WHERE funPostNum = %d ORDER BY commentNum DESC ";
        String fmt = String.format(temp,postNum);
        Cursor cursor = db.rawQuery(fmt, null);
        if (cursor.getCount() != 0) {
            while (cursor.moveToNext()) {
                int funCommentNum = cursor.getInt(cursor.getColumnIndexOrThrow("funCommentNum"));
                int funPostNum = cursor.getInt(cursor.getColumnIndexOrThrow("funPostNum"));
                String obj = cursor.getString(cursor.getColumnIndexOrThrow("funCommentObj"));
                String mbti = cursor.getString(cursor.getColumnIndexOrThrow("funCommentMbti"));
                FunComment funComment = new FunComment();
                funComment.setCommentNum(funCommentNum);
                funComment.setPostCommentNum(funPostNum);
                funComment.setCommentObj(obj);
                funComment.setFCommentMbti(mbti);

                funComments.add(funComment);
            }
        }
        cursor.close();
        return funComments;
    }


    public void InsertComment(int funPostNum,String obj,String mbti) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO FunComment (funPostNum,funCommentObj,funCommentMbti) VALUES('"+funPostNum+"','"+obj+"','"+mbti+"');");

    }

}