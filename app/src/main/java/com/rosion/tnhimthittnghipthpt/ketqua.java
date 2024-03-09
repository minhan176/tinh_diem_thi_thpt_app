package com.rosion.tnhimthittnghipthpt;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TableRow;
import android.widget.TextView;

public class ketqua extends AppCompatActivity {

    TextView ketquatn, dau, chucmung, kq1, kq2, kq3, kq4, kq5, kq6, kq7, trennam, ketquatn2,dau2,chucmung2,
    t1, t2, t3, t4, t5,t6,t7;
TableRow table6, table7, table5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_ketqua);
        ketquatn = findViewById(R.id.ketquatn);
        trennam = findViewById(R.id.trennam);
        dau = findViewById(R.id.dau);
        chucmung = findViewById(R.id.chucmung);
        kq1 = findViewById(R.id.kq1);
        kq2 = findViewById(R.id.kq2);
        kq3 = findViewById(R.id.kq3);
        kq4 = findViewById(R.id.kq4);
        kq5 = findViewById(R.id.kq5);
        kq6 = findViewById(R.id.kq6);
        kq7 = findViewById(R.id.kq7);
        ketquatn2 = findViewById(R.id.ketquatn2);
        dau2 = findViewById(R.id.dau2);
        chucmung2 = findViewById(R.id.chucmung2);
        t1= findViewById(R.id.t1);
        t2= findViewById(R.id.t2);
        t3= findViewById(R.id.t3);
        t4= findViewById(R.id.t4);
        t5= findViewById(R.id.t5);
        t6= findViewById(R.id.t6);
        t7= findViewById(R.id.t7);
        table5 = findViewById(R.id.table5);
        table6 = findViewById(R.id.table6);
        table7 = findViewById(R.id.table7);

        Intent intent = getIntent();
        Float dtn = intent.getFloatExtra("dtn", 0);
        Float chia = intent.getFloatExtra("chia",0);

        Float d1 = intent.getFloatExtra("d1", 0);
        Float a1 = intent.getFloatExtra("a1",0);
        Float d7 = intent.getFloatExtra("d7", 0);
        Float b8 = intent.getFloatExtra("b8",0);
        //
        Float a0 = intent.getFloatExtra("a0", 0);
        Float b0 = intent.getFloatExtra("b0", 0);
        Float  c1= intent.getFloatExtra("c1",0);

        Float a2 = intent.getFloatExtra("a2",0);
        Float c2 = intent.getFloatExtra("c2",0);
        Float c5 = intent.getFloatExtra("c5",0);
        Float c8 = intent.getFloatExtra("c8",0);

        Float d14 = intent.getFloatExtra("d14",0);
        Float d15 = intent.getFloatExtra("d15", 0);
        Float c19 = intent.getFloatExtra("c19",0);
        Float d10 = intent.getFloatExtra("d10", 0);
        //
        Float c4 = intent.getFloatExtra("c4",0);
        Float c0 = intent.getFloatExtra("c0", 0);

        Float c3 = intent.getFloatExtra("c3",0);
        Float a7 = intent.getFloatExtra("a7",0);

        if(chia == 1){
            kq1.setText(String.format("%.2f",a0));
            kq2.setText(String.format("%.2f",a1));
            kq3.setText(String.format("%.2f",b0));
            kq4.setText(String.format("%.2f",c1));
            kq5.setText(String.format("%.2f",d1));
            kq6.setText(String.format("%.2f",d7));
            kq7.setText(String.format("%.2f",b8));
        }
        if(chia == 2 ){
            t1.setText("Khối C00");
            t2.setText("Khối D01");
            t3.setText("Khối D14");
            t4.setText("Khối D15");
            t5.setText("Khối C19");
            t6.setText("Khối C04");
            t7.setText("Khối D10");
            kq1.setText(String.format("%.2f",c0));
            kq2.setText(String.format("%.2f",d1));
            kq3.setText(String.format("%.2f",d14));
            kq4.setText(String.format("%.2f",d15));
            kq5.setText(String.format("%.2f",c19));
            kq6.setText(String.format("%.2f",c4));
            kq7.setText(String.format("%.2f",d10));
        }
        if(chia == 3 ){
            t2.setText("Khối B00");
            t3.setText("Khối C01");
            t4.setText("Khối A02");
            t5.setText("Khối C02");
            t6.setText("Khối C05");
            t7.setText("Khối C08");
            kq1.setText(String.format("%.2f",a0));
            kq2.setText(String.format("%.2f",b0));
            kq3.setText(String.format("%.2f",c1));
            kq4.setText(String.format("%.2f",a2));
            kq5.setText(String.format("%.2f",c2));
            kq6.setText(String.format("%.2f",c5));
            kq7.setText(String.format("%.2f",c8));
        }
        if(chia == 4){
            t1.setText("Khối C00");
            t2.setText("Khối C04");
            t3.setText("Khối A07");
            t4.setText("Khối C03");

            t5.setText("");
            t6.setText("");
            t7.setText("");
            table5.setBackgroundResource(R.drawable.backgroundwhite);
            table6.setBackgroundResource(R.drawable.backgroundwhite);
            table7.setBackgroundResource(R.drawable.backgroundwhite);
            kq1.setText(String.format("%.2f",c0));
            kq2.setText(String.format("%.2f",c4));
            kq3.setText(String.format("%.2f",a7));
            kq4.setText(String.format("%.2f",c3));
        }

        if (dtn == 5) {
            trennam.setText("");
            ketquatn.setText(String.valueOf(dtn));
        }
        if (dtn > 5) {
            ketquatn.setText(String.valueOf(dtn));
        }
        if (dtn < 5) {
            trennam.setText("< 5");
            ketquatn2.setText(String.valueOf(dtn));
            chucmung2.setText("Xin chia buồn !");
            dau2.setText("Bạn đã rớt tốt");
            chucmung.setText("");
            dau.setText("");
        }
    }

}