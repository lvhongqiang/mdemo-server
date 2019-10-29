package com.example.mdemo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MdemoServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MdemoServerApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}
