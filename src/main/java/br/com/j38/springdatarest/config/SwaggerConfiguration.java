package br.com.j38.springdatarest.config;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SwaggerConfiguration {

    @Value("${info.app.version}")
    String version;

    @Value("${springdoc.info.description}")
    String description;

    @Value("${springdoc.info.title}")
    String title;

    @Bean
    public OpenAPI infoApi() {

        Info info = new Info();
        info.setTitle(title);

        return new OpenAPI().info(info.description(description).version(version));
    }

}