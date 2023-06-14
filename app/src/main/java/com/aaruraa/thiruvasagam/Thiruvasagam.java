package com.aaruraa.thiruvasagam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Thiruvasagam extends AppCompatActivity {
    ListView lv;

    private InterstitialAd mInterstitialAd;
    private AdView mAdview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thiruvasagam);

        //BANNER ADD
        mAdview=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);




        lv = findViewById(R.id.List_V);
        String values[] = {"001 சிவபுராணம்", "002 கீர்த்தித் திருவகவல் ", "003 திருவண்டப் பகுதி ", "004 போற்றித் திருவகவல்", "005 திருச்சதகம் ", "006 நீத்தல் விண்ணப்பம் ", "007 திருவெம்பாவை ",
                "008 திரு அம்மானை", "009 திருப்பொற் சுண்ணம்", "010 திருக்கோத்தும்பி ", "011 திருத்தெள்ளேணம்", "012 திருச்சாழல்", "013 திருப்பூவல்லி ", "014 திருஉந்தியார்",
                "015  திருத்தோள் நோக்கம் ", "016 திருப்பொன்னூசல் ", "017 அன்னைப் பத்து ", "018 குயிற்பத்து ", "019 திருத்தசாங்கம்", "020 திருப்பள்ளியெழுச்சி ", "021 கோயில் மூத்த திருப்பதிகம்",
                "022 கோயில் திருப்பதிகம் ", "023 செத்திலாப் பத்து ", "024 அடைக்கலப் பத்து ", "025 ஆசைப்பத்து ", "026 அதிசயப் பத்து ", "027 புணர்ச்சிப்பத்து ", "028 வாழாப்பத்து ", "029 அருட்பத்து ",
                "030 திருக்கழுக்குன்றப் பதிகம்", "031 கண்டபத்து", "032 பிரார்த்தனைப் பத்து", "033 குழைத்த பத்து", "034 உயிருண்ணிப்பத்து ", "035 அச்சப்பத்து ", "036 திருப்பாண்டிப் பதிகம் ",
                "037 பிடித்த பத்து ", "038 திருவேசறவு ", "039 திருப்புலம்பல்", "040 குலாப் பத்து ", "041 அற்புதப்பத்து", "042 சென்னிப்பத்து", "043 திருவார்த்தை", "044 எண்ணப்பதிகம்",
                "045 யாத்திரைப் பத்து", "046 திருப்படை எழுச்சி ", "047 திருவெண்பா", "048 பண்டாய நான்மறை", "049 திருப்படை ஆட்சி", "050 ஆனந்தமாலை", "051 அச்சோப் பதிகம் "};

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,values);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i , long l) {
                switch (i)
                {
                    case 0:
                        Intent a0 = new Intent(Thiruvasagam.this,sivapuranam.class);
                        startActivity(a0);
                        break;
                    case 1:
                        Intent a1 = new Intent(Thiruvasagam.this,kerthi.class);
                        startActivity(a1);
                        break;
                    case 2:
                        Intent a2 = new Intent(Thiruvasagam.this, andapaguthi.class);
                        startActivity(a2);
                        break;
                    case 3:
                        Intent a3 = new Intent(Thiruvasagam.this,potri_agaval.class);
                        startActivity(a3);
                        break;
                    case 4:
                        Intent a4 = new Intent(Thiruvasagam.this, thiruchathagam.class);
                        startActivity(a4);
                        break;

                    case 5:
                        Intent a5 = new Intent(Thiruvasagam.this, nethalvinapam.class);
                        startActivity(a5);
                        break;

                    case 6:
                        Intent a6 = new Intent(Thiruvasagam.this, vembavai.class);
                        startActivity(a6);
                        break;

                    case 7:
                        Intent a7 = new Intent(Thiruvasagam.this, ammanai.class);
                        startActivity(a7);
                        break;
                    case 8:
                        Intent a8 = new Intent(Thiruvasagam.this, porsunam.class);
                        startActivity(a8);
                        break;

                    case 9:
                        Intent a9 = new Intent(Thiruvasagam.this, kothumbi.class);
                        startActivity(a9);
                        break;

                    case 10:
                        Intent a10 = new Intent(Thiruvasagam.this, thellenam.class);
                        startActivity(a10);
                        break;
                    case 11:
                        Intent a11 = new Intent(Thiruvasagam.this, thiruchalal.class);
                        startActivity(a11);
                        break;
                    case 12:
                        Intent a12 = new Intent(Thiruvasagam.this, poovalli.class);
                        startActivity(a12);
                        break;
                    case 13:
                        Intent a13 = new Intent(Thiruvasagam.this, unthiyar.class);
                        startActivity(a13);
                        break;
                    case 14:
                        Intent a14 = new Intent(Thiruvasagam.this, thonokkam.class);
                        startActivity(a14);
                        break;
                    case 15:
                        Intent a15 = new Intent(Thiruvasagam.this, ponusal.class);
                        startActivity(a15);
                        break;
                    case 16:
                        Intent a16 = new Intent(Thiruvasagam.this, annai.class);
                        startActivity(a16);
                        break;
                    case 17:
                        Intent a17 = new Intent(Thiruvasagam.this, kuil.class);
                        startActivity(a17);
                        break;
                    case 18:
                        Intent a18 = new Intent(Thiruvasagam.this, dhasangam.class);
                        startActivity(a18);
                        break;
                    case 19:
                        Intent a19 = new Intent(Thiruvasagam.this, palli.class);
                        startActivity(a19);
                        break;
                    case 20:
                        Intent a20 = new Intent(Thiruvasagam.this, koilmutha.class);
                        startActivity(a20);
                        break;
                    case 21:
                        Intent a21 = new Intent(Thiruvasagam.this, koil.class);
                        startActivity(a21);
                        break;
                    case 22:
                        Intent a22 = new Intent(Thiruvasagam.this, sethila.class);
                        startActivity(a22);
                        break;
                    case 23:
                        Intent a23 = new Intent(Thiruvasagam.this, adaikala.class);
                        startActivity(a23);
                        break;
                    case 24:
                        Intent a24 = new Intent(Thiruvasagam.this, asai.class);
                        startActivity(a24);
                        break;
                    case 25:
                        Intent a25 = new Intent(Thiruvasagam.this, athisaya.class);
                        startActivity(a25);
                        break;
                    case 26:
                        Intent a26 = new Intent(Thiruvasagam.this, punarchi.class);
                        startActivity(a26);
                        break;
                    case 27:
                        Intent a27 = new Intent(Thiruvasagam.this, vala.class);
                        startActivity(a27);
                        break;
                    case 28:
                        Intent a28 = new Intent(Thiruvasagam.this, arul.class);
                        startActivity(a28);
                        break;
                    case 29:
                        Intent a29 = new Intent(Thiruvasagam.this, kalukundram.class);
                        startActivity(a29);
                        break;
                    case 30:
                        Intent a30 = new Intent(Thiruvasagam.this, kanda.class);
                        startActivity(a30);
                        break;
                    case 31:
                        Intent a31 = new Intent(Thiruvasagam.this, pirathanai.class);
                        startActivity(a31);
                        break;
                    case 32:
                        Intent a32 = new Intent(Thiruvasagam.this, kulaitha.class);
                        startActivity(a32);
                        break;
                    case 33:
                        Intent a33 = new Intent(Thiruvasagam.this, uyiruni.class);
                        startActivity(a33);
                        break;
                    case 34:
                        Intent a34 = new Intent(Thiruvasagam.this, acha.class);
                        startActivity(a34);
                        break;
                    case 35:
                        Intent a35 = new Intent(Thiruvasagam.this, thirupa.class);
                        startActivity(a35);
                        break;
                    case 36:
                        Intent a36 = new Intent(Thiruvasagam.this, piditha.class);
                        startActivity(a36);
                        break;
                    case 37:
                        Intent a37 = new Intent(Thiruvasagam.this, esaravu.class);
                        startActivity(a37);
                        break;
                    case 38:
                        Intent a38 = new Intent(Thiruvasagam.this, polambal.class);
                        startActivity(a38);
                        break;
                    case 39:
                        Intent a39 = new Intent(Thiruvasagam.this, kula.class);
                        startActivity(a39);
                        break;
                    case 40:
                        Intent a40 = new Intent(Thiruvasagam.this, arputha.class);
                        startActivity(a40);
                        break;
                    case 41:
                        Intent a41 = new Intent(Thiruvasagam.this, senni.class);
                        startActivity(a41);
                        break;
                    case 42:
                        Intent a42 = new Intent(Thiruvasagam.this, varthai.class);
                        startActivity(a42);
                        break;
                    case 43:
                        Intent a43 = new Intent(Thiruvasagam.this, enna.class);
                        startActivity(a43);
                        break;
                    case 44:
                        Intent a44 = new Intent(Thiruvasagam.this, yathirai.class);
                        startActivity(a44);
                        break;
                    case 45:
                        Intent a45 = new Intent(Thiruvasagam.this, thirupadai.class);
                        startActivity(a45);
                        break;
                    case 46:
                        Intent a46 = new Intent(Thiruvasagam.this, venba.class);
                        startActivity(a46);
                        break;
                    case 47:
                        Intent a47 = new Intent(Thiruvasagam.this, pandaya.class);
                        startActivity(a47);
                        break;
                    case 48:
                        Intent a48 = new Intent(Thiruvasagam.this, padaiyatchi.class);
                        startActivity(a48);
                        break;
                    case 49:
                        Intent a49 = new Intent(Thiruvasagam.this, anandha.class);
                        startActivity(a49);
                        break;
                    case 50:
                        Intent a50 = new Intent(Thiruvasagam.this, acho.class);
                        startActivity(a50);
                        break;

                }
            }
        });


        //interstial ADD CODE


        generateAds();
    }

    public void generateAds(){

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-6585285349986336/6436349909", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        Toast.makeText(Thiruvasagam.this,"Ad Loaded", Toast.LENGTH_SHORT).show();
                        interstitialAd.show(Thiruvasagam.this);
                        interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);
                                Toast.makeText(Thiruvasagam.this, "Faild to show Ad", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();
                                Toast.makeText(Thiruvasagam.this,"Ad Shown Successfully",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                Toast.makeText(Thiruvasagam.this,"Ad Dismissed / Closed",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAdImpression() {
                                super.onAdImpression();
                                Toast.makeText(Thiruvasagam.this,"Ad Impression Count",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onAdClicked() {
                                super.onAdClicked();
                                Toast.makeText(Thiruvasagam.this,"Ad Clicked",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Toast.makeText(Thiruvasagam.this,"Failed to Load Ad because="+loadAdError.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });

    }
}

