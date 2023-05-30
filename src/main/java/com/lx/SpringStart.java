package com.lx;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @auther xinshuai9333
 */
//添加启动类注解,说明这是一个启动类
@SpringBootApplication
public class SpringStart {
    public static void main(String[] args) {
        //将springboot应用启动
        SpringApplication.run(SpringStart.class,args);
    }
}
