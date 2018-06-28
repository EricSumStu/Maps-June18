package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import java.sql.RowId;
import java.util.ArrayList;

public class CurrentLocation extends AppCompatActivity {

    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    public TextView locationTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);

        locationTV = (TextView) findViewById(R.id.locationTV);
        locationTV.setText(getValue(getIntent()));

        Imagedisplay();

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

        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(stringPart + "_tokyo.jpg", "drawable", context.getPackageName());
        Toast.makeText(this,stringPart+"_tokyo.jpg" , Toast.LENGTH_LONG).show();
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