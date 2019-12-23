package com.tra.anemiadiagnosis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    EditText HGBEdit , HCTEdit , MCHEdit , RBCEdit;
    RelativeLayout btnHesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setElevation(0);
        toolbar.setTitle("Kansızlık Testi");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        init();

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    public void init(){



        HCTEdit=(EditText)findViewById(R.id.hctdegeri);
        HGBEdit=(EditText)findViewById(R.id.hgbdegeri);
        MCHEdit=(EditText)findViewById(R.id.mchdegeri);
        RBCEdit=(EditText)findViewById(R.id.rbcdegeri);
        btnHesapla=(RelativeLayout)findViewById(R.id.hesapla);

    }
}