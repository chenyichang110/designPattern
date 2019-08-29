package com.atguigu.principle.demeter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 */
public class Demeter {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());

    }
}

//学校管理类
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    //分析问题
    //1. 这里的 CollegeEmployee 不是  SchoolManager的直接朋友
    //2. CollegeEmployee 是以局部变量方式出现在 SchoolManager
    //3. 违反了 迪米特法则
    void printAllEmployee(CollegeManager sub) {
        //学院员工
        List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        System.out.println("===学院员工===");
        for (CollegeEmployee e : allEmployee) {
            System.out.println(e.getId());
        }
        //学校总部员工
        List<Employee> allEmployee1 = this.getAllEmployee();
        System.out.println("===学校总部员工===");
        for (Employee e : allEmployee1) {
            System.out.println(e.getId());
        }


    }

}

//学院员工管理类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }
}

//学校总部员工类
@Data
class Employee {
    private String id;
}

//学院员工类
@Data
class CollegeEmployee {
    private String id;
}
