package cn.it.springboot;


import cn.it.springboot.domain.Employee;
import cn.it.springboot.service.IEmployeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class)
public class MyBatisTest {

    @Autowired
    private IEmployeService employeService;

    @Test
    public void testEemployee() throws Exception{
        List<Employee> employees = employeService.selectAll();
        employees.forEach(e->{
            System.out.println(e);
        });
    }


}
