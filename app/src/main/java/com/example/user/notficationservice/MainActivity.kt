package com.example.user.notficationservice

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun notify(v: View)
    {
        var nManager=getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
        var builder = NotificationCompat.Builder(this,
                "")
        builder.setTicker("Sample Message for Demo")
        builder.setSmallIcon(R.drawable.ic_business_center_black_24dp)
        builder.setContentTitle("Sample Message for Demo")
        builder.setSubText("this is a sample message for demostration ")
        builder.setContentText("this is a sample message for demostration ")
        builder.setAutoCancel(true)
        var i = Intent(this,MainActivity::class.java)
        var pIntent = PendingIntent.getActivity(this,0,
                i,0)
        builder.setContentIntent(pIntent)
        builder.addAction(R.drawable.ic_business_center_black_24dp,"cancel",pIntent)
        nManager.notify(System.currentTimeMillis().toInt(),builder.build())

    }
}
