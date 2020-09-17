package com.sejin.classbell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title =findViewById(R.id.title);
        table =findViewById(R.id.tableLayout);
    }

    public void addClass(View view) {
        Intent intent = new Intent(MainActivity.this,AddClassActivity.class);
        startActivity(intent);
    }
}