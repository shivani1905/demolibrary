package com.milople.my_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.milople.mylibrary.SampleFragment;

public class MainActivity extends AppCompatActivity {
    SampleFragment sample=new SampleFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frmlayout,sample);
        ft.commit();
    }
}