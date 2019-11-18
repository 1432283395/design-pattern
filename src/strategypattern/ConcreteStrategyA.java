package strategypattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 13:15
 * @description 具体策略A
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("具体策略A实现");
    }
}
