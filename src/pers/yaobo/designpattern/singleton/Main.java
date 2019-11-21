package pers.yaobo.designpattern.singleton;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 14:25
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        //返回为true，说明是同一个对象
    }
}
