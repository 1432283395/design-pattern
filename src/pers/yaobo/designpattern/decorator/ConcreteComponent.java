package pers.yaobo.designpattern.decorator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/18 14:06
 * @description 具体元件类
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体元件的操作");
    }
}
