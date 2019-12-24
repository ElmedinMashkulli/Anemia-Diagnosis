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
    String mHGBResult,mHCTResult,mMCHResult,mRBCResult;
    Integer HGBResult ,HCTResult,MCHResult,RBCResult;
    RelativeLayout btnHesapla,hayir,evet;

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

                editTextConvert();

                resultLoop();

            }
        });


    }

    public void editTextConvert(){
        mHGBResult=HGBEdit.getText().toString().trim();
        HGBResult=Integer.parseInt(mHGBResult);

        mHCTResult=HGBEdit.getText().toString().trim();
        HCTResult=Integer.parseInt(mHCTResult);

        mMCHResult=HGBEdit.getText().toString().trim();
        MCHResult=Integer.parseInt(mMCHResult);

        mRBCResult=HGBEdit.getText().toString().trim();
        RBCResult=Integer.parseInt(mRBCResult);
    }

    public void resultLoop(){
        if(HGBResult > 10.950){

            if(HCTResult > 33.950){

                if(HGBResult <= 11.350){

                    if(MCHResult > 29.950){

                        if(RBCResult > 3.665){
                            //YES
                            evet.setVisibility(View.VISIBLE);
                            hayir.setVisibility(View.GONE);
                        }else if (RBCResult <= 3.665){
                            //NO
                            evet.setVisibility(View.GONE);
                            hayir.setVisibility(View.VISIBLE);
                        }
                    }else if(MCHResult <= 29.950){
                        //NO
                        evet.setVisibility(View.GONE);
                        hayir.setVisibility(View.VISIBLE);
                    }

                }else if(HGBResult > 11.350){
                    //NO
                    evet.setVisibility(View.GONE);
                    hayir.setVisibility(View.VISIBLE);
                }
            }else if(HCTResult <= 33.950){
                //NO
                evet.setVisibility(View.GONE);
                hayir.setVisibility(View.VISIBLE);
            }

        } else if(HGBResult <= 10.950){
            //yes
            evet.setVisibility(View.VISIBLE);
            hayir.setVisibility(View.GONE);
        }
    }

    public void init(){

        HCTEdit=(EditText)findViewById(R.id.hctdegeri);
        HGBEdit=(EditText)findViewById(R.id.hgbdegeri);
        MCHEdit=(EditText)findViewById(R.id.mchdegeri);
        RBCEdit=(EditText)findViewById(R.id.rbcdegeri);
        btnHesapla=(RelativeLayout)findViewById(R.id.hesapla);
        hayir=(RelativeLayout)findViewById(R.id.hayir);
        evet=(RelativeLayout)findViewById(R.id.evet);



    }
}
