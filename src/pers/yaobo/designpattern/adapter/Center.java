package pers.yaobo.designpattern.adapter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 15:30
 * @description 中锋
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + "中锋防守");
    }
}
