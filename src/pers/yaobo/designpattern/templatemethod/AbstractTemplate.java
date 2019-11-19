package pers.yaobo.designpattern.templatemethod;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 14:00
 * @description 抽象模板
 */
public abstract class AbstractTemplate {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
