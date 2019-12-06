package pers.yaobo.designpattern.observer;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 8:11
 * @description 订阅者接口
 */
public interface Subject {
    void attachObserver(Observer o);

    void detachObserver(Observer o);

    void notifyObserver();
}
