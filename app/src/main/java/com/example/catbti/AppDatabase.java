package com.example.catbti;
/*
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Post.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE = null;

    public abstract PostDao postDao();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context,AppDatabase.class,"post-db")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;

    }
    public static void destroyInstance(){
        INSTANCE = null;
    };


}
*/