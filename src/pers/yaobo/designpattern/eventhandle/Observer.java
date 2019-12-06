package pers.yaobo.designpattern.eventhandle;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 8:28
 * @description 具体观察者
 */
public class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void operation(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
