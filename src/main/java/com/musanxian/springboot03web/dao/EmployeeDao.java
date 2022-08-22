package com.musanxian.springboot03web.dao;

import com.musanxian.springboot03web.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface EmployeeDao {

    //更新一个员工信息
    void save(Employee employee);

    //查询全部员工信息
    List<Employee> getAll();

    //通过id查询员工
    Employee getEmployeeById(Integer id);

    //通过id删除员工
    void delete(Integer id);

    //增加一名员工
    void add(Employee employee);
}
