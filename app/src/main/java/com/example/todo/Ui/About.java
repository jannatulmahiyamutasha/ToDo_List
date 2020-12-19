package com.example.todo.Ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todo.R;
import com.example.todo.databinding.ActivityAboutBinding;

public class About extends AppCompatActivity implements View.OnClickListener {

    private ActivityAboutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.facebook.setOnClickListener(this);
        binding.email.setOnClickListener(this);
        binding.instragam.setOnClickListener(this);
        binding.github.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //link with Facebook
        if (v.getId() == R.id.facebook) {

            try {
                getPackageManager()
                        .getPackageInfo("com.example.todo", 0); //Checks if FB is even installed.
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/jannatulmahiya.maliha/")));  //Trys to make intent with FB's URI
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/jannatulmahiya.maliha/"))); //catches and opens a url to the desired page
            }

        }
        //link with Email
        else if (v.getId() == R.id.email) {

            try {
                getPackageManager()
                        .getPackageInfo("com.example.todo", 0); //Checks if Email is even installed.
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://mail.google.com/mail/u/0/#inbox"))); //Trys to make intent with Email's URI
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://mail.google.com/mail/u/0/#inbox"))); //catches and opens a url to the desired page
            }

        }
        //link with Instragram
        else if (v.getId() == R.id.instragam) {

            try {
                getPackageManager()
                        .getPackageInfo("com.example.todo", 0); //Checks if Instagram is even installed.
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/"))); //Trys to make intent with Instagram's URI
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/"))); //catches and opens a url to the desired page
            }

        }
        //link with Github
        else {

            try {
                getPackageManager()
                        .getPackageInfo("com.example.todo", 0); //Checks if Github is even installed.
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/"))); //Trys to make intent with Github's URI
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/"))); //catches and opens a url to the desired page
            }
        }

   }
}
