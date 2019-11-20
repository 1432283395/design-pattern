package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 11:06
 * @description 访问SQL Server的User
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User select(int id) {
        System.out.println("在SQL Server中根据id得到User表的一条记录");
        return null;
    }
}
