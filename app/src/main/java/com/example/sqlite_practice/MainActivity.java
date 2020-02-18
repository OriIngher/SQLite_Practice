package com.example.sqlite_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    HelperDB hlp;
    EditText studname, studphone, homephone, address, momsname, dadsname, dadsphone, momsphone;
    EditText gradesubj, gradenum,quarter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studname = findViewById(R.id.studname);
        studphone = findViewById(R.id.phonenumber);
        homephone = findViewById(R.id.homephone);
        address = findViewById(R.id.address);
        momsname = findViewById(R.id.momsname);
        momsphone = findViewById(R.id.momsphone);
        dadsname = findViewById(R.id.dadsname);
        dadsphone = findViewById(R.id.dadsphone) ;

        gradesubj = findViewById(R.id.gradesubj);
        gradenum = findViewById(R.id.grade);
        quarter = findViewById(R.id.quarter);

        hlp = new HelperDB(this);


    }


    public void enterStudentData(View view) {

    }

    public void enterGradeData(View view) {
    }
}
