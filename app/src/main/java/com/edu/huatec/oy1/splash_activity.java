package com.edu.huatec.oy1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashi_activity);
setContentView(R.layout.splashi_activity);
     ImageView loading=findViewById(R.id.tv_loading);

       Animation animation= AnimationUtils.loadAnimation(splash_activity.this,R.anim.oo);

animation.setFillAfter(true);

animation.setAnimationListener(new Animation.AnimationListener() {
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
});
        loading.startAnimation(animation);


    }
}
