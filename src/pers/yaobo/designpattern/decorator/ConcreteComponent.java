package pers.yaobo.designpattern.decorator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 14:06
 * @description 具体组件类
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体组件：");
    }

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
