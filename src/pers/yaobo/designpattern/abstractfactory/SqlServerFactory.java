package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 10:42
 * @description SQL Server工厂
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
