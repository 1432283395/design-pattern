package pers.yaobo.designpattern.mediator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:11
 * @description 具体中介者类
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1) {
            concreteColleague2.notify(message);
        } else {
            concreteColleague1.notify(message);
        }
    }

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("小菜鸟你好，2号同事");
        concreteColleague2.send("大神你好，1号同事");
    }
}
