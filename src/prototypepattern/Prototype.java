package prototypepattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:50
 * @description 原型
 */
public class Prototype implements Cloneable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype c1 = new Prototype("1");
        Prototype c2 = (Prototype) c1.clone();

        System.out.println(c2.getId());
    }
}
