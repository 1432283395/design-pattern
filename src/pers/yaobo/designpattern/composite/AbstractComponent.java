package pers.yaobo.designpattern.composite;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 8:31
 * @description 部件抽象
 */
public abstract class AbstractComponent {
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public abstract void add(AbstractComponent component);

    public abstract void remove(AbstractComponent component);

    public abstract void display(int depth);
}
