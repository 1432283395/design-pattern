package pers.yaobo.designpattern.eventhandle;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/12/6 11:30
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new Observer("小明");
        concreteSubject.addListener(observer, "operation", "通知");

        concreteSubject.notifyObserver();
    }
}
