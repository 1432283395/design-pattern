package pers.yaobo.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 11:25
 * @description 享元工厂
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }

    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("X");
        flyweight1.operation(--extrinsicState);

        Flyweight flyweight2 = factory.getFlyweight("Y");
        flyweight2.operation(--extrinsicState);

        Flyweight flyweight3 = factory.getFlyweight("Z");
        flyweight3.operation(--extrinsicState);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);
    }
}
