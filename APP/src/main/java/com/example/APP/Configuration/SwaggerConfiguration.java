package com.example.APP.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("APIS PROYECTO ")
                        .version("1.0")
                        .description("Docuentacion de las apis Proyecto")
                        .contact(new Contact()
                                .name("Luisa Fernanda Romero")
                                .email("luisa.romero-s@uniminuto.edu.co")));
    }

}
