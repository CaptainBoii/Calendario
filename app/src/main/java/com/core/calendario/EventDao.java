package com.core.calendario;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface EventDao {

    @Query("SELECT * FROM event")
    List<Event> getAll();

    @Query("SELECT * FROM event WHERE month = :mth")
    List<Event> getByMonth(int mth);

    @Query("SELECT * FROM event WHERE day = :day")
    List<Event> getByDay(int day);

    @Insert
    void insert(Event event);

    @Update
    void update(Event event);

    @Delete
    void delete(Event event);
}
