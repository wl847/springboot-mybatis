package cn.it.springboot.service;

import cn.it.springboot.domain.Employee;

import java.util.List;

public interface IEmployeService {
    List<Employee> selectAll();
}
