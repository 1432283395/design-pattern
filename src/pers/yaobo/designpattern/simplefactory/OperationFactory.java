package pers.yaobo.designpattern.simplefactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:29
 * @description The class is a factory of create operate object.
 */
public class OperationFactory {
    /**
     * 创建具体的Operation对象
     *
     * @param type 操作类型表示符
     * @return Operation对象
     */
    public static Operation createOperate(String type) {
        Operation operation;
        switch (type) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:
                operation = null;
                break;
        }
        return operation;
    }
}
