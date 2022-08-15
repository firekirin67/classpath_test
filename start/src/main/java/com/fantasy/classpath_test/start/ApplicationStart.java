package com.fantasy.classpath_test.start;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.fantasy.classpath_test.**.dao")
@ComponentScan("com.fantasy.classpath_test.**")
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class);
    }
}
