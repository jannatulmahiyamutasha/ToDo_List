package com.example.todo.Room;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todo.Model.Work;

import java.util.List;

public class WorkViewModel extends AndroidViewModel {
    private WorkRepository workRepository;
    private LiveData<List<Work>> allWorks;

    public WorkViewModel(@NonNull Application application) {
        super(application);
        workRepository = new WorkRepository(application);
        allWorks = workRepository.getAllworkes();

    }

    public void insert(Work work) {
        workRepository.insert(work);
    }

    public void update(Work work) {
        workRepository.update(work);
    }

    public void delete(Work work) {
        workRepository.delete(work);
    }

    public void deleteallworks() {
        workRepository.deleteallwork();
    }

    public LiveData<List<Work>> getAllWorks() {
        return allWorks;
    }


}

