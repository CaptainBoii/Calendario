package com.core.calendario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendar;
    TextView date_view;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = (CalendarView) findViewById(R.id.calendar);
        date_view = (TextView) findViewById(R.id.date_view);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                            @Override

                            // In this Listener have one method
                            // and in this method we will
                            // get the value of DAYS, MONTH, YEARS
                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {
                                String Date = (dayOfMonth>9 ? "" : "0")+ dayOfMonth + "-"
                                        + (month>8 ? "" : "0") +(month + 1)
                                        + "-" + year;
                                // set this date in TextView for Display
                                date_view.setText(Date);
                            }
                        });
    }
}