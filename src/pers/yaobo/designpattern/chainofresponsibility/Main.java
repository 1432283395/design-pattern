package pers.yaobo.designpattern.chainofresponsibility;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:48
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);

        int[] requests = {2, 5, 14, 18, 3, 20};
        for (int i : requests) {
            handler1.handleRequest(i);
        }
    }
}
