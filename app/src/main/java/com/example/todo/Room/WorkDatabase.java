package com.example.todo.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.todo.Interface.WorkDao;
import com.example.todo.Model.Work;


@Database(entities = {Work.class}, version = 1,exportSchema = false)
public abstract class WorkDatabase extends RoomDatabase {

    private static WorkDatabase instance;
    public abstract WorkDao workDao();

    public static synchronized WorkDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    WorkDatabase.class, "work_database")
                    .fallbackToDestructiveMigration()
                
                    .build();

        }

        return instance;
    }

}
