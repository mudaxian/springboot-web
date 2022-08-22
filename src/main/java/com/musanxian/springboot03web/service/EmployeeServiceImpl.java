package com.musanxian.springboot03web.service;

import com.musanxian.springboot03web.dao.EmployeeDao;
import com.musanxian.springboot03web.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;
    //增加一个员工
    @Override
    public void save(Employee employee){
        employeeDao.save(employee);
    }

    //查询全部员工信息
    @Override
    public List<Employee> getAll(){
        return employeeDao.getAll();
    }

    //通过id查询员工
    @Override
    public Employee getEmployeeById(Integer id){
        return employeeDao.getEmployeeById(id);
    }

    //通过id删除员工
    @Override
    public void delete(Integer id){
        employeeDao.delete(id);
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }
}
