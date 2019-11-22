package pers.yaobo.designpattern.flyweight;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:48
 * @description 具体享元
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight：" + extrinsicState);
    }
}
