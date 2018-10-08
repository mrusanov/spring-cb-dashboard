package com.mrusanov.spring.cb.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringCbDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCbDashboardApplication.class, args);
    }

}
