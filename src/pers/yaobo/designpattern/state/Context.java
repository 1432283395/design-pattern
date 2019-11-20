package pers.yaobo.designpattern.state;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 13:09
 * @description 上下文
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();
    }
}
