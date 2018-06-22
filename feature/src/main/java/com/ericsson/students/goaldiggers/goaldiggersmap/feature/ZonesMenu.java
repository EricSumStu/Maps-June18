package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;


public class ZonesMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zones_menu);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone1.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone2.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone3.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone4.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone5.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone6.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone7.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone8.class);
                startActivityForResult(myIntent, 0);

            }

        });

        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityZone9.class);
                startActivityForResult(myIntent, 0);

            }

        });

    }
}
