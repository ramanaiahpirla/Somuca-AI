package org.somuca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.somuca"})
@EnableJpaRepositories("com.somuca.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SomucaAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomucaAiApplication.class, args);
	}

}
