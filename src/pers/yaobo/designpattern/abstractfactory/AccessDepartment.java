package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 10:19
 * @description 访问Access的Department
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    @Override
    public Department select(int id) {
        System.out.println("在Access中根据id得到Department表一条记录");
        return null;
    }
}
