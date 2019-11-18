package simplefactorypattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:39
 * @description 减法运算类
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumber1() - getNumber2();
    }
}
