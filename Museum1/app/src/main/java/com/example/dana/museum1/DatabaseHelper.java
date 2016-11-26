package com.example.dana.museum1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Džana on 26.11.2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static  final String DATABASE_NAME="Museum.db";
    public static  final String TABLE_NAME="gallery_table";
    public static  final String COL_1="id";
    public static  final String COL_2="image";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table gallery_table (id integer primary key autoincrement, image blob)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
