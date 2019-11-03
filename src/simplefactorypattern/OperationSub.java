package simplefactorypattern;

/**
 * @ClassName OperationSub
 * @Description 减法运算类
 * @Author yaobo
 * @Date 2019/11/3 23:44
 * @Version 1.0
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumber1() - getNumber2();
    }
}
