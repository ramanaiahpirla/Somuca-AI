package org.somuca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.somuca"})
@EnableJpaRepositories("com.somuca.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SomucaAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomucaAiApplication.class, args);
	}

}
