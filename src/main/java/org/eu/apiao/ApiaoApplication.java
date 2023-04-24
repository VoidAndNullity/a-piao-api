package org.eu.apiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author VoidAndNullity
 * @date 2023/04/24
 */
@SpringBootApplication
public class ApiaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiaoApplication.class, args);
        System.out.println("启动成功~");
    }
}
