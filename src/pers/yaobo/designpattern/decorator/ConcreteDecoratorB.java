package pers.yaobo.designpattern.decorator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 14:24
 * @description 具体装饰对象B
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
        System.out.println("具体装饰对象B的额外行为，以区别A");
    }
}
