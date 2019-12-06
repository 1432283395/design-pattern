package pers.yaobo.designpattern.command;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:18
 * @description 接收者
 */
public class Receiver {
    public void action() {
        System.out.println("执行请求！");
    }


    public static void main(String[] args) {
        Command command = () -> new Receiver().action();
        command.execute();
    }
}
