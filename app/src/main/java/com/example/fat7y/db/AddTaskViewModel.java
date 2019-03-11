package com.example.fat7y.db;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDatabase database, int id) {

        task=database.taskDao().loadTaskById(id);
    }


    public LiveData<TaskEntry> getTask() {
        return task;
    }



}
