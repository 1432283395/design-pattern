package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 10:25
 * @description 工厂接口
 */
public interface IFactory {
    IDepartment createDepartment();
    IUser createUser();
}
