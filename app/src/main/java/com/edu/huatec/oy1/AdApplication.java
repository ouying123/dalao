package com.edu.huatec.oy1;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.logging.Handler;

public class AdApplication extends AppCompatActivity {
    TextView ad;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
    ad=findViewById(R.id.tv_ad);

new Thread(new Runnable() {
    @Override
    public void run() {
        for(int i=5;i>=0;i--){
            SystemClock.sleep(1000);

            final int oo=i;
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ad.setText("点击跳转"+oo);
                }
            });

        }
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(AdApplication.this,MainActivity.class);
                startActivity(intent);
                fileList();
            }
        });
    }
}).start();





    }
}
