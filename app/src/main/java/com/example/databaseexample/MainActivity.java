package com.example.databaseexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

        dbHelper.addContact( "Raman", "9999999999");
        dbHelper.addContact( "Shubham", "8899999999");
        dbHelper.addContact( "Rahul", "7799999999");
        dbHelper.addContact( "Raman", "6699999999");


    }
}