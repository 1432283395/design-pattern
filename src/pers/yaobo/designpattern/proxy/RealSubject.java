package pers.yaobo.designpattern.proxy;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:16
 * @description 真实主体
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
