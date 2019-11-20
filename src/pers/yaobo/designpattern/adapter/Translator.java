package pers.yaobo.designpattern.adapter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 15:46
 * @description 翻译者
 */
public class Translator extends Player {
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.foreignAttack();
    }

    @Override
    public void defense() {
        foreignCenter.foreignDefense();
    }

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
