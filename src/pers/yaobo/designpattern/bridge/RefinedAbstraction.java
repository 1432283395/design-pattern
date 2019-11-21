package pers.yaobo.designpattern.bridge;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 15:17
 * @description 被提炼的抽象
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
