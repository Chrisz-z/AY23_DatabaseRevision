package com.myapplicationdev.databaserevision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InsertActivity extends AppCompatActivity {

    Button btnInsert;
    EditText etContent, etPriority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        btnInsert = findViewById(R.id.btnInsert);
        etContent = findViewById(R.id.etContent);
        etPriority = findViewById(R.id.etPriority);

        btnInsert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Create the DBHelper object, passing in the activity's Context
                DBHelper db = new DBHelper(InsertActivity.this);


                db.insertTask(etContent.getText().toString(),Integer.parseInt(etPriority.getText().toString()));
                db.close();
                finish();

                Toast.makeText(InsertActivity.this, "Note added", Toast.LENGTH_SHORT).show();
            }
        });


    }
}