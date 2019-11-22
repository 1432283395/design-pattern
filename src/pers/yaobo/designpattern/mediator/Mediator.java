package pers.yaobo.designpattern.mediator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 10:04
 * @description 中介者接口
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}
