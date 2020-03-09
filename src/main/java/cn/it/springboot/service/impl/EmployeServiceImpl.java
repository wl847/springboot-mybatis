package cn.it.springboot.service.impl;

import cn.it.springboot.domain.Employee;
import cn.it.springboot.mapper.EmployeeMapper;
import cn.it.springboot.service.IEmployeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeServiceImpl implements IEmployeService {

    @Autowired
    private EmployeeMapper employeeMapper ;

    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    public Page<Employee> selectForPage() {
        PageHelper.startPage(1,5 );

        Page<Employee> page = (Page<Employee>) employeeMapper.selectForList();
        return  page;
    }


}
