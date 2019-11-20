package pers.yaobo.designpattern.state;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 11:45
 * @description 状态接口
 */
public interface State {
    void handle(Context context);
}
