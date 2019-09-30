package com.cumulus.leaves.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages =  {"com.cumulus.leaves.pojos"} )
public class CumulusLeavePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CumulusLeavePortalApplication.class, args);
	}

}
