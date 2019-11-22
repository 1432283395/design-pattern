package pers.yaobo.designpattern.chainofresponsibility;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:44
 * @description 具体处理类2
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("处理类2方法执行");
        } else {
            System.out.println("暂无后续处理");
        }
    }
}
