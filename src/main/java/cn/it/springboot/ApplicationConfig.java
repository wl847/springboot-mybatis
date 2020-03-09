package cn.it.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan(basePackages = "cn.it.springboot.mapper")
@EnableTransactionManagement
public class ApplicationConfig
{

    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationConfig.class) ;
    }
}
