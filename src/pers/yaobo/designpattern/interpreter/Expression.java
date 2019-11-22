package pers.yaobo.designpattern.interpreter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 13:03
 * @description 抽象表达
 */
public interface Expression {
    void interpret(Context context);
}
