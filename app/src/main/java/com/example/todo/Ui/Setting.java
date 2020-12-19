package com.example.todo.Ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todo.databinding.ActivitySettingBinding;

public class Setting extends AppCompatActivity {

    private static final String TAG = "Setting_Activity";
    private ActivitySettingBinding binding;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("Settings");
        Log.d(TAG, "oncreate .");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}

