package zyx.module.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import zyx.common.base.BaseActivity;
import zyx.common.router.RouterHub;

@Route(path = RouterHub.CHAT_MODULE_TEST_ACTIVITY, name = "测试用Activity")
public class TestActivity extends BaseActivity {
    private static final String TAG = "TestActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("this is TestActivity");
        setContentView(tv);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }
}
