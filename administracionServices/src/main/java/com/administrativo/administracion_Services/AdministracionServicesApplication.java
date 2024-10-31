package com.administrativo.administracion_Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableFeignClients(basePackages = "com.administrativo.administracion_Services.client") // Habilita el uso de clientes Feig
public class AdministracionServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministracionServicesApplication.class, args);
	}

}
