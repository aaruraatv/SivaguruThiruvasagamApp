package com.aaruraa.thiruvasagam.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

import com.aaruraa.thiruvasagam.R;
import com.aaruraa.thiruvasagam.splashscreen;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

import timber.log.Timber;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
 String mtag="MyFirebaseMessagingService";
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d(mtag,"Message Recivied in messaging service "+message.getData());
        if (message.getData()!=null)
        {
            showNotification(message,101);
        }
        if (message.getNotification()!=null)
        {
            showNotification(message,102);
        }
    }



    private void showNotification(RemoteMessage message, int i) {
        Map<String,String> messageData = message.getData();
        String notificationTitle ="";
        String notificationBody ="";
        String imageUrl ="";
        String notificationId = "1001";

        if (i==101)
        {
            notificationBody = messageData.get("body");
            notificationTitle = messageData.get("title");
        }
        else{
            notificationBody = message.getNotification().getBody();
            notificationTitle = message.getNotification().getTitle();
        }

        //pending Intent
        Intent intent = new Intent(this, splashscreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.BigTextStyle  bigTextStyle = new NotificationCompat.BigTextStyle().bigText(notificationBody);
        NotificationCompat.Builder builder  = new NotificationCompat.Builder(this, String.valueOf(notificationId))
                .setContentTitle(notificationTitle)
                .setContentText(notificationBody)
                .setSmallIcon(R.drawable.icon)
                .setColor(ContextCompat.getColor(this, com.example.jean.jcplayer.R.color.colorPrimary))
                .setContentIntent(pendingIntent)
                .setStyle(bigTextStyle);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel  = new NotificationChannel(
                    notificationId,"ShivaPuranam message Notification channel",
                    NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(channel);
        }
        notificationManager.notify(getString(R.string.app_name), Integer.parseInt(notificationId),builder.build());
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Timber.d("Token is "+token);
    }
}
