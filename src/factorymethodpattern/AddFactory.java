package factorymethodpattern;

import simplefactorypattern.Operation;
import simplefactorypattern.OperationAdd;

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
