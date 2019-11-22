package pers.yaobo.designpattern.chainofresponsibility;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:44
 * @description 具体处理类1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("处理类1方法执行");
        } else {
            successor.handleRequest(request);
        }
    }
}
