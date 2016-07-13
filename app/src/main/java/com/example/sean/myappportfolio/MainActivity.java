package com.example.sean.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies_OnClick(View view)
    {
        showToast("This button will launch my Popular Movies app!");
    }

    public void stockHawk_OnClick(View view)
    {
        showToast("This button will launch my Stock Hawk app!");
    }

    public void buildItBigger_OnClick(View view)
    {
        showToast("This button will launch my Build it Bigger app!");
    }

    public void makeYourAppMaterial_OnClick(View view)
    {
        showToast("This button will launch my Material app!");
    }

    public void goUbiquitous_OnClick(View view)
    {
        showToast("This button will launch my Go Ubiquitous app!");
    }

    public void capstone_OnClick(View view)
    {
        showToast("This button will launch my Capstone app!");
    }

    public void showToast(String toastText)
    {
        Toast toast = Toast.makeText(getApplicationContext()
                ,toastText,Toast.LENGTH_LONG);
        toast.show();
    }
}
