package pers.yaobo.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/19 16:22
 * @description 产品类
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
