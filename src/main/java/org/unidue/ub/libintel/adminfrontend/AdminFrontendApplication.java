package org.unidue.ub.libintel.adminfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminFrontendApplication.class, args);
	}

}
