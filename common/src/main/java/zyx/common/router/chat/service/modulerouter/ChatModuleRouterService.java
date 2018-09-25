package zyx.common.router.chat.service.modulerouter;

import zyx.common.router.RouterHub;
import zyx.common.router.RouterUtils;
import zyx.common.router.chat.service.IChatService;

public class ChatModuleRouterService {

    public static int getSessionUnreadNum() {
        IChatService chatService = (IChatService) RouterUtils.navigation(RouterHub.CHAT_SERVICE_CHATSERVICE);
        if(chatService != null)
            return chatService.getSessionNums();
        else
            return -1;
    }
}
