package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:11
 * @description 具体元素A
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
