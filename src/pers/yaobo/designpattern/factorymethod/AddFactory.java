package pers.yaobo.designpattern.factorymethod;

import pers.yaobo.designpattern.simplefactory.Operation;
import pers.yaobo.designpattern.simplefactory.OperationAdd;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:34
 * @description 加法工厂
 */
public class AddFactory implements MyFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
