package zyx.componenttest;

import android.util.Log;

import zyx.common.base.BaseApplication;

public class MyApplication extends BaseApplication{
    private static final String TAG = "abcd";
    @Override
    public void onCreate() {
        Log.d(TAG, "MyApplication onCreate: ");
        super.onCreate();
    }
}
