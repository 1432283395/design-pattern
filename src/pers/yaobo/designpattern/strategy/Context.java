package pers.yaobo.designpattern.strategy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 13:19
 * @description 上下文
 */
public class Context {
    private Strategy strategy;

    private Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
