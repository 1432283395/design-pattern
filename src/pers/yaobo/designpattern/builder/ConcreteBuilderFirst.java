package pers.yaobo.designpattern.builder;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 16:34
 * @description 具体建造者一
 */
public class ConcreteBuilderFirst extends AbstractBuilder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
