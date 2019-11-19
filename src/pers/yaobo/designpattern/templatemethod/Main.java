package pers.yaobo.designpattern.templatemethod;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 14:57
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        AbstractTemplate template;
        template = new ConcreteClassA();
        template.templateMethod();

        template = new ConcreteClassB();
        template.templateMethod();
    }
}
