package pers.yaobo.designpattern.adapter;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 15:33
 * @description 外籍中锋
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foreignAttack() {
        System.out.println(name + "外籍中锋进攻");
    }

    public void foreignDefense() {
        System.out.println(name + "外籍中锋防守");
    }
}
