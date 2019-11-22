package pers.yaobo.designpattern.strategy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 13:19
 * @description 全局上下文
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
