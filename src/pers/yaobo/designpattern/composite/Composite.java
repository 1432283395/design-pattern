package pers.yaobo.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 8:50
 * @description 枝节点
 */
public class Composite extends AbstractComponent {

    private List<AbstractComponent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent component) {
        children.add(component);
    }

    @Override
    public void remove(AbstractComponent component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        int flag = depth;
        while (flag > 0) {
            stringBuilder.append("-");
            flag --;
        }
        System.out.println(stringBuilder.toString() + name);
        children.forEach(item -> item.display(depth +1));
    }
}
