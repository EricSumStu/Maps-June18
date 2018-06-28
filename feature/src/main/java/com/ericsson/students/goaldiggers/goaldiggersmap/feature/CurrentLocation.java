package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import java.sql.RowId;
import java.util.ArrayList;

public class CurrentLocation extends AppCompatActivity {

    Spinner sp ;

    //DEFINE TEXT VIEW

    TextView display_data ;

    //make string Arrary

    String names[] = {"-----Select-----","Coffee Docks","Toilets","Clear All"};

    //defins array adapter of string type

    ArrayAdapter<String> adapter;

    //define string variable for record

    String record= "";

    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    public TextView locationTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);
        sp = (Spinner)findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        sp.setAdapter(adapter);


        locationTV = (TextView) findViewById(R.id.locationTV);
        locationTV.setText(getValue(getIntent()));

        Imagedisplay();

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

      //  display_data.setTextSize(18);
       // display_data.setText(record);


    }


    private String getValue(final Intent intent) {
        try {
            final String barCodeString = intent.getExtras().getString(Constants.SCAN_BAR_TEST_KEY);

            return barCodeString != null ? barCodeString : ERROR_MESSAGE;

        } catch (final Exception e) {
            e.printStackTrace();
        }
        return ERROR_MESSAGE;
    }


    public void Imagedisplay() {
        // System.out.println("ImaageDisplayyyy " + locationTV.getText());

        //        This will turn "5.06 Berlin" to "berlin"
        String stringPart = ((String) locationTV.getText()).substring(5);
        stringPart = (stringPart).toLowerCase();


        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);


        int id = getResources().getIdentifier(stringPart+"_tokyo", "drawable", getPackageName());
        Toast.makeText(this,stringPart+"_tokyo" , Toast.LENGTH_LONG).show();
        imageView.setImage(ImageSource.resource(id));





//        TODO: Find a way to locate an image by its name.
//       Image image_name = ((Drawable)stringPart+"_tokyo");
//        String image_name = stringPart+"_"+otherPlace;
        //      SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);
        //      imageView.setImage(ImageSource.resource((ImageView)R.drawable.image_name));





/*
       if (locationTV.getText().equals("6.34 Kiev"))
       {
           SubsamplingScaleImageView imageView3 = (SubsamplingScaleImageView) findViewById(R.id.imageView);
           imageView3.setImage(ImageSource.resource(R.drawable.larsmagnus_nuuk));
       }
       else if (locationTV.getText().equals("6.03 Wellington")) {
           SubsamplingScaleImageView imageView2 = (SubsamplingScaleImageView) findViewById(R.id.imageView);
           imageView2.setImage(ImageSource.resource(R.drawable.berlin_tokyo));
       }
       else
       {
           //Toast.makeText(this, locationTV.getText(), Toast.LENGTH_SHORT).show();
           SubsamplingScaleImageView imageView2 = (SubsamplingScaleImageView) findViewById(R.id.imageView);
           imageView2.setImage(ImageSource.resource(R.drawable.groundfloor));
       }


   */


    }
}