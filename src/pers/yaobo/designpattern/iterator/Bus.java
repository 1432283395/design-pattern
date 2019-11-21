package pers.yaobo.designpattern.iterator;

import java.util.Iterator;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/21 10:56
 * @description 乘客
 */
public class Bus implements Iterable {

    private String[] passengers = new String[4];

    public String[] getPassengers() {
        return passengers;
    }

    @Override
    public Iterator iterator() {
        return new IteratorASC(this);
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.getPassengers()[0] = "小菜";
        bus.getPassengers()[1] = "大鸟";
        bus.getPassengers()[2] = "老外";
        bus.getPassengers()[3] = "小偷";

//        for (Iterator iterator = bus.iterator(); iterator.hasNext(); System.out.println(iterator.next())) {
//        }
//
//        Iterator iterator = bus.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //增强for循环，底层实现就是上面的两种
        for (Object o : bus) {
            System.out.println(o);
        }
    }
}
