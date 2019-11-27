package com.example.threadclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {2, 4, 5, 45, 67, 8};
        int i;
        for (i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
