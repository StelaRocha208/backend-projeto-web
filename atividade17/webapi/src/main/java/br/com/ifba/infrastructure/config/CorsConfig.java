package br.com.ifba.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Marca a classe como uma classe de configuração no Spring
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permite que todas as URLs sejam acessadas
                        .allowedOrigins("*") // Permite requisições de qualquer origem
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite esses métodos HTTP específicos
                        .allowedHeaders("*"); // Permite todos os cabeçalhos HTTP
            }
        };
    }
}

