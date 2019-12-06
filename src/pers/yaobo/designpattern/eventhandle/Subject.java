package pers.yaobo.designpattern.eventhandle;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/12/6 11:14
 * @description 外观类
 */
public abstract class Subject {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object, String methodName, Object... args);

    public abstract void notifyObserver();
}
