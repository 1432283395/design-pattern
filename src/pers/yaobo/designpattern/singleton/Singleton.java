package pers.yaobo.designpattern.singleton;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 14:21
 * @description 单例类
 */
public class Singleton {
    private static Singleton instance;

    //构造函数私有化，外界不可通过new来创建对象
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
