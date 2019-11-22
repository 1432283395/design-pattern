package pers.yaobo.designpattern.interpreter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 13:07
 * @description 终结符表达式
 */
public class TerminalExpression implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器" + context.getInput());
    }
}
