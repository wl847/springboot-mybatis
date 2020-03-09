package cn.it.springboot.mapper;

import cn.it.springboot.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAll();
    List<Employee> selectForList();
}
