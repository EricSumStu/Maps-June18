package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CurrentLocation extends AppCompatActivity {

    private final static String ERROR_MESSAGE = "Unable to scan bar code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);

        final TextView locationTV = (TextView) findViewById(R.id.locationTV);
        locationTV.setText(getValue(getIntent()));
    }


    private String getValue(final Intent intent){
        try{
            final String barCodeString = intent.getExtras().getString(Constants.SCAN_BAR_TEST_KEY);

            return barCodeString != null ? barCodeString : ERROR_MESSAGE;

        }catch (final Exception e){
            e.printStackTrace();
        }
        return ERROR_MESSAGE;
    }
}
