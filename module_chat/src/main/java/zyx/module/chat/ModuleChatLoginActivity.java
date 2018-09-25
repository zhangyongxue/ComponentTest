package zyx.module.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import zyx.common.base.BaseActivity;
import zyx.common.router.RouterHub;

@Route(path = RouterHub.CHAT_MODULE_LOGIN_CHATACTIVITY, name = "测试用的登录页面")
public class ModuleChatLoginActivity extends BaseActivity {
    private static final String TAG = "ModuleChatLoginActivity";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("this is login");
        setContentView(tv);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }
}
