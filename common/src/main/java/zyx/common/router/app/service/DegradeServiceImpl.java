package zyx.common.router.app.service;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

import zyx.common.router.RouterHub;

/**
 * 全局降级逻辑处理类
 */

@Route(path = RouterHub.ROUTER_DEGRADESERVICE)
public class DegradeServiceImpl implements DegradeService {
    private static final String TAG = "DegradeServiceImpl";
    
    @Override
    public void onLost(Context context, Postcard postcard) {
        Log.d(TAG, "onLost() called with: context = [" + context + "], postcard = [" + postcard + "]");
        if(context != null)
            Toast.makeText(context, "没有这个服务路径 ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {
        Log.d(TAG, "init: ");
    }
}
