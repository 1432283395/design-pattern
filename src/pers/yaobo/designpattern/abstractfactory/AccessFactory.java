package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 10:51
 * @description Access工厂
 */
public class AccessFactory implements IFactory {
    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }

    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
