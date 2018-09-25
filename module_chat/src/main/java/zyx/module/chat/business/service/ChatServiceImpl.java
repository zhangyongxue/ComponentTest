package zyx.module.chat.business.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

import zyx.common.router.RouterHub;
import zyx.common.router.chat.service.IChatService;

@Route(path = RouterHub.CHAT_SERVICE_CHATSERVICE, name="聊天服务")
public class ChatServiceImpl implements IChatService {
    private static final String TAG = "ChatServiceImpl";

    @Override
    public int getSessionNums() {
        return 5;
    }

    @Override
    public void init(Context context) {
        Log.d(TAG, "init: ");
    }
}
