package pers.yaobo.designpattern.abstractfactory;

/**
 * @author yaobo
 * @version 1.0
 * @date 2019/11/20 9:51
 * @description 部门接口
 */
public interface IDepartment {
    void insert(Department department);

    Department select(int id);
}
