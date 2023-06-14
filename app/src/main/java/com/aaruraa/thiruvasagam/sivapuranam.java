package com.aaruraa.thiruvasagam;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.IOException;

public class sivapuranam extends AppCompatActivity {

    private AdView mAdview;
    TextView text;
    SeekBar seekBar;
    int seekValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sivapuranam);
        //SEEK BAR
        text = (TextView) findViewById(R.id.text);
        seekBar  = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekValue = progress;
                text.setTextSize(seekValue);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


//BANNER ADD
        mAdview=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }
}