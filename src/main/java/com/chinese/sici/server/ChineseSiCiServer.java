package com.chinese.sici.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 项目启动器
 * @author fengxiang
 * @date 2018-07-26
 */
@SpringBootApplication
public class ChineseSiCiServer implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ChineseSiCiServer.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// 这里可以进行初始化
	}
}
