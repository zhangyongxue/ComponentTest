package zyx.module.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import zyx.common.base.BaseActivity;
import zyx.common.router.RouterHub;
import zyx.common.router.RouterUtils;
import zyx.common.router.chat.service.modulerouter.ChatModuleRouterService;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "abcd";
    Button btn1, btn2, btn3;

//    @Autowired(name = RouterHub.CHAT_SERVICE_CHATSERVICE)
//    IChatService chatService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "MainActivity oncreate(): ");
        setContentView(R.layout.module_activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

//        ARouter.getInstance().inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onClick(View v) {
        if (v == btn1) {
            Bundle data = new Bundle();
            data.putString("key", "this is str from mainActivity");
            RouterUtils.navigation(MainActivity.this, RouterHub.CHAT_MODULE_CHATACTIVITY, data);
        } else if (v == btn2) {
//            int sessionNum = chatService.getSessionNums();
            int sessionNum = ChatModuleRouterService.getSessionUnreadNum();
            Log.d(TAG, "onClick: sessionNum == " + sessionNum);
        } else if(v == btn3) {
            Bundle data = new Bundle();
            data.putString("key", "this is str for check login from mainactivty");
            RouterUtils.navigation(MainActivity.this, RouterHub.CHAT_MODULE_TEST_ACTIVITY);
        }
    }
}
