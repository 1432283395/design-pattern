package pers.yaobo.designpattern.templatemethod;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 14:05
 * @description 具体实现类A
 */
public class ConcreteClassA extends AbstractTemplate{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
