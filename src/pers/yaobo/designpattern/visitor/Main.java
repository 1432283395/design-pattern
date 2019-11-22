package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:22
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        objectStructure.accept(concreteVisitor1);
    }
}
