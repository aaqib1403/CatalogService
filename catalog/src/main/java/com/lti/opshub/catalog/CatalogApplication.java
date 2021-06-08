package com.lti.opshub.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 * Application class for console backend framework.
 * 
 * @author Mrunali Chopade
 * 
 *
 */
@SpringBootApplication(scanBasePackages = {"com.lti.opshub.catalog"})
@PropertySource(value = "file:configs/application.properties")
@EnableJpaAuditing
public class CatalogApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatalogApplication.class, args);
  }
  
	

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    final PropertySourcesPlaceholderConfigurer properties =
        new PropertySourcesPlaceholderConfigurer();

    String filePath = "configs";

    properties.setLocation(new FileSystemResource(filePath + "/application.properties"));
    properties.setIgnoreResourceNotFound(false);
    return properties;
  }

}
