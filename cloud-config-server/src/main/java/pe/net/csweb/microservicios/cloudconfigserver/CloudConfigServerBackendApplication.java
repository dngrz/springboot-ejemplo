package pe.net.csweb.microservicios.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigServerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerBackendApplication.class, args);
	}

}
