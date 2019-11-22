package pers.yaobo.designpattern.chainofresponsibility;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:42
 * @description 处理
 */
public abstract class Handler {
    Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
