package pers.yaobo.designpattern.decorator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 15:57
 * @description 装饰模式测试类
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator1 decorator1 = new ConcreteDecorator1();
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2();

        decorator1.setComponent(component);
        decorator2.setComponent(decorator1);
        decorator2.operation();
    }
}
