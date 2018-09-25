package zyx.common.router.chat.service.modulerouterhelper;

import zyx.common.router.RouterHub;
import zyx.common.router.RouterUtils;
import zyx.common.router.chat.service.IChatService;

public class ChatModuleServiceHelper {

//    IChatService chatService;

    private static ChatModuleServiceHelper instance;


    public static ChatModuleServiceHelper getInstance() {
        if(instance == null) {
            instance = new ChatModuleServiceHelper();
        }
        return instance;
    }

    public int getSessionUnreadNum() {
        IChatService chatService = (IChatService) RouterUtils.navigation(RouterHub.CHAT_SERVICE_CHATSERVICE);
        return chatService.getSessionNums();
    }
}
