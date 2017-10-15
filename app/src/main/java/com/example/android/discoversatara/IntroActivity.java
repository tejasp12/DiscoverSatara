package com.example.android.discoversatara;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_intro);
        addSlide(new DiscoverSataraIntroFragment());
        addSlide(new HotelsFragment());
        addSlide(new HillResortsFragment());
        addSlide(new RestaurantsFragment());
        addSlide(new PicnicSpotsFragment());
        showSkipButton(true);
        setProgressButtonEnabled(true);
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intentToMain = new Intent(IntroActivity.this,MainActivity.class);
        startActivity(intentToMain);
    }
    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intentToMain = new Intent(IntroActivity.this,MainActivity.class);
        startActivity(intentToMain);
    }

    @Override
    public void setNavBarColor(@ColorRes int color) {
        super.setNavBarColor( R.color.nav_bar_color);
    }

    @Override
    public void setFlowAnimation() {
        super.setFlowAnimation();
    }
}
