package com.ericsson.students.goaldiggers.goaldiggersmap.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class ActivityZone3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone3);

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable.zonethree));

        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ZonesMenu.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainMenu.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
