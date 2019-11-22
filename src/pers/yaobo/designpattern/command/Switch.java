package pers.yaobo.designpattern.command;

import java.util.EnumMap;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/22 9:33
 * @description 命令枚举
 */
public enum Switch {
    /**
     * 开
     */
    ON(1, "on"),
    /**
     * 关
     */
    OFF(0, "off");

    private int num;
    private String desc;

    Switch(int num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        EnumMap<Switch, Command> commandEnumMap = new EnumMap<>(Switch.class);
        commandEnumMap.put(Switch.ON, () -> System.out.println("开：do Something"));
        commandEnumMap.put(Switch.OFF, () -> System.out.println("关：do Something"));
        commandEnumMap.get(Switch.ON).execute();
    }
}
