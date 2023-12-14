package com.fund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author YangKai
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FundApplication {
    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
}
