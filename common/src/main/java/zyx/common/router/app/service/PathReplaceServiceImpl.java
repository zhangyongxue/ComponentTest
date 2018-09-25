package zyx.common.router.app.service;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

import zyx.common.router.RouterHub;

@Route(path = RouterHub.ROUTER_PATHREPLACESERVICE)
public class PathReplaceServiceImpl implements PathReplaceService {
    private static final String TAG = "PathReplaceServiceImpl";
    
    @Override
    public String forString(String path) {
        Log.d(TAG, "forString() called with: path = [" + path + "]");
        return path;
    }

    @Override
    public Uri forUri(Uri uri) {
        Log.d(TAG, "forUri() called with: uri = [" + uri + "]");
        return uri;
    }

    @Override
    public void init(Context context) {
        Log.d(TAG, "init: ");
    }
}
