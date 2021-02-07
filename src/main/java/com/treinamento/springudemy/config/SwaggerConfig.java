package com.treinamento.springudemy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
  

  private static final String CONTACT_EMAIL = "marcelo.andrade.triade@gmail.com";
  private static final String CONTACT_GITHUB = "https://github.com/ManceloAngela/springudemy1/";
  private static final String CONTACT_NAME = "Marcelo Andrade";
  private static final String API_VERSION = "1.0.0";
  private static final String API_DESCRIPTION = "Itegrator Kenoby API Professinal";
  private static final String API_TITLE = "Integrator Kenoby/Senior - Recruitment MDS Insure";
  private static final String BASE_PAKAGE = "com.treinamento.springudemy";

  
  @Bean
  public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
    .select()
    .apis(RequestHandlerSelectors.basePackage(BASE_PAKAGE))
    .paths(PathSelectors.any())
    .build()
    .apiInfo(buildApiInfo());
  }

  private ApiInfo buildApiInfo() {
    return new ApiInfoBuilder()
    .title(API_TITLE)
    .description(API_DESCRIPTION)
    .version(API_VERSION)
    .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB,CONTACT_EMAIL))
    .build();
  }

}