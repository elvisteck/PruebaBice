package cl.bice.prueba.programacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* Clase principal de Spring Boot para ejecutar el proyecto
*
* @author  Elvis Almenar
* @version 1.0
* @since   2021-05-16 
*/
@SpringBootApplication
@EnableFeignClients
public class PruebaProgramacionApplication extends SpringBootServletInitializer {

	
    public static void main(String[] args) {
        SpringApplication.run(PruebaProgramacionApplication.class, args);
    }
    
}
