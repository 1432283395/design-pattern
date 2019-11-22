package pers.yaobo.designpattern.visitor;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:07
 * @description 元素接口
 */
public interface Element {
    void accept(Visitor visitor);
}
