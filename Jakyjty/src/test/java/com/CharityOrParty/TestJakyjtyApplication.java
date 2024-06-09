package com.CharityOrParty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MSSQLServerContainer;
// import org.testcontainers.containers.MySQLContainer;
// import org.testcontainers.oracle.OracleContainer;
import org.testcontainers.utility.DockerImageName;

import com.jakyjty.charityOrParty.JakyjtyApplication;

@TestConfiguration(proxyBeanMethods = false)
public class TestJakyjtyApplication {
	

	@Bean
	@ServiceConnection
	MSSQLServerContainer<?> sqlContainer() {
		return new MSSQLServerContainer<>(DockerImageName.parse("mcr.microsoft.com/mssql/server:2022-latest"));
	}

	
	public static void main(String[] args) {
		SpringApplication.from(JakyjtyApplication::main).with(TestJakyjtyApplication.class).run(args);
	}

}
