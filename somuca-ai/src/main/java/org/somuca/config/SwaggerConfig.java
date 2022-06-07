package org.somuca.config;

import java.sql.Date;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.collect.Lists;

@Configuration

@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerSpringfoxDocket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).forCodeGeneration(true)
				.genericModelSubstitutes(ResponseEntity.class).ignoredParameterTypes(Pageable.class)
				.ignoredParameterTypes(java.sql.Date.class)
				.directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
				.directModelSubstitute(java.time.ZonedDateTime.class, Date.class)
				.directModelSubstitute(java.time.LocalDateTime.class, Date.class)
				.useDefaultResponseMessages(false);

		docket = docket.select()
				.apis(RequestHandlerSelectors.basePackage("org.somuca.controller"))
				.paths(PathSelectors.any()).build();
		return docket;
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Somuca APIs").description("Somuca API reference for developers")
				.termsOfServiceUrl("http://somuca-ai.com")
				.contact(new Contact("Somuca DevTeam", "www.somukatheai.com", "somuca-ai@lfprojects.com"))
				.license("somuca License").licenseUrl("somuca-ai@lfprojects.com").version("1.0").build();
	}

}
