package pers.yaobo.designpattern.adapter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 15:27
 * @description 前锋
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + "前锋防守");
    }
}
