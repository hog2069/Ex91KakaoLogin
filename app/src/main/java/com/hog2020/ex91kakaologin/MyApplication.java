package com.hog2020.ex91kakaologin;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this,"add7047ef3e9f85dfde59c6c4727a12e");
    }
}
