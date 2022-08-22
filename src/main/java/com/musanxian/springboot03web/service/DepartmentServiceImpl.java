package com.musanxian.springboot03web.service;

import com.musanxian.springboot03web.dao.DepartmentDao;
import com.musanxian.springboot03web.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentDao departmentDao;
    //获得所有部门信息
    @Override
    public List<Department> getDepartments(){
        return departmentDao.getDepartments();
    }

    //通过id得到部门
    @Override
    public Department getDepartmentById(Integer id){
        return departmentDao.getDepartmentById(id);
    }
}
