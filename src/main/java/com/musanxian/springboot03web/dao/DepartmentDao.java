package com.musanxian.springboot03web.dao;

import com.musanxian.springboot03web.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface DepartmentDao {

    //获得所有部门信息
    List<Department> getDepartments();
    //通过id得到部门
    Department getDepartmentById(Integer id);
}
