package pers.yaobo.designpattern.iterator;

import java.util.Iterator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 10:35
 * @description 升序迭代器
 */
public class IteratorDESC implements Iterator {

    private Bus bus;
    private int current = 0;

    public IteratorDESC(Bus bus) {
        this.bus = bus;
    }

    @Override
    public boolean hasNext() {
        return current >= 0;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return bus.getPassengers()[current--];
        }
        return null;
    }
}
