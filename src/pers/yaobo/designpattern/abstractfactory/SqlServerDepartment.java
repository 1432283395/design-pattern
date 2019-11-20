package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 9:53
 * @description 访问SQL Server的Department
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中插入一条记录");
    }

    @Override
    public Department select(int id) {
        System.out.println("在SQL Server中根据id得到Department表一条记录");
        return null;
    }
}
