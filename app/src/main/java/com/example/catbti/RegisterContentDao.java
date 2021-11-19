package com.example.catbti;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RegisterContentDao {
    @Query("SELECT * FROM RegisterContent")
    List<RegisterContent> getAll();

    @Insert
    void insertRC(RegisterContent registerContent);

    @Update
    void updateRC(RegisterContent registerContent);

    @Delete
    void deleteRC(RegisterContent registerContent);
}
