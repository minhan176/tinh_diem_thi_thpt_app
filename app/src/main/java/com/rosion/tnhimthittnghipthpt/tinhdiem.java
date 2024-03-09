package com.rosion.tnhimthittnghipthpt;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class tinhdiem extends AppCompatActivity  {

    private InterstitialAd mInterstitialAd;
    TextView  khtn,khxh,textli,texthoa,textsinh, textkk, textut;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9;
    Button ketqua;
TableRow tntable,xhtable;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinhdiem);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_thpt);

        khtn = findViewById(R.id.khtn);
        khxh= findViewById(R.id.khxh);
        textli= findViewById(R.id.textli);
        texthoa = findViewById(R.id.texthoa);
        textsinh = findViewById(R.id.textsinh);
        textkk = findViewById(R.id.textkk);
        textut = findViewById(R.id.textut);

        tntable = findViewById(R.id.tntable);
        xhtable = findViewById(R.id.xhtable);

        editText1 = (EditText)findViewById(R.id.edit1);
        editText2=(EditText)findViewById(R.id.edit2);
        editText3 = (EditText)findViewById(R.id.edit3);
        editText4 = (EditText)findViewById(R.id.edit4);
        editText5 = (EditText)findViewById(R.id.edit5);
        editText6 = (EditText)findViewById(R.id.edit6);
        editText7 = (EditText)findViewById(R.id.edit7);
        editText8 = (EditText)findViewById(R.id.edit8);
        editText9 = (EditText)findViewById(R.id.edit9);
        ketqua = findViewById(R.id.button3);

        editText1.addTextChangedListener(myTextWatcher);
        editText2.addTextChangedListener(myTextWatcher);
        editText3.addTextChangedListener(myTextWatcher);
        editText4.addTextChangedListener(myTextWatcher);
        editText5.addTextChangedListener(myTextWatcher);
        editText6.addTextChangedListener(myTextWatcher);
        editText7.addTextChangedListener(myTextWatcher);
        editText8.addTextChangedListener(myTextWatcher);
        editText9.addTextChangedListener(myTextWatcher);
        khtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                khtn.setTextColor(Color.parseColor("#FF33B5E5"));
                khxh.setTextColor(Color.parseColor("#A3A1A1"));
                khtn.setTextSize(20); khxh.setTextSize(19);
                tntable.setBackgroundResource(R.drawable.background1);
                xhtable.setBackgroundResource(R.drawable.backgroundwhite);
                textli.setText("Vật lí");
                texthoa.setText("Hóa");
                textsinh.setText("Sinh");
                editText7.setText("");
                editText8.setText("");
                editText9.setText("");
            }
        });

        khxh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                khxh.setTextColor(Color.parseColor("#FF33B5E5"));
                khtn.setTextColor(Color.parseColor("#A3A1A1"));
                khtn.setTextSize(19); khxh.setTextSize(20);
                xhtable.setBackgroundResource(R.drawable.background1);
                tntable.setBackgroundResource(R.drawable.backgroundwhite);
                textli.setText("Sử");
                texthoa.setText("Địa lí");
                textsinh.setText("GDCD");
                editText7.setText("");
                editText8.setText("");
                editText9.setText("");
            }
        });

        MobileAds.initialize(this,
                "ca-app-pub-9002559574859995~6215648624");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9002559574859995/1126973474");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                if (editText1.getText().toString().length() == 0) { editText1.setText("11"); }if (editText2.getText().toString().length() == 0) { editText2.setText("11"); }
                if (editText3.getText().toString().length() == 0) { editText3.setText("11"); }if (editText4.getText().toString().length() == 0) { editText4.setText("11"); }
                if (editText7.getText().toString().length() == 0) { editText7.setText("11"); }if (editText8.getText().toString().length() == 0) { editText8.setText("11"); }
                if (editText9.getText().toString().length() == 0) { editText9.setText("11"); }

                if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") ) { editText1.setText("12"); }if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") ) { editText2.setText("12"); }
                if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") ) { editText3.setText("12"); }if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") ) { editText4.setText("12"); }
                if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") ) { editText7.setText("12"); }if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") ) { editText8.setText("12"); }
                if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") ) { editText9.setText("12"); }

                float no1 = Float.valueOf(editText1.getText().toString());
                float no2 = Float.valueOf(editText2.getText().toString());
                float no3 = Float.valueOf(editText3.getText().toString());
                float no4 = Float.valueOf(editText4.getText().toString());
                float no7 = Float.valueOf(editText7.getText().toString());
                float no8 = Float.valueOf(editText8.getText().toString());
                float no9 = Float.valueOf(editText9.getText().toString());

                if (no1 == 11) { editText1.setText(""); }if (no2 == 11) { editText2.setText(""); }if (no3 == 11) { editText3.setText(""); }if (no4 == 11) { editText4.setText(""); }
                if (no7 == 11) { editText7.setText(""); }if (no8 == 11) { editText8.setText(""); }if (no9 == 11) { editText9.setText(""); }

                if (no1 == 12) { editText1.setText("."); }if (no2 == 12) { editText2.setText("."); }if (no3 == 12) { editText3.setText("."); }if (no4 == 12) { editText4.setText("."); }
                if (no7 == 12) { editText7.setText("."); }if (no8 == 12) { editText8.setText("."); }if (no9 == 12) { editText9.setText("."); }

                float d1 = no1 +no2+no3;

                float a0 = no1  + no7 + no8;
                float a1 = no1  + no7 + no3;
                float b0 = no9 + no1 + no8;
                float c1 = no1 + no7 + no2;
                float d7 = no8 + no1 + no3;
                float b8 = no9 + no1 + no3;

                float c0 = no2 + no7 + no8;
                float d14 = no2 + no7 + no3;
                float d15 = no2 + no8 + no3;
                float c19 = no2 + no7 + no9;
                float d10 = no1 + no8 + no3;
                float c4 = no1 + no2 + no8;

                if ( no1 > 10  || no2 > 10 || no3 > 10  || no4 > 10|| no7>10 || no8 > 10 || no9 > 10 || editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")  || editText6.getText().toString().length() == 1 && editText6.getText().toString().contains(".")
                        || editText6.getText().toString().length() > 0 && (Float.valueOf(editText6.getText().toString())<0.25 && Float.valueOf(editText6.getText().toString()) >0 || Float.valueOf(editText6.getText().toString())<0.5 && Float.valueOf(editText6.getText().toString()) >0.25  || Float.valueOf(editText6.getText().toString()) >0.5 )
                        || editText5.getText().toString().length() > 0 &&  Float.valueOf(editText5.getText().toString()) > 4)
                {
                    if ( no1 > 10) {
                        editText1.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no2 > 10) {
                        editText2.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no3 > 10) {
                        editText3.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no4 > 10) {
                        editText4.setBackgroundResource(R.drawable.background_red);
                    }
                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() > 0 && Float.valueOf(editText5.getText().toString()) > 4  ) {
                        editText5.setBackgroundResource(R.drawable.background_red);
                    }
                    if (editText6.getText().toString().length() == 1 && editText6.getText().toString().contains(".") || (editText6.getText().toString().length() > 0 && (Float.valueOf(editText6.getText().toString()) <0.25 && Float.valueOf(editText6.getText().toString()) >0  || Float.valueOf(editText6.getText().toString())<0.5 && Float.valueOf(editText6.getText().toString()) >0.25  || Float.valueOf(editText6.getText().toString()) >0.5  ))
                    ) {
                        editText6.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no7 >10){
                        editText7.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no8 > 10){
                        editText8.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no9 > 10){
                        editText9.setBackgroundResource(R.drawable.background_red);
                    }
                }
                else {
                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() > 0 && textli.getText().toString().length() >2){

                            float chia = 1;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float dtn = ((no1 + no2 + no3 + kk + (no7 + no8 + no9) / 3) / 4 * 7 + no4 * 3) / 10 * 100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2) / 100;
                            Intent intent = new Intent(tinhdiem.this, ketqua.class);
                            intent.putExtra("dtn", dtn3);
                            intent.putExtra("d1", d1);
                            intent.putExtra("a0", a0);
                            intent.putExtra("a1", a1);
                            intent.putExtra("b0", b0);
                            intent.putExtra("b8", b8);
                            intent.putExtra("c1", c1);
                            intent.putExtra("d7", d7);
                            intent.putExtra("chia", chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() > 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float dtn = ((no1 + no2 + no3 + kk + (no7 + no8+ no9)/3 ) / 4 *7 + no4 *3 ) /10 * 100 ;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2) /100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() >2){
                            float chia = 1;
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() >2){
                            float chia = 1;
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() > 0&& textli.getText().toString().length() >2){
                            float chia = 1;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + kk + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() > 0&& textli.getText().toString().length() ==2) {
                            float chia = 2;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3 + kk + (no7 + no8 + no9) / 3) / 4 * 7 + no4 * 3) / 10 + ut) * 100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2) / 100;
                            Intent intent = new Intent(tinhdiem.this, ketqua.class);
                            intent.putExtra("dtn", dtn3);
                            intent.putExtra("c0", c0);
                            intent.putExtra("c4", c4);
                            intent.putExtra("d10", d10);
                            intent.putExtra("d14", d14);
                            intent.putExtra("d15", d15);
                            intent.putExtra("c19", c19);
                            intent.putExtra("d1", d1);
                            intent.putExtra("chia", chia);
                            startActivity(intent);
                        }
                }
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }
        });


        ketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (editText1.getText().toString().length() == 0) { editText1.setText("11"); }if (editText2.getText().toString().length() == 0) { editText2.setText("11"); }
                if (editText3.getText().toString().length() == 0) { editText3.setText("11"); }if (editText4.getText().toString().length() == 0) { editText4.setText("11"); }
                if (editText7.getText().toString().length() == 0) { editText7.setText("11"); }if (editText8.getText().toString().length() == 0) { editText8.setText("11"); }
                if (editText9.getText().toString().length() == 0) { editText9.setText("11"); }

                if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") ) { editText1.setText("12"); }if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") ) { editText2.setText("12"); }
                if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") ) { editText3.setText("12"); }if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") ) { editText4.setText("12"); }
                if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") ) { editText7.setText("12"); }if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") ) { editText8.setText("12"); }
                if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") ) { editText9.setText("12"); }

                float no1 = Float.valueOf(editText1.getText().toString());
                float no2 = Float.valueOf(editText2.getText().toString());
                float no3 = Float.valueOf(editText3.getText().toString());
                float no4 = Float.valueOf(editText4.getText().toString());
                float no7 = Float.valueOf(editText7.getText().toString());
                float no8 = Float.valueOf(editText8.getText().toString());
                float no9 = Float.valueOf(editText9.getText().toString());

                if (no1 == 11) { editText1.setText(""); }if (no2 == 11) { editText2.setText(""); }if (no3 == 11) { editText3.setText(""); }if (no4 == 11) { editText4.setText(""); }
                if (no7 == 11) { editText7.setText(""); }if (no8 == 11) { editText8.setText(""); }if (no9 == 11) { editText9.setText(""); }

                if (no1 == 12) { editText1.setText("."); }if (no2 == 12) { editText2.setText("."); }if (no3 == 12) { editText3.setText("."); }if (no4 == 12) { editText4.setText("."); }
                if (no7 == 12) { editText7.setText("."); }if (no8 == 12) { editText8.setText("."); }if (no9 == 12) { editText9.setText("."); }

                float d1 = no1 +no2+no3;

                float a0 = no1  + no7 + no8;
                float a1 = no1  + no7 + no3;
                float b0 = no9 + no1 + no8;
                float c1 = no1 + no7 + no2;
                float d7 = no8 + no1 + no3;
                float b8 = no9 + no1 + no3;

                float c0 = no2 + no7 + no8;
                float d14 = no2 + no7 + no3;
                float d15 = no2 + no8 + no3;
                float c19 = no2 + no7 + no9;
                float d10 = no1 + no8 + no3;
                float c4 = no1 + no2 + no8;

                if ( no1 > 10  || no2 > 10 || no3 > 10  || no4 > 10|| no7>10 || no8 > 10 || no9 > 10 || editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")  || editText6.getText().toString().length() == 1 && editText6.getText().toString().contains(".")
                || editText6.getText().toString().length() > 0 && (Float.valueOf(editText6.getText().toString())<0.25 && Float.valueOf(editText6.getText().toString()) >0 || Float.valueOf(editText6.getText().toString())<0.5 && Float.valueOf(editText6.getText().toString()) >0.25  || Float.valueOf(editText6.getText().toString()) >0.5 )
                || editText5.getText().toString().length() > 0 &&  Float.valueOf(editText5.getText().toString()) > 4)
                {
                    if ( no1 > 10) {
                        editText1.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no2 > 10) {
                        editText2.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no3 > 10) {
                        editText3.setBackgroundResource(R.drawable.background_red);
                    }
                    if ( no4 > 10) {
                        editText4.setBackgroundResource(R.drawable.background_red);
                    }
                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() > 0 && Float.valueOf(editText5.getText().toString()) > 4  ) {
                        editText5.setBackgroundResource(R.drawable.background_red);
                    }
                    if (editText6.getText().toString().length() == 1 && editText6.getText().toString().contains(".") || (editText6.getText().toString().length() > 0 && (Float.valueOf(editText6.getText().toString()) <0.25 && Float.valueOf(editText6.getText().toString()) >0  || Float.valueOf(editText6.getText().toString())<0.5 && Float.valueOf(editText6.getText().toString()) >0.25  || Float.valueOf(editText6.getText().toString()) >0.5  ))
                     ) {
                        editText6.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no7 >10){
                        editText7.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no8 > 10){
                        editText8.setBackgroundResource(R.drawable.background_red);
                    }
                    if( no9 > 10){
                        editText9.setBackgroundResource(R.drawable.background_red);
                    }
                }
                else {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");

                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() > 0 && textli.getText().toString().length() >2){

                                float chia = 1;
                                Float kk = Float.valueOf(editText5.getText().toString());
                                Float dtn = ((no1 + no2 + no3 + kk + (no7 + no8 + no9) / 3) / 4 * 7 + no4 * 3) / 10 * 100;
                                int dtn2 = Math.round(dtn);
                                Float dtn3 = Float.valueOf(dtn2) / 100;
                                Intent intent = new Intent(tinhdiem.this, ketqua.class);
                                intent.putExtra("dtn", dtn3);
                                intent.putExtra("d1", d1);
                                intent.putExtra("a0", a0);
                                intent.putExtra("a1", a1);
                                intent.putExtra("b0", b0);
                                intent.putExtra("b8", b8);
                                intent.putExtra("c1", c1);
                                intent.putExtra("d7", d7);
                                intent.putExtra("chia", chia);
                                startActivity(intent);
                            }

                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() > 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float dtn = ((no1 + no2 + no3 + kk + (no7 + no8+ no9)/3 ) / 4 *7 + no4 *3 ) /10 * 100 ;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2) /100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() >2){
                            float chia = 1;
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() >2){
                            float chia = 1;
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() == 0 && editText5.getText().toString().length() == 0 && textli.getText().toString().length() ==2){
                            float chia = 2;
                            Float dtn = (((no1 + no2 + no3  + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("c0",c0);
                            intent.putExtra("c4",c4);
                            intent.putExtra("d10",d10);
                            intent.putExtra("d14",d14);
                            intent.putExtra("d15",d15);
                            intent.putExtra("c19",c19);
                            intent.putExtra("d1",d1);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }

                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() > 0&& textli.getText().toString().length() >2){
                            float chia = 1;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3  + kk + (no7 + no8+ no9) /3 ) / 4 *7 + no4 *3 ) /10 + ut ) *100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2)/100;
                            Intent intent = new Intent(tinhdiem.this,ketqua.class);
                            intent.putExtra("dtn",dtn3);
                            intent.putExtra("d1",d1);
                            intent.putExtra("a0",a0);
                            intent.putExtra("a1",a1);
                            intent.putExtra("b0",b0);
                            intent.putExtra("b8",b8);
                            intent.putExtra("c1",c1);
                            intent.putExtra("d7",d7);
                            intent.putExtra("chia",chia);
                            startActivity(intent);
                        }
                        if (editText6.getText().toString().length() > 0 && editText5.getText().toString().length() > 0&& textli.getText().toString().length() ==2) {
                            float chia = 2;
                            Float kk = Float.valueOf(editText5.getText().toString());
                            Float ut = Float.valueOf(editText6.getText().toString());
                            Float dtn = (((no1 + no2 + no3 + kk + (no7 + no8 + no9) / 3) / 4 * 7 + no4 * 3) / 10 + ut) * 100;
                            int dtn2 = Math.round(dtn);
                            Float dtn3 = Float.valueOf(dtn2) / 100;
                            Intent intent = new Intent(tinhdiem.this, ketqua.class);
                            intent.putExtra("dtn", dtn3);
                            intent.putExtra("c0", c0);
                            intent.putExtra("c4", c4);
                            intent.putExtra("d10", d10);
                            intent.putExtra("d14", d14);
                            intent.putExtra("d15", d15);
                            intent.putExtra("c19", c19);
                            intent.putExtra("d1", d1);
                            intent.putExtra("chia", chia);
                            startActivity(intent);
                        }
                    }
                }
            }
        });


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

       TextWatcher myTextWatcher = new TextWatcher(){

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            try{


                    if(editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".")){
                        editText1.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no1 = Float.valueOf(editText1.getText().toString());
                    if(no1>10){
                        editText1.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText1.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText1.setBackgroundResource(R.drawable.focus);
                    }

            }catch(NumberFormatException e){ }
            try{


                    if(editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".")){
                        editText2.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no2 = Float.valueOf(editText2.getText().toString());
                    if(no2>10){
                        editText2.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText2.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText2.setBackgroundResource(R.drawable.focus);

                }
            }catch(NumberFormatException e){ }
            try{


                    if(editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".")){
                        editText3.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no3 = Float.valueOf(editText3.getText().toString());
                    if(no3>10){
                        editText3.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText3.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText3.setBackgroundResource(R.drawable.focus);
                    }

            }catch(NumberFormatException e){ }
            try{


                    if(editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".")){
                        editText4.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no4 = Float.valueOf(editText4.getText().toString());
                    if(no4>10){
                        editText4.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText4.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText4.setBackgroundResource(R.drawable.focus);

                }
            }catch(NumberFormatException e){ }
            try{
                if(editText5.getText().toString().length() >0){
                    editText5.setTextSize(22);
                    editText5.setTypeface(editText5.getTypeface(),Typeface.BOLD);
                }else {
                    editText5.setTextSize(17);
                    editText5.setTypeface(editText5.getTypeface(),Typeface.ITALIC);
                }

                    if(editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")){
                        editText5.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no5 = Float.valueOf(editText5.getText().toString());
                    if(no5>4){
                        editText5.setTextColor(Color.parseColor("#FF0000"));
                        textkk.setText("Max = 4");
                    }else{
                        editText5.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText5.setBackgroundResource(R.drawable.focus);
                        textkk.setText("");
                }
            }catch(NumberFormatException e){ }
            try{
                if(editText6.getText().toString().length() >0){
                    editText6.setTextSize(22);
                    editText6.setTypeface(editText6.getTypeface(),Typeface.BOLD);
                }else {
                    editText6.setTextSize(17);
                    editText6.setTypeface(editText6.getTypeface(),Typeface.ITALIC);
                }

                    if(editText6.getText().toString().length() == 1 && editText6.getText().toString().contains(".")){
                        editText6.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no6= Float.valueOf(editText6.getText().toString());
                    if(no6>0 && no6 < 0.25 || no6 > 0.25 && no6 < 0.5 || no6 > 0.5) {
                        editText6.setTextColor(Color.parseColor("#FF0000"));
                        textut.setText("0 __ 0.25 __ 0.5");
                    }else{
                        editText6.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText6.setBackgroundResource(R.drawable.focus);
                        textut.setText("");
                    }

            }catch(NumberFormatException e){ }
            try{


                    if(editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".")){
                        editText7.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no7 = Float.valueOf(editText7.getText().toString());
                    if(no7>10){
                        editText7.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText7.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText7.setBackgroundResource(R.drawable.focus);
                    }

            }catch(NumberFormatException e){ }
            try{


                    if(editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".")){
                        editText8.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no8 = Float.valueOf(editText8.getText().toString());
                    if(no8>10){
                        editText8.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText8.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText8.setBackgroundResource(R.drawable.focus);

                }
            }catch(NumberFormatException e){ }
            try{


                    if(editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")){
                        editText9.setTextColor(Color.parseColor("#FF0000"));
                    }
                    float no9 = Float.valueOf(editText9.getText().toString());
                    if(no9>10){
                        editText9.setTextColor(Color.parseColor("#FF0000"));
                    }else{
                        editText9.setTextColor(Color.parseColor("#FF0A9C10"));
                        editText9.setBackgroundResource(R.drawable.focus);
                    }

            }catch(NumberFormatException e){ }
        }
    };

}