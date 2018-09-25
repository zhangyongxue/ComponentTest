package zyx.common.base.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;

public class Utils {

    private static final String TAG = "Utils";

    public static boolean isApkInDebug(Context context) {
        try {
            ApplicationInfo info = context.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
