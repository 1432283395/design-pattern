package pers.yaobo.designpattern.builder;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 16:34
 * @description 具体建造者二
 */
public class ConcreteBuilderSecond extends AbstractBuilder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
