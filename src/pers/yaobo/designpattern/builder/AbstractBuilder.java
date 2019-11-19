package pers.yaobo.designpattern.builder;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 16:25
 * @description 抽象建造者
 */
public abstract class AbstractBuilder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
