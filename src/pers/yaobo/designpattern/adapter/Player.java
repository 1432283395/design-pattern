package pers.yaobo.designpattern.adapter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 15:24
 * @description 球员类
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
