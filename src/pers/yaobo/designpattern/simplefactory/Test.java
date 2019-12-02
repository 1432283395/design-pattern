package pers.yaobo.designpattern.simplefactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 15:08
 * @description 简单工厂测试类
 */
public class Test {
    public static void main(String[] args) {
        Operation operation;

        operation = OperationFactory.createOperate("+");
        operation.setNumber1(1);
        operation.setNumber2(2);
        System.out.format("%.2f + %.2f = %.2f\n", operation.getNumber1(), operation.getNumber2(), operation.getResult());

        operation = OperationFactory.createOperate("-");
        operation.setNumber1(2);
        operation.setNumber2(1);
        System.out.format("%.2f - %.2f = %.2f\n", operation.getNumber1(), operation.getNumber2(), operation.getResult());
    }
}
