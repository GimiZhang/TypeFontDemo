package com.example.administrator.typefontdemo;

import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconFontLayoutInflater(getDelegate(), this));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
