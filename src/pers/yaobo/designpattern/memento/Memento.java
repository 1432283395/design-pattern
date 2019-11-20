package pers.yaobo.designpattern.memento;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 16:15
 * @description 备忘录
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
