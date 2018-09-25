package debug;

import android.util.Log;

import zyx.common.base.BaseApplication;


public class MainApplication extends BaseApplication {
    private static final String TAG = "MainApplication";
    
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
