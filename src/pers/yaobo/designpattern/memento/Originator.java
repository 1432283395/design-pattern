package pers.yaobo.designpattern.memento;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 16:14
 * @description 发起人
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("State = " + state);
    }
}
