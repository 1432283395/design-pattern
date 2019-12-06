package pers.yaobo.designpattern.eventhandle;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/12/6 11:16
 * @description 具体通知者
 */
public class ConcreteSubject extends Subject {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyObserver() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
