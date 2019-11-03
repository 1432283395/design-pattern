package simplefactorypattern;

/**
 * @ClassName OperationFactory
 * @Description 简单运算工厂类
 * @Author yaobo
 * @Date 2019/11/3 23:29
 * @Version 1.0
 */
public class OperationFactory {
    /**
     * 生产运算对象
     *
     * @param operate 运算类型
     * @return 运算对象
     */
    public static Operation createOperate(String operate) {
        Operation operation;
        switch (operate) {
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

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumber1(1);
        operation.setNumber2(2);
        System.out.print("运算结果：" + operation.getResult());
    }
}
