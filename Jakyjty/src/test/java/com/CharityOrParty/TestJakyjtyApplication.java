package com.CharityOrParty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.oracle.OracleContainer;
import org.testcontainers.utility.DockerImageName;

import com.jakyjty.charityOrParty.JakyjtyApplication;

@TestConfiguration(proxyBeanMethods = false)
public class TestJakyjtyApplication {

	@Bean
	@ServiceConnection
	MySQLContainer<?> mysqlContainer() {
		return new MySQLContainer<>(DockerImageName.parse("mysql:latest"));
	}

	@Bean
	@ServiceConnection
	OracleContainer oracleFreeContainer() {
		return new OracleContainer(DockerImageName.parse("gvenzl/oracle-free:latest"));
	}

	public static void main(String[] args) {
		SpringApplication.from(JakyjtyApplication::main).with(TestJakyjtyApplication.class).run(args);
	}

}
