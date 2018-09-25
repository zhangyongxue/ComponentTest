package debug;

import android.util.Log;

import zyx.common.base.BaseApplication;


public class ChatApplication extends BaseApplication {
    private static final String TAG = "ChatApplication";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
        super.onCreate();
    }
}
