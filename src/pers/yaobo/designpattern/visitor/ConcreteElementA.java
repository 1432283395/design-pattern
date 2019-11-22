package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:11
 * @description 具体元素A
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
