package pers.yaobo.designpattern.bridge;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 14:57
 * @description 具体实施者A
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实施者A的方法执行");
    }
}
