package simplefactorypattern;

/**
 * @ClassName OperationAdd
 * @Description 加法运算类
 * @Author yaobo
 * @Date 2019/11/3 23:39
 * @Version 1.0
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumber1() + getNumber2();
    }
}
