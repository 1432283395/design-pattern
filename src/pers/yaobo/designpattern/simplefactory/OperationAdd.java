package pers.yaobo.designpattern.simplefactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:39
 * @description The class represents addition.
 */
public class OperationAdd extends Operation {
    /**
     * Returns the result of addition
     *
     * @return the result of addition
     */
    @Override
    public double getResult() {
        return getNumber1() + getNumber2();
    }
}
