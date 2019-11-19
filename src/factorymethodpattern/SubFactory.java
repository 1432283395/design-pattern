package factorymethodpattern;

import simplefactorypattern.Operation;
import simplefactorypattern.OperationSub;

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
