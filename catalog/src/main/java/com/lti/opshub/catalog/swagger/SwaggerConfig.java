package com.lti.opshub.catalog.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger configurations
 *
 * @author Mrunali Chopade
 *
 */

/**
 * Swagger configurations
 *
 * @author Mrunali Chopade
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.lti.opshub.catalog")).paths(PathSelectors.regex("/.*"))
				.build().apiInfo(metaData());
	}



	/**
	 * Sets the api's meta information as included in the json ResourceListing
	 * response.
	 *
	 * @return
	 */



	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("catalog backend service API's").description("\"REST API of catalog backend\"")
				.version("1.0.0").license("License").licenseUrl("")
				.contact(new Contact("Team : pfizer opshub", "", "mail_id@lntinfotech.com")).build();
	}



	@Override
	protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.defaultContentType(org.springframework.http.MediaType.APPLICATION_JSON);
	}



	@Override
	protected void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}


