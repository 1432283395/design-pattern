package pers.yaobo.designpattern.facade;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 15:15
 * @description 外观类
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    public void methodOne() {
        System.out.println("方法组一：");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodTwo() {
        System.out.println("方法组二：");
        subSystemTwo.methodTwo();
        subSystemOne.methodOne();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodOne();
        facade.methodTwo();
    }
}
