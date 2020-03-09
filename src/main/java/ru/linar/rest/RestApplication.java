package ru.linar.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class RestApplication {

//    @Bean
//    public DataSource datasource() {
//        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:mysql://localhost:3306/test")
//                .username("root")
//                .password("qwerty007")
//                .build();
//    }


    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
