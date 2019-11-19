package pers.yaobo.designpattern.templatemethod;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 14:13
 * @description TODO
 */
public class ConcreteClassB extends AbstractTemplate {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
