package com.musanxian.springboot03web.service;

import com.musanxian.springboot03web.pojo.Employee;
import java.util.List;

public interface EmployeeService {

    //增加一个员工
    void save(Employee employee);

    //查询全部员工信息
    List<Employee> getAll();

    //通过id查询员工
    Employee getEmployeeById(Integer id);

    //通过id删除员工
    void delete(Integer id);

    void add(Employee employee);
}
