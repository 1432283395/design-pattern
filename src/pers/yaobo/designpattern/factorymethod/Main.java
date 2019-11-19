package pers.yaobo.designpattern.factorymethod;

import pers.yaobo.designpattern.simplefactory.Operation;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:41
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        MyFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumber1(1);
        operation.setNumber2(2);
        System.out.println(operation.getResult());
    }
}
