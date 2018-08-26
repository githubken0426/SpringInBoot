package com.ken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
/**
 * exclude关闭特定的自动配置
 * @SpringBootApplication融合了以下三个注解(也可以直接使用下面三个注解)：
 * @SpringBootConfiguration()
 * @EnableAutoConfiguration(让SpringBoot根据路径中的jar包依赖，为档期项目进行自动配置)
 * @ComponentScan()
 *
 */
public class MySpringBootApplication {

	@RequestMapping("/index")
	public String index() {
		return "Srping Boot!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
