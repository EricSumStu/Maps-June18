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

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.chrisbanes.photoview.PhotoView;

public class GroundFloorFunctions extends AppCompatActivity  {

// define spinner

    Spinner sp ;

    //DEFINE TEXT VIEW

    TextView display_data ;

    //make string Arrary

    String names[] = {"-----Select-----","Coffee Docks","Toilets","Clear All"};

    //defins array adapter of string type

    ArrayAdapter <String> adapter;

    //define string variable for record

    String record= "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_groundfloorfunctons);
        sp = (Spinner)findViewById(R.id.spinner);

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable.larsmagnus_nuuk));

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

                        record = "Coffee Docks";
                        break;

                    case 2:

                        record = "Toilets";

                        break;

                    case 3:

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


        if (record.equals("Coffee Docks")) {






        }

        if (record.equals("Toilets")) {




        }


        if (record.equals("Clear All"))

        {


        }

    }

}
