package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 11:12
 * @description 运行类
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

//        IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();

        IUser iUser = factory.createUser();

        iUser.insert(user);
        iUser.select(1);

        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        iDepartment.select(1);
    }
}
