package com.example.b00686396.clearthoughtfinalproject;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.app.NotificationManager;
import android.app.NotificationChannel;
import android.app.AlarmManager;

public class AlarmReceiver {
    @TargetApi(26)
    @Override
    public void onReceive(Context context, Intent intent) {


        CharSequence name = NotificationChannel.DEFAULT_CHANNEL_ID;
        String description = "Default";
        int importance = NotificationManagerCompat.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel(NotificationChannel.DEFAULT_CHANNEL_ID,
                name,  NotificationManager.IMPORTANCE_DEFAULT);
        channel.setDescription(description);
        // Register the channel with the system
        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);


        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context,
                NotificationChannel.DEFAULT_CHANNEL_ID)
                .setContentTitle("Goal Logging")
                .setContentText("Remember to log your goals before going to sleep! :)")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
    }

    private void setRecurringAlarm(Context context) {

    }

}
