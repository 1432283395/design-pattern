package pers.yaobo.designpattern.bridge;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 14:57
 * @description 具体实施者B
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实施者B的方法执行");
    }
}
