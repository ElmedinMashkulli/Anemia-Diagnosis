package com.tra.anemiadiagnosis;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.RelativeLayout;

public class HomeActivity extends AppCompatActivity {

    RelativeLayout nedirLayout , nedirLayoutAnswer , nedirLayout1,nedirLayoutAnswer1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setElevation(0);
        toolbar.setTitle("Kansizlik Tanısı");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        setSupportActionBar(toolbar);

        nedirLayout=(RelativeLayout)findViewById(R.id.nedirLayout);
        nedirLayoutAnswer=(RelativeLayout)findViewById(R.id.nedirLayoutAnswer);

        nedirLayout1=(RelativeLayout)findViewById(R.id.nedirLayout1);
        nedirLayoutAnswer1=(RelativeLayout)findViewById(R.id.nedirLayoutAnswer1);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setBackgroundColor(getResources().getColor(R.color.white));

        nedirLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                nedirLayoutAnswer.setVisibility(View.VISIBLE);
            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TestIntent = new Intent  ( HomeActivity.this, MainActivity.class);
                startActivity(TestIntent);


            }
        });
    }

}
