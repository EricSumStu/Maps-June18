package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;


public class CurrentLocation extends AppCompatActivity {
//    SPINNER:
    Spinner sp ;
    TextView display_data ;
    String names[] = {"-----Select-----","Anchorage","Berlin","Brasilia","Buenos Aires","Canberra","Cape Town","Demo Room","Helsinki","Honolulu","Jakarta","Kiev","Kuala Lumpur","Lars Magnus","Moscow","Nuuk","Ottowa","Paris,","Reykjavik","Rome","Stockholm","Tokyo","Warsaw","Washington DC","Wellington"};
    ArrayAdapter <String> adapter;
    //define string variable for record
    String record= "";
    String currentLocationName = "";
    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    public TextView locationTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);

        locationTV = (TextView) findViewById(R.id.locationTV);
        locationTV.setText(getValue(getIntent()));
        sp = (Spinner)findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        sp.setAdapter(adapter);
        //Imagedisplay();



        currentLocationName = ((String) locationTV.getText()).substring(5);
        currentLocationName = (currentLocationName).toLowerCase();
//         currentLocationName +="_tokyo";

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);
        int resource_id = getResources().getIdentifier(currentLocationName, "drawable", getPackageName());
        imageView.setImage(ImageSource.resource(resource_id));


//        int id = getResources().getIdentifier(currentLocationName, "drawable", getPackageName());
//        Toast.makeText(this,currentLocationName, Toast.LENGTH_LONG).show();
//        imageView.setImage(ImageSource.resource(id));

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

                        record = "anchorage";
                        diplsyResult(view);
                        break;

                    case 2:

                        record = "berlin";
                        diplsyResult(view);
                        break;

                    case 3:

                        record = "brasilia";
                        diplsyResult(view);
                        break;

                    case 4:

                        record = "buenosaires";
                        diplsyResult(view);
                        break;

                    case 5:

                        record = "canberra";
                        diplsyResult(view);
                        break;

                    case 6:

                        record = "capetown";
                        diplsyResult(view);
                        break;

                    case 7:

                        record = "demoroom";
                        diplsyResult(view);
                        break;


                    case 8:

                        record = "helsinki";
                        diplsyResult(view);
                        break;

                    case 9:

                        record = "honolulu";
                        diplsyResult(view);
                        break;

                    case 10:

                    record = "jakarta";
                    diplsyResult(view);
                    break;

                    case 11:

                        record = "kiev";
                        diplsyResult(view);
                        break;

                    case 12:

                        record = "kualalumpur";
                        diplsyResult(view);
                        break;

                    case 13:

                        record = "larsmagnus";
                        diplsyResult(view);
                        break;

                    case 14:

                        record = "moscow";
                        diplsyResult(view);
                        break;

                    case 15:

                        record = "nuuk";
                        diplsyResult(view);
                        break;

                    case 16:

                        record = "ottowa";
                        diplsyResult(view);
                        break;

                    case 17:

                        record = "paris";
                        diplsyResult(view);
                        break;

                    case 18:

                        record = "reykjavik";
                        diplsyResult(view);
                        break;

                    case 19:

                        record = "rome";
                        diplsyResult(view);
                        break;

                    case 20:

                        record = "stockholm";
                        diplsyResult(view);
                        break;


                    case 21:

                        record = "tokyo";
                        diplsyResult(view);
                        break;

                    case 22:

                        record = "warsaw";
                        diplsyResult(view);
                        break;


                    case 23:

                        record = "washingtondc";
                        diplsyResult(view);
                        break;


                    case 24:

                        record = "wellington";
                        diplsyResult(view);
                        break;

                }



            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }
    public void diplsyResult(View view)

    {

//        String currentLocationName = ((String) locationTV.getText()).substring(5);
//        currentLocationName = (currentLocationName).toLowerCase();
        String imageNameStr = currentLocationName +"_"+record;

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);
        int resource_id = getResources().getIdentifier(imageNameStr, "drawable", getPackageName());
        imageView.setImage(ImageSource.resource(resource_id));
//                        Toast.makeText(this,currentLocationName, Toast.LENGTH_LONG).show();



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
        String currentLocationName = ((String) locationTV.getText()).substring(5);
        currentLocationName = (currentLocationName).toLowerCase();
        currentLocationName +="_tokyo";

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);


        int id = getResources().getIdentifier(currentLocationName, "drawable", getPackageName());
        Toast.makeText(this,currentLocationName, Toast.LENGTH_LONG).show();
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