package cl.duoc.ms_usuario_bff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                   .info(new Info().title("API de usuario (ms-usuario-bff)")
                                    .description("Microservicio tipo BFF (Backend For Frontend) que actúa como intermediario entre el cliente y el backend de negocio. "
                        + "Recibe y entrega DTOs relacionados con la entidad Cliente, delegando toda la lógica de negocio al microservicio 'bs-usuario'.")
                                    .version("1.0.0"));
    }

}
