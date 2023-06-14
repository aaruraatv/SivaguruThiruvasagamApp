package com.aaruraa.thiruvasagam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.play.core.appupdate.AppUpdateManager;

public class Main extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;
    private static final int MY_REQUEST_CODE = 100;
    private AppUpdateManager appUpdateManager;

    private AdView mAdview;


    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        //BANNER ADS
        mAdview=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThiruvasagam();
            }
        });
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensivagnanvithu();
            }
        });
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengallery();
            }
        });
        btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmore();
            }
        });
    }


    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(),"Press Back Again To Exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
    private void openThiruvasagam() {
        Intent intent = new Intent(this, Thiruvasagam.class);
        startActivity(intent);
    }

    private void opensivagnanvithu() {
        Intent intent = new Intent(this, sivagnanvithu.class);
        startActivity(intent);
    }
    private void opengallery() {
        Intent intent = new Intent(this, GALLERY.class);
        startActivity(intent);
    }
    private void openmore() {
        Intent intent = new Intent(this, more.class);
        startActivity(intent);
    }



}
