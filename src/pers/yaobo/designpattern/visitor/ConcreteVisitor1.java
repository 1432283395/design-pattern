package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:16
 * @description 具体访问者1
 */
public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.format("%s被%s访问\n", elementA.getClass().getSimpleName(), this.getClass().getSimpleName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.format("%s被%s访问\n", elementB.getClass().getSimpleName(), this.getClass().getSimpleName());
    }
}
