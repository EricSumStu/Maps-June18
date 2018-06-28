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


public class CurrentLocation extends AppCompatActivity {



    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    public TextView locationTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);


        locationTV = (TextView) findViewById(R.id.locationTV);
        locationTV.setText(getValue(getIntent()));



        //Imagedisplay();



        String stringPart = ((String) locationTV.getText()).substring(5);
        stringPart = (stringPart).toLowerCase();

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);


        int id = getResources().getIdentifier(stringPart, "drawable", getPackageName());
        Toast.makeText(this,stringPart, Toast.LENGTH_LONG).show();
        imageView.setImage(ImageSource.resource(id));



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

        //        This will turn "5.06 Berlin" to "berlin"
        String stringPart = ((String) locationTV.getText()).substring(5);
        stringPart = (stringPart).toLowerCase();
        stringPart +="_tokyo";

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);


        int id = getResources().getIdentifier(stringPart, "drawable", getPackageName());
        Toast.makeText(this,stringPart, Toast.LENGTH_LONG).show();
        imageView.setImage(ImageSource.resource(id));




/*

           //Toast.makeText(this, locationTV.getText(), Toast.LENGTH_SHORT).show();
           SubsamplingScaleImageView imageView2 = (SubsamplingScaleImageView) findViewById(R.id.imageView);
           imageView2.setImage(ImageSource.resource(R.drawable.groundfloor));

   */


    }


    public void DisplayToast() {

        Toast.makeText(this,"ffhhhvh", Toast.LENGTH_LONG).show();


    }
}