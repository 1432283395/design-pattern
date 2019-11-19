package pers.yaobo.designpattern.builder;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 16:37
 * @description 指挥者
 */
public class Director {
    public void construct(AbstractBuilder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

    public static void main(String[] args) {
        Director director = new Director();
        AbstractBuilder builder1 = new ConcreteBuilderFirst();
        AbstractBuilder builder2 = new ConcreteBuilderSecond();

        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
