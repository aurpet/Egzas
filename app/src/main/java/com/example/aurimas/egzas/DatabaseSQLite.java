package com.example.aurimas.egzas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseSQLite extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "db";

    private static final String TABLE_MENIU = "meniu";
    private static final String ID = "id";
    private static final String DISH_GROUP = "group";
    private static final String NAME = "name";
    private static final String CALORIES = "calories";
    private static final String PRICE = "price";

    public DatabaseSQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MENIU_TABLE = "CREATE TABLE " + TABLE_MENIU + "("
                + ID + " INTEGER PRIMARY KEY, "
                + DISH_GROUP + "TEXT,"
                + NAME + " TEXT,"
                + CALORIES + " TEXT,"
                + PRICE + " )";


        db.execSQL(CREATE_MENIU_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MENIU);

        onCreate(db);
    }

    void addMeniu(Meniu meniu) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DISH_GROUP, meniu.getGroup());
        values.put(CALORIES, meniu.getCalories());
        values.put(PRICE, meniu.getPrice());
    }
}
