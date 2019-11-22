package pers.yaobo.designpattern.mediator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:05
 * @description 抽象同事类
 */
public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
