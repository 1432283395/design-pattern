package pers.yaobo.designpattern.observer;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 8:28
 * @description 具体观察者
 */
public class ConcreteObserver implements Observer {
    private String name;
    private String message;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到消息：" + message);
        this.message = message;
    }

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attachObserver(new ConcreteObserver("小蓝"));
        concreteSubject.attachObserver(new ConcreteObserver("小红"));
        concreteSubject.attachObserver(new ConcreteObserver("小紫"));

        concreteSubject.setMessage("消息");
        concreteSubject.notifyObserver();
    }
}
