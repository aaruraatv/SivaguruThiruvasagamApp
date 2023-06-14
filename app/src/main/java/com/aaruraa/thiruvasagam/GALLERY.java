package com.aaruraa.thiruvasagam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GALLERY extends AppCompatActivity {

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmusic();
            }
        });
        btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthevaram();
            }
        });
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensivagnanam();
            }
        });

    }
    private void openmusic() {
        Intent intent = new Intent(this, music.class);
        startActivity(intent);
    }
    private void openthevaram() {
        Intent intent = new Intent(this, Thevaram.class);
        startActivity(intent);
    }
    private void opensivagnanam() {
        Intent intent = new Intent(this, Sivagnanam.class);
        startActivity(intent);
    }
}