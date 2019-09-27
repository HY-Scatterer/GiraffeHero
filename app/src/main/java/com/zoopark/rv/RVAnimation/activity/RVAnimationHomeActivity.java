package com.zoopark.rv.RVAnimation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.zoopark.rvprovider.R;

public class RVAnimationHomeActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_animation_home);
        // 绑定控件
        mToolbar = findViewById(R.id.toolbar);
        // 设置标题栏
        setSupportActionBar(mToolbar);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onFadeAnimClick(View view) {
        startActivity(new Intent(this, RVAnimationFadeActivity.class));
    }

    public void onFlipAnimClick(View view) {
        startActivity(new Intent(this, RVAnimationFlipActivity.class));
    }

    public void onScaleAnimClick(View view) {
        startActivity(new Intent(this, RVAnimationScaleActivity.class));
    }

    public void onTranslationClick(View view) {
        startActivity(new Intent(this, RVAnimationTranslationActivity.class));
    }
}
