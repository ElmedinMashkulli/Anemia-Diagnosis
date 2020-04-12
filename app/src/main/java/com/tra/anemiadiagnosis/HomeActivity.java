package com.tra.anemiadiagnosis;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
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

        String title1 = String.valueOf(getResources().getString(R.string.SSSTitle1));
        String title2 = String.valueOf(getResources().getString(R.string.SSSTitle2));
        String title3 = String.valueOf(getResources().getString(R.string.SSSTitle3));
        String text1 = String.valueOf(getResources().getString(R.string.SSSText1));
        String text2= String.valueOf(getResources().getString(R.string.SSSText2));
        String text3 = String.valueOf(getResources().getString(R.string.SSSText3));

        String title4 = String.valueOf(getResources().getString(R.string.SSSTitle4));
        String text4 = String.valueOf(getResources().getString(R.string.SSSText4));
        String title5 = String.valueOf(getResources().getString(R.string.SSSTitle5));
        String text5 = String.valueOf(getResources().getString(R.string.SSSText5));
        String title6 = String.valueOf(getResources().getString(R.string.SSSTitle6));
        String text6 = String.valueOf(getResources().getString(R.string.SSSText6));


        List<SSS> sssList = new ArrayList<>();

        sssList.add(new SSS(title1, text1));
        sssList.add(new SSS(title2, text2));
        sssList.add(new SSS(title3, text3));
        sssList.add(new SSS(title4, text4));
        sssList.add(new SSS(title5, text5));
        sssList.add(new SSS(title6, text6));



        RecAdapter adapter = new RecAdapter(sssList);

        RecyclerView recyclerView = findViewById(R.id.recview);

        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setBackgroundColor(getResources().getColor(R.color.white));



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TestIntent = new Intent  ( HomeActivity.this, MainActivity.class);
                startActivity(TestIntent);


            }
        });
    }

}
