package cn.it.springboot.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
@Slf4j
public class HelloWorldController {

    private Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private DataSource dataSource ;

    @RequestMapping("/")
    @ResponseBody
    public String hello() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.debug(connection.toString());
        connection.close();

        return "hello!";
    }


    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("msg","这是一个MSG");
        return "hello-thymeleaf";
    }
}

