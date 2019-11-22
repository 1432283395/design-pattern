package pers.yaobo.designpattern.strategy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 13:15
 * @description 具体策略类1
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("具体策略2实现");
    }
}
