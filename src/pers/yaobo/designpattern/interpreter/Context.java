package pers.yaobo.designpattern.interpreter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 13:05
 * @description 上下文
 */
public class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
