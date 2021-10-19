package pe.net.csweb.microservicios.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryBackendApplication.class, args);
	}

}
