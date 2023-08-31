package com.example.boardtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.boardtest.**.mappers"})
public class BoardtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardtestApplication.class, args);
	}

}
