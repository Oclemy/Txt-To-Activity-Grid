package com.tutorials.hp.txttoactivitygrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class SecondActivity extends AppCompatActivity {

    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gv= (GridView) findViewById(R.id.gv);
        gv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DataHolder.spacecrafts));
    }
}
