package pers.yaobo.designpattern.strategy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 15:34
 * @description 策略模式运行类
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategy1());
        context.contextInterface();

        context = new Context(new ConcreteStrategy2());
        context.contextInterface();
    }
}
