package com.example.michellejun.csfinalapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;

public class colorGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game);
    }
    public Palette createPaletteSynch(Bitmap bitmap) {
        Palette p = Palette.from(bitmap).generate();
        return p;
    }
    //push
}
