package com.example.crosswalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mXWalkView = findViewById(R.id.xwalkview);
        init();
    }


    private void init() {
        String url = "http://h5.shumensy.com/rakshasa-street";
        mXWalkView.load(url, null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mXWalkView != null){
            mXWalkView.resumeTimers();
            mXWalkView.onShow();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mXWalkView != null){
            mXWalkView.pauseTimers();
            mXWalkView.onHide();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mXWalkView != null){
            mXWalkView.onDestroy();
        }
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (mXWalkView != null){
//            mXWalkView.onActivityResult(requestCode, resultCode, data);
//        }
//    }

//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        if (mXWalkView != null){
//            mXWalkView.onNewIntent(intent);
//        }
//    }
}
