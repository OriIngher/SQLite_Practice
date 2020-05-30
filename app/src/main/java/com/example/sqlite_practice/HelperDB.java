package com.example.sqlite_practice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.sqlite_practice.Grades.GRADE;
import static com.example.sqlite_practice.Grades.NAMES;
import static com.example.sqlite_practice.Grades.QUARTER;
import static com.example.sqlite_practice.Grades.TABLE_GRADES;
import static com.example.sqlite_practice.Users.ADDRESS;
import static com.example.sqlite_practice.Users.DAD_NAME;
import static com.example.sqlite_practice.Users.DAD_NUM;
import static com.example.sqlite_practice.Users.HOME_P;
import static com.example.sqlite_practice.Users.KEY_ID;
import static com.example.sqlite_practice.Users.MOM_NAME;
import static com.example.sqlite_practice.Users.MOM_NUM;
import static com.example.sqlite_practice.Users.NAME;
import static com.example.sqlite_practice.Users.PHONE;
import static com.example.sqlite_practice.Users.TABLE_USERS;


public class HelperDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbexam.db";
    private static final int DATABASE_VERSION = 1;
    String strCreate, strDelete;

    public HelperDB(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        strCreate="CREATE TABLE "+TABLE_USERS;
        strCreate+=" ("+KEY_ID+" INTEGER PRIMARY KEY,";
        strCreate+=" "+NAME+" TEXT,";
        strCreate+=" "+ADDRESS+" TEXT,";
        strCreate+=" "+PHONE+" INTEGER,";
        strCreate+=" "+HOME_P+" INTEGER,";
        strCreate+=" "+MOM_NAME+" TEXT,";
        strCreate+=" "+MOM_NUM+" INTEGER,";
        strCreate+=" "+DAD_NAME+" TEXT,";
        strCreate+=" "+DAD_NUM+" INTEGER";
        strCreate+=");";
        db.execSQL(strCreate);

        strCreate="CREATE TABLE " + TABLE_GRADES;
        strCreate+=" ("+KEY_ID+" INTEGER PRIMARY KEY,";
        strCreate+=" "+NAMES+" TEXT,";
        strCreate+=" "+QUARTER+" INTEGER,";
        strCreate+=" "+GRADE+" INTEGER";
        strCreate+=");";
        db.execSQL(strCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        strDelete = "DROP TABLE IF EXISTS "+ TABLE_USERS;
        db.execSQL(strDelete);

        strDelete = "DROP TABLE IF EXISTS "+ TABLE_GRADES;
        db.execSQL(strDelete);

        onCreate(db);

    }
}