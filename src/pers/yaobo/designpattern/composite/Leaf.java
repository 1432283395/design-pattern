package pers.yaobo.designpattern.composite;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 8:35
 * @description 叶子节点
 */
public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(AbstractComponent component) {
        System.out.println("cannot remove to a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        while (depth > 0) {
            stringBuilder.append("-");
            depth --;
        }
        System.out.println(stringBuilder.toString() + name);
    }

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));

        Composite composite1 = new Composite("Composite X");
        composite1.add(new Leaf("Leaf XA"));
        composite1.add(new Leaf("Leaf XB"));
        root.add(composite1);

        Composite composite2 = new Composite("Composite Y");
        composite2.add(new Leaf("Leaf YA"));
        composite2.add(new Leaf("Leaf YB"));
        composite1.add(composite2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
