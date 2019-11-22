package pers.yaobo.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 13:10
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        List<Expression> expressionList = new ArrayList<>();
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonTerminalExpression());

        context.setInput("哈哈");
        for (Expression expression : expressionList) {
            expression.interpret(context);
        }
    }
}
