package pers.yaobo.designpattern.factorymethod;

import pers.yaobo.designpattern.simplefactory.Operation;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:33
 * @description 工厂接口
 */
public interface MyFactory {
    Operation createOperation();
}
