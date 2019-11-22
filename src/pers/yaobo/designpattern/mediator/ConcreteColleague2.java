package pers.yaobo.designpattern.mediator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:17
 * @description 具体同事类2
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("2收到消息：" + message);
    }
}
