package com.example.hawi.foryou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private NetworkChangeReceiver networkChangeReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveFile("fileee", "testss", Context.MODE_APPEND);
//        System.out.print(loadFile("fileee"));
        Log.d("FileTest", loadFile("fileee"));

        Button tochat = (Button) findViewById(R.id.tochat);
        tochat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });
    }
}
