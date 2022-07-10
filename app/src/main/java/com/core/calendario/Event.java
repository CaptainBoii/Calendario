package com.core.calendario;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "event")
public class Event {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name="day")
    private int day;

    @ColumnInfo(name="month")
    private int month;

    @ColumnInfo(name="year")
    private int year;

    @ColumnInfo(name="hour")
    private int hour;

    @ColumnInfo(name="minute")
    private int minute;

    @ColumnInfo(name="daily")
    private boolean daily;

    @ColumnInfo(name="weekly")
    private boolean weekly;

    @ColumnInfo(name="monthly")
    private boolean monthly;

    @ColumnInfo(name="yearly")
    private boolean yearly;

    @ColumnInfo(name="reminder")
    private int reminder;

}
