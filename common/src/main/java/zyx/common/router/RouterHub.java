package zyx.common.router;

public interface RouterHub {
    /**
     * 组名
     */
    String ROUTER = "/router";// App 路由组件
    String MAIN = "/main";//宿主 App 组件
    String CHAT = "/chat";//聊天组件
    String CONTACT = "/contact";//联系人组件

    /**
     * 服务组件, 用于给每个组件暴露特有的服务
     */
    String SERVICE = "/service";

    /**
     * Router 级别的分组
     */
    String ROUTER_DEGRADESERVICE = ROUTER + SERVICE + "/DegradeService";
    String ROUTER_PATHREPLACESERVICE = ROUTER + SERVICE + "/PathReplaceService";


    /**
     * 宿主App分组
     */
    String APP_SPLASHACTIVITY = MAIN + "/SplashActivity";
    String APP_MAINACTIVITY = MAIN + "/MainActivity";


    /**
     * 通讯录分组
     */
    String CONTACT_SERVICE_CONTACTSERVICE = CONTACT + SERVICE + "/ContactService";

    /**
     * 聊天分组
     */
    String CHAT_SERVICE_CHATSERVICE = CHAT + SERVICE + "/ChatService";
    String CHAT_MODULE_CHATACTIVITY = CHAT  + "/ChatAcitivity";
    String CHAT_MODULE_LOGIN_CHATACTIVITY = CHAT  + "/LoginChatAcitivity";
    String CHAT_MODULE_TEST_ACTIVITY = CHAT  + "/testActivity";

}
