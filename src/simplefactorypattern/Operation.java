package simplefactorypattern;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/3 23:34
 * @description 运算类
 */
public class Operation {
    private double number1 = 0;
    private double number2 = 0;

    double getNumber1() {
        return number1;
    }

    void setNumber1(double number1) {
        this.number1 = number1;
    }

    double getNumber2() {
        return number2;
    }

    void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return 0;
    }
}
