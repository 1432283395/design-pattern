package pers.yaobo.designpattern.simplefactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:39
 * @description The class represents subtraction.
 */
public class OperationSub extends Operation {
    /**
     * Returns the result of subtraction
     *
     * @return the result of subtraction
     */
    @Override
    public double getResult() {
        return getNumber1() - getNumber2();
    }
}
