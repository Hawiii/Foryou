package com.example.hawi.foryou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ForyouReceiver extends BroadcastReceiver {
    public ForyouReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Intent newIntent = context.getPackageManager()
                    .getLaunchIntentForPackage("com.example.hawi.foryou");
            context.startActivity(newIntent); // 开机自启（不会最小化）
        }
    }
}
