package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class GroundFloorFunctions extends AppCompatActivity  {

// define spinner

    Spinner sp ;

    View PINKLINE,PINKLINE2,PINKLINE3,PINKLINE4,PINKLINE5;
    View image4,image5,image6,image8,image9,image10;

    //DEFINE TEXT VIEW

    TextView display_data ;

    //make string Arrary

    String names[] = {"----Select----","Athlone","Lars Magnus","Coffee Docks","Clear All"};

    //defins array adapter of string type

    ArrayAdapter <String> adapter;

    //define string variable for record

    String record= "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_groundfloorfunctons);

        sp = (Spinner)findViewById(R.id.spinner);

//        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        display_data = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        sp.setAdapter(adapter);


        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FirstFloorFunctions.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainMenu.class);
                startActivityForResult(myIntent, 0);
            }

        });



        PINKLINE = (View)findViewById(R.id.line1);
        PINKLINE2 = (View)findViewById(R.id.line2);
        PINKLINE3 = (View)findViewById(R.id.line3);
        PINKLINE4 = (View)findViewById(R.id.line4);




        image4 = (ImageView)findViewById(R.id.imageView4);
        image5 = (ImageView)findViewById(R.id.imageView5);
        image6 = (ImageView)findViewById(R.id.imageView6);
        image8 = (ImageView)findViewById(R.id.imageView8);
        image9 = (ImageView)findViewById(R.id.imageView9);
        image10 = (ImageView)findViewById(R.id.imageView10);




        //set spinner method

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "----Select----";

                        break;

                    case 1:

                        record = "Athlone";

                        break;

                    case 2:

                        record = "Lars Magnus";

                        break;

                    case 3:

                        record = "Coffee Docks";
                        break;

                    case 4:

                        record = "Clear All";

                        break;

                }

                diplsyResult(view);

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    //set display button click to show result

    public void diplsyResult(View view)

    {



        display_data.setTextSize(18);
        display_data.setText(record);


        if (record.equals("Athlone"))

        {


            //Hiding sample button.
           PINKLINE.setVisibility(View.INVISIBLE);

            PINKLINE2.setVisibility(View.VISIBLE);


            PINKLINE3.setVisibility(View.VISIBLE);
            PINKLINE4.setVisibility(View.VISIBLE);

    }




        if (record.equals("Lars Magnus"))

        {

            //Hiding sample button.
            PINKLINE.setVisibility(View.VISIBLE);
            PINKLINE2.setVisibility(View.VISIBLE);

            PINKLINE3.setVisibility(View.INVISIBLE);
            PINKLINE4.setVisibility(View.INVISIBLE);
        }

        if (record.equals("Coffee Docks")){

            PINKLINE.setVisibility(View.INVISIBLE);
            PINKLINE2.setVisibility(View.INVISIBLE);

            PINKLINE3.setVisibility(View.INVISIBLE);
            PINKLINE4.setVisibility(View.INVISIBLE);

            image4.setVisibility(View.VISIBLE);
            image5.setVisibility(View.VISIBLE);
            image6.setVisibility(View.VISIBLE);
            image8.setVisibility(View.VISIBLE);
            image9.setVisibility(View.VISIBLE);
            image10.setVisibility(View.VISIBLE);

    }




        if (record.equals("Clear All"))

        {


            //Hiding sample button.
            PINKLINE.setVisibility(View.INVISIBLE);
            PINKLINE2.setVisibility(View.INVISIBLE);
            PINKLINE3.setVisibility(View.INVISIBLE);
            PINKLINE4.setVisibility(View.INVISIBLE);



            image4.setVisibility(View.INVISIBLE);
            image5.setVisibility(View.INVISIBLE);
            image6.setVisibility(View.INVISIBLE);
            image8.setVisibility(View.INVISIBLE);
            image9.setVisibility(View.INVISIBLE);
            image10.setVisibility(View.INVISIBLE);

        }

    }

}