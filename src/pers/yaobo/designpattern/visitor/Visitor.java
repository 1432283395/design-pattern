package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:05
 * @description 访问者接口
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA elementA);

    void visitConcreteElementB(ConcreteElementB elementB);
}
