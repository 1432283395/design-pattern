package pers.yaobo.designpattern.bridge;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 15:14
 * @description 抽象
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
