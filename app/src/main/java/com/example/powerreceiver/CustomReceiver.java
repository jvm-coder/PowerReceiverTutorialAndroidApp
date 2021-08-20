package com.example.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();

        if(intentAction != null) {
            String tstMsg = "Unknown action";
            switch (intentAction) {
                case Intent.ACTION_POWER_CONNECTED:
                    tstMsg = "Power CONNECTED !";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    tstMsg = "Power DISCONNECTED !";
                    break;
            }
            Toast.makeText(context, tstMsg, Toast.LENGTH_SHORT).show();
        }
    }
}