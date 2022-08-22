package com.musanxian.springboot03web.service;

import com.musanxian.springboot03web.pojo.Department;
import java.util.List;

public interface DepartmentService {

    //获得所有部门信息
    List<Department> getDepartments();
    //通过id得到部门
    Department getDepartmentById(Integer id);
}
