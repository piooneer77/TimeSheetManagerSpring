package com.rmgs.timesheetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rmgs.timesheetmanager")
public class TimesheetmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimesheetmanagerApplication.class, args);
	}
}
