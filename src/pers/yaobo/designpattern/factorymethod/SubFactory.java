package pers.yaobo.designpattern.factorymethod;

import pers.yaobo.designpattern.simplefactory.Operation;
import pers.yaobo.designpattern.simplefactory.OperationSub;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 8:35
 * @description 减法工厂
 */
public class SubFactory implements MyFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
