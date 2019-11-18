package strategypattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 13:18
 * @description 具体策略B
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("具体策略B实现");
    }
}
