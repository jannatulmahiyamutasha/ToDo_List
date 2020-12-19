package com.example.todo.Notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.todo.R;

public class Alertreciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context, "Mutasha")
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.todolist))
                .setSmallIcon(R.drawable.ic_check)
                .setContentTitle("Complete your Task.")
                .setContentText("Are you Complete your Task? ")

                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(200, notificationBuilder.build());
    }
}
