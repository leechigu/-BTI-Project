package com.example.catbti;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PostDao {
    @Query("SELECT * FROM Post")
    List<Post> getAll();
    @Insert
    void insertRC(Post post);
    @Update
    void updateRC(Post post);
    @Delete
    void deleteRC(Post post);

}
