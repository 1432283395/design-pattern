package pers.yaobo.designpattern.simplefactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:39
 * @description 减法类
 */
public class OperationSub extends Operation {
    /**
     * 返回减法运算结果
     *
     * @return 减法运算结果
     */
    @Override
    public double getResult() {
        return getNumber1() - getNumber2();
    }
}
