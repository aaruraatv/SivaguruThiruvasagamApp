package com.aaruraa.thiruvasagam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);



        String url1="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F02.sivapuranam.mp3?alt=media&token=2f7d27ff-a440-467b-9b0c-e6eb4e218de0";
        String url2="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F03.keerthi%20thiruagaval.mp3?alt=media&token=45f2d0cb-f4ab-4b03-887f-9e557c106164";
        String url3="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F04.%20thiru%20andapaguthi.mp3?alt=media&token=fdf64748-db47-432a-9793-1f23dd7fdc3a";
        String url4="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F05.potri%20thiruagaval.mp3?alt=media&token=eaac1101-44bc-464f-96f2-179e69958d07";
        String url501="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F06.thiruchathagam.mp3?alt=media&token=9cc90e15-4391-49bf-8beb-595e2d13a843";
        String url502="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F07.arivuruthal.mp3?alt=media&token=9c06500c-09f5-4cce-8ba6-6f39fb140f28";
        String url503="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F08.suttaruthal.mp3?alt=media&token=6ea6ebff-f023-44c6-a0e7-87cbcd79a5e2";
        String url504="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F09.aathmasuththi.mp3?alt=media&token=6ae1463f-f958-4405-aa3e-53318684705a";
        String url505="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F10.kaimaru%20koduthal.mp3?alt=media&token=b597d403-ee15-4816-bca7-5487343fcf29";
        String url506="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F011.anuboga%20suthi.mp3?alt=media&token=93e23ae6-864a-4c46-bf65-801ec66a5f96";
        String url507="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F12.karunyathu%20irangal.mp3?alt=media&token=ab08db62-29cf-450d-8a5e-5cd691b65ab3";
        String url508="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F13.%20anandhathu%20alunthuthal.mp3?alt=media&token=b8f7e481-8f95-4acd-98d3-c04259f09d10";
        String url509="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F14.anantha%20paravasam.mp3?alt=media&token=bb23a04b-8fed-46c3-8187-57cc2a7de383";
        String url510="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F15.ananthaatheetham.mp3?alt=media&token=bc2d40b0-2de6-418f-aeee-45112eae92e9";
        String url6="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F16.neethal%20vinnappam.mp3?alt=media&token=84b4d2bf-6dfc-4d00-b7f5-2898ef09600b";
        String url7="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F17.thiruvembaavai.mp3?alt=media&token=3da6ae47-a75f-4583-94f5-af9f067e7fcf";
        String url8="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F18.%20thiru%20ammanai.mp3?alt=media&token=a8c1dc78-496d-483a-8ce3-eb679e3b4fa3";
        String url9="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F19.%20thiru%20porchunnam.mp3?alt=media&token=2eaafa36-552d-44aa-a6c6-40d925e4cfe6";
        String url10="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F20.thiru%20korthumbi.mp3?alt=media&token=45b5170d-c062-4b52-92e6-99d6af003a22";
        String url11="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F21.%20thellenam.mp3?alt=media&token=4c8c3442-0eb3-402d-a9d1-ded79777fb84";
        String url12="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F22.thiruchazhal.mp3?alt=media&token=ce314ee3-c257-47fd-997d-1796eb2c4ce0";
        String url13="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F23.poovalli.mp3?alt=media&token=e6dc1c34-a026-4e4f-96d3-fcebabcbde68";
        String url14="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F24.unthiyaar.mp3?alt=media&token=de8521c9-e186-4924-a2b6-d726b91bb7ba";
        String url15="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F25%20tholnokkam.mp3?alt=media&token=0dc07b78-7feb-409c-92eb-06ee881b518f";
        String url16="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F26.ponoosal.mp3?alt=media&token=210c3108-94eb-4c8f-91b2-4ce3e8244287";
        String url17="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F27.annai%20pathu.mp3?alt=media&token=04f7ca4b-704d-4e07-987c-a07132d70df2";
        String url18="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F28.kuil%20pathu.mp3?alt=media&token=40ec9071-c451-4a8b-93c7-6b2292806688";
        String url19="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F29.%20dhasangam.mp3?alt=media&token=5e730a09-d2d1-4350-bdde-498acdde71d1";
        String url20="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F30.%20palli%20ezhuchi.mp3?alt=media&token=51b06df4-55df-4ccd-8899-9a33482731b3";
        String url21="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F31.%20koil%20mootha%20thirupathikal.mp3?alt=media&token=ef7cd3bd-7726-4680-9a8b-f1320d4a26da";
        String url22="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F32.%20koil%20thiruppathikam.mp3?alt=media&token=3541e06f-1af3-4338-8cda-3d1dd32ca682";
        String url23="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F33.%20sethilapathu.mp3?alt=media&token=7f0d7083-c9ab-452f-a3f7-a9e1260d3f23";
        String url24="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F34.%20saranagathi%20thathuvam.mp3?alt=media&token=26483d83-2276-4cf1-bed9-6e1979106390";
        String url25="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F35.%20aasaipathu.mp3?alt=media&token=ae820298-1448-42ff-a16f-c532410b5ee9";
        String url26="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F36.%20athisaya%20pathu.mp3?alt=media&token=5065ee2b-a7f7-4823-9632-2688951970c1";
        String url27="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F37.%20punarchi%20pathu.mp3?alt=media&token=0f4a757e-7b2e-4e70-a441-4a7adaf5ced6";
        String url28="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F38.%20vaalapathu.mp3?alt=media&token=48417076-3f6b-4125-b620-706b8ea31823";
        String url29="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F39.%20arul%20pathu.mp3?alt=media&token=3b54bdf2-ffb7-414e-add4-4de61db60701";
        String url30="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F40.%20thirukalukundara%20pathigam.mp3?alt=media&token=8b78779d-fe43-482c-9f3b-fd380b0cd50f";
        String url31="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F41.%20%20kandapthu.mp3?alt=media&token=2086973b-0a58-42f3-af91-b2f1f15dcef1";
        String url32="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F42.%20prathanai%20pathu.mp3?alt=media&token=acac71cd-88d7-40e6-9198-009124442085";
        String url33="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F43.kulaitha%20pathu.mp3?alt=media&token=bea5abe4-9bdc-4cb5-894f-044a228b6634";
        String url34="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F44%20.uyir%20unni%20pathi.mp3?alt=media&token=feeaba15-7a2e-4ef0-8cbd-bd00bcc27133";
        String url35="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F45.%20achapathu.mp3?alt=media&token=f6136f20-cd08-419c-9a08-887384354552";
        String url36="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F46.thiru%20pandi%20pathigam.mp3?alt=media&token=f9ac241b-13d8-4d5a-94c0-4a1dc67ed94c";
        String url37="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F47piditha%20pathu.mp3?alt=media&token=e6d77118-57ea-4f43-a22b-6d2cdf488448";
        String url38="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F48thiru%20easaravu.mp3?alt=media&token=d39c9392-b9d2-4826-a67c-176c9a366889";
        String url39="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F49.thiru%20pulambal.mp3?alt=media&token=4b274608-8bf6-4050-be52-f23325bdabb7";
        String url40="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F50.%20pulal%20pathu.mp3?alt=media&token=b7d6daee-b433-4fab-8db1-d6db6cb6f6a3";
        String url41="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F51.arputha%20pathu.mp3?alt=media&token=a9fcd67e-e390-466b-9247-c593b0154d4f";
        String url42="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F52.sennipathu.mp3?alt=media&token=c54a1fb0-31b6-4d8e-bb7a-fde2942cc93a";
        String url43="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F53.thiru%20varthai.mp3?alt=media&token=33c09aa9-ca82-4725-af35-25ed91a4eb2b";
        String url44="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F54.ennappathigam.mp3?alt=media&token=d891e95a-445a-4735-998e-3048f5c21178";
        String url45="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F55.yathirai%20pathu.mp3?alt=media&token=c89616f0-2773-4061-af8f-15ff1fa146eb";
        String url46="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F56.thirupadai%20ezhuchi.mp3?alt=media&token=8e072d98-9a00-4358-aba2-013bed5c0c5f";
        String url47="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F57.thiruvenba.mp3?alt=media&token=a027ecec-d9f0-4b73-8824-ac03a5faebc7";
        String url48="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F58.pandaya%20nanmarai.mp3?alt=media&token=c90fe0af-8d35-4e91-8c4f-26e4a937a580";
        String url49="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F59.thiruppadaiyatchi.mp3?alt=media&token=918e18dd-9fb4-4261-8af3-fa291bf6b82b";
        String url50="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F60.anandha%20maalai.mp3?alt=media&token=e89f29c0-4dee-4f54-9e11-0713b2a18793";
        String url51="https://firebasestorage.googleapis.com/v0/b/thiru1-46f68.appspot.com/o/THIRUVASAGAM%20SDA%2F61.acho%20pathigam.mp3?alt=media&token=509f9934-71dc-4375-8449-ae48e3890a24";


        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("01 சிவபுராணம்",url1));
        jcAudios.add(JcAudio.createFromURL("02. கீர்த்தித் திரு அகவல் ",url2));
        jcAudios.add(JcAudio.createFromURL("03. திருவண்டப் பகுதி",url3));
        jcAudios.add(JcAudio.createFromURL("04. போற்றித் திருஅகவல்",url4));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - மெய்யுணர்தல்",url501));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - அறிவுறுத்தல்",url502));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - சுட்டறுத்தல் ",url503));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - ஆத்மசுத்தி ",url504));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - கைம்மாறு கொடுத்தல்",url505));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - அனுபோக சுத்தி ",url506));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - காருண்யத்து இரங்கல்",url507));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - ஆனந்தத்து அழுந்துதல்",url508));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - ஆனந்த பரவசம்",url509));
        jcAudios.add(JcAudio.createFromURL("05. திருச்சதகம் - ஆனந்தாதீதம்",url510));
        jcAudios.add(JcAudio.createFromURL("06. நீத்தல் விண்ணப்பம்",url6));
        jcAudios.add(JcAudio.createFromURL("07. திருவெம்பாவை",url7));
        jcAudios.add(JcAudio.createFromURL("08. திரு அம்மானை",url8));
        jcAudios.add(JcAudio.createFromURL("09. திருப்பொற் சுண்ணம்",url9));
        jcAudios.add(JcAudio.createFromURL("10. திருக்கோத்தும்பி",url10));
        jcAudios.add(JcAudio.createFromURL("11.திருத்தெள்ளேணம்",url11));
        jcAudios.add(JcAudio.createFromURL("12. திருச்சாழல்",url12));
        jcAudios.add(JcAudio.createFromURL("13. திருப்பூவல்லி",url13));
        jcAudios.add(JcAudio.createFromURL("14. திருஉந்தியார்",url14));
        jcAudios.add(JcAudio.createFromURL("15. திருத்தேள் நோக்கம்",url15));
        jcAudios.add(JcAudio.createFromURL("16. திருப்பொன்னூசல்",url16));
        jcAudios.add(JcAudio.createFromURL("17. அன்னைப் பத்து",url17));
        jcAudios.add(JcAudio.createFromURL("18. குயிற்பத்து",url18));
        jcAudios.add(JcAudio.createFromURL("19. திருத்தசாங்கம்",url19));
        jcAudios.add(JcAudio.createFromURL("20. திருப்பள்ளியெழுச்சி",url20));
        jcAudios.add(JcAudio.createFromURL("21. கோயில் மூத்த திருப்பதிகம்",url21));
        jcAudios.add(JcAudio.createFromURL("22. கோயில் திருப்பதிகம்",url22));
        jcAudios.add(JcAudio.createFromURL("23. செத்திலாப் பத்து",url23));
        jcAudios.add(JcAudio.createFromURL("24. அடைக்கலப் பத்து",url24));
        jcAudios.add(JcAudio.createFromURL("25. ஆசைப்பத்து",url25));
        jcAudios.add(JcAudio.createFromURL("26. அதிசியப் பத்து",url26));
        jcAudios.add(JcAudio.createFromURL("27. புணர்ச்சிப்பத்து",url27));
        jcAudios.add(JcAudio.createFromURL("28. வாழாப்பத்து",url28));
        jcAudios.add(JcAudio.createFromURL("29. அருட்பத்து",url29));
        jcAudios.add(JcAudio.createFromURL("30. திருக்கழுக்குன்றப் பதிகம்",url30));
        jcAudios.add(JcAudio.createFromURL("31. கண்டபத்து",url31));
        jcAudios.add(JcAudio.createFromURL("32. பிரார்த்தனைப் பத்து",url32));
        jcAudios.add(JcAudio.createFromURL("33. குழைத்தப் பத்து",url33));
        jcAudios.add(JcAudio.createFromURL("34. உயிருண்ணிப்பத்து",url34));
        jcAudios.add(JcAudio.createFromURL("35. அச்சப்பத்து",url35));
        jcAudios.add(JcAudio.createFromURL("36. திருப்பாண்டிப் பதிகம்",url36));
        jcAudios.add(JcAudio.createFromURL("37. பிடித்த பத்து",url37));
        jcAudios.add(JcAudio.createFromURL("38. திருஏசறவு",url38));
        jcAudios.add(JcAudio.createFromURL("39. திருப்புலம்பல்",url39));
        jcAudios.add(JcAudio.createFromURL("40. குலாப் பத்து",url40));
        jcAudios.add(JcAudio.createFromURL("41. அற்புதப்பத்து",url41));
        jcAudios.add(JcAudio.createFromURL("42. சென்னிப்பத்து",url42));
        jcAudios.add(JcAudio.createFromURL("43. திருவார்த்தை",url43));
        jcAudios.add(JcAudio.createFromURL("44. எண்ணப்பதிகம்",url44));
        jcAudios.add(JcAudio.createFromURL("45. யாத்திரைப் பத்து",url45));
        jcAudios.add(JcAudio.createFromURL("46. திருப்படை எழுச்சி",url46));
        jcAudios.add(JcAudio.createFromURL("47. திருவெண்பா",url47));
        jcAudios.add(JcAudio.createFromURL("48. பண்டாய நான்மறை",url48));
        jcAudios.add(JcAudio.createFromURL("49. திருப்படை ஆட்சி",url49));
        jcAudios.add(JcAudio.createFromURL("50. ஆனந்தமாலை",url50));
        jcAudios.add(JcAudio.createFromURL("51. அச்சோப் பதிகம்",url51));




        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon

    }
}