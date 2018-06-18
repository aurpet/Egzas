package com.example.aurimas.egzas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatabaseSQLite db;

    Meniu pradinisPatiekalas;
    Meniu naujasPatiekalas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Meniu");

        db = new DatabaseSQLite(MainActivity.this);

        final EditText group = (EditText) findViewById(R.id.group);
        final EditText foodName = (EditText) findViewById(R.id.name);
        final EditText calories = (EditText) findViewById(R.id.calories);
        final EditText price = (EditText) findViewById(R.id.price);

        Button btnAdd = (Button) findViewById(R.id.prideti);


        naujasPatiekalas = new Meniu();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.addMeniu(naujasPatiekalas);

            }
        });
    }
}

