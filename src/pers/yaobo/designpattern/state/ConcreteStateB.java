package pers.yaobo.designpattern.state;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 13:12
 * @description 具体状态类B
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("状态更新为A");
        context.setState(new ConcreteStateA());
    }
}
