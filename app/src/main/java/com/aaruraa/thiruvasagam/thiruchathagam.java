package com.aaruraa.thiruvasagam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class thiruchathagam extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thiruchathagam);

        lv = findViewById(R.id.chathagam);
        String values[] = {" 1. மெய் உணர்தல் ","2. அறிவுறுத்தல்","3. சுட்டறுத்தல்","4. ஆத்ம சுத்தி","5. கைம்மாறு கொடுத்தல்","6. அநுபோகசுத்தி",
                "7. காருணியத்து இரங்கல்","8. ஆனந்தத்து அழுத்தல்","9. ஆனந்த பரவரசம்,","10. ஆனந்த அதீதம்"};

       ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,values);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent b1 = new Intent(thiruchathagam.this, meiunarathal.class);
                        startActivity(b1);
                        break;
                    case 1:
                        Intent b2 = new Intent(thiruchathagam.this, arivuruthal.class);
                        startActivity(b2);
                        break;
                    case 2:
                        Intent b3 = new Intent(thiruchathagam.this, suttaruthal.class);
                        startActivity(b3);
                        break;
                    case 3:
                        Intent b4 = new Intent(thiruchathagam.this, athmasuthi.class);
                        startActivity(b4);
                        break;
                    case 4:
                        Intent b5 = new Intent(thiruchathagam.this, kaimaru.class);
                        startActivity(b5);
                        break;
                    case 5:
                        Intent b6 = new Intent(thiruchathagam.this, anuboga.class);
                        startActivity(b6);
                        break;
                    case 6:
                        Intent b7 = new Intent(thiruchathagam.this, karunyam.class);
                        startActivity(b7);
                        break;
                    case 7:
                        Intent b8 = new Intent(thiruchathagam.this, anantham.class);
                        startActivity(b8);
                        break;
                    case 8:
                        Intent b9 = new Intent(thiruchathagam.this, paravasam.class);
                        startActivity(b9);
                        break;
                    case 9:
                        Intent b10 = new Intent(thiruchathagam.this, meiunarathal.class);
                        startActivity(b10);
                        break;

                }
            }
        });

    }
}