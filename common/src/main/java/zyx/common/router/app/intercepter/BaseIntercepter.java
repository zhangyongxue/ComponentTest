package zyx.common.router.app.intercepter;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

import zyx.common.router.RouterConstant;
import zyx.common.router.RouterHub;
import zyx.common.router.RouterUtils;

@Interceptor(priority = 1, name = "基类拦截器")
public class BaseIntercepter implements IInterceptor{
    private static final String TAG = "BaseIntercepter";
    
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        Log.d(TAG, "process: ");
        if(postcard.getExtra() == RouterConstant.LOGIN_EXTRA) {
            boolean isLogin = false;
            if(isLogin) {
                postcard.withString("isLogin", "是登录用户");
                callback.onContinue(postcard);
            }
            else {
                RouterUtils.navigation(RouterHub.CHAT_MODULE_LOGIN_CHATACTIVITY);
            }
        }
        else {
            callback.onContinue(postcard);
        }

    }

    @Override
    public void init(Context context) {

    }
}
