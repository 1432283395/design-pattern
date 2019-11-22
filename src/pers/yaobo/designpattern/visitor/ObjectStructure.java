package pers.yaobo.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 14:13
 * @description 对象结构
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    public void attach(Element element) {
        elementList.add(element);
    }

    public void detach(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
}
