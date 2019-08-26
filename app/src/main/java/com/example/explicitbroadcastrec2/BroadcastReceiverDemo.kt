package com.example.explicitbroadcastrec2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiverDemo : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Broadcast Received from other App", Toast.LENGTH_LONG).show()
    }

}