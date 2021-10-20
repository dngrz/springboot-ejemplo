package pe.net.csweb.microservicios.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayBackendApplication.class, args);
	}

}
