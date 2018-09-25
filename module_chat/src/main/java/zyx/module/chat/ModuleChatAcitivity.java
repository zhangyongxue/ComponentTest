package zyx.module.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import zyx.common.base.BaseActivity;
import zyx.common.router.RouterConstant;
import zyx.common.router.RouterHub;


@Route(path = RouterHub.CHAT_MODULE_CHATACTIVITY, name = "聊天页面", extras = RouterConstant.LOGIN_EXTRA)
public class ModuleChatAcitivity extends BaseActivity {
    private static final String TAG = "ModuleChatAcitivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("This is Module chat");
        setContentView(tv);

        Bundle data = this.getIntent().getExtras();
        if(data != null && data.containsKey("key")) {
            String value = (String) data.get("key");
            Log.d(TAG, "onCreate: value == " + value);
        }
    }
}
