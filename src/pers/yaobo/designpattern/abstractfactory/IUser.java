package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 11:03
 * @description 用户接口
 */
public interface IUser {
    void insert(User user);

    User select(int id);
}
