package com.musanxian.springboot03web.controller;

import com.musanxian.springboot03web.pojo.Department;
import com.musanxian.springboot03web.pojo.Employee;
import com.musanxian.springboot03web.service.DepartmentService;
import com.musanxian.springboot03web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeService.getAll();
        model.addAttribute("emps",employees);
        model.addAttribute("department",departmentService);
        return "/emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //添加操作
        employeeService.add(employee);
        return "redirect:/emps";
    }

    //去员工的修改页面+
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id")Integer id,Model model){
        //查出原来的数据
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);

        return "emp/update";
    }

    @RequestMapping("/updateEmp")
    public String updateEmp(Employee emp){
        employeeService.save(emp);
        return "redirect:/emps";
    }

    //删除员工
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        System.out.println("删除的id："+id);
        employeeService.delete(id);
        return "redirect:/emps";
    }
}
