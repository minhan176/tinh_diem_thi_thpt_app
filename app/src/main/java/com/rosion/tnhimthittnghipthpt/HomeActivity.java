package com.rosion.tnhimthittnghipthpt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_home);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
button1.setOnClickListener(new View.OnClickListener(){

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(HomeActivity.this,tinhdiem.class);
        startActivity(intent);
    }
});
button2.setOnClickListener(new View.OnClickListener(){

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (HomeActivity.this,tinhdiemGDTX.class);
        startActivity(intent);
    }
});
    }
}