package pers.yaobo.designpattern.mediator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:17
 * @description 具体同事类1
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("1收到消息：" + message);
    }
}
