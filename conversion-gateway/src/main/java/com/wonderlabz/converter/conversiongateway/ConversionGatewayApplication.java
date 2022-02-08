package com.wonderlabz.converter.conversiongateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class ConversionGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionGatewayApplication.class, args);
	}

	public RouteLocator conversionRoutes(RouteLocatorBuilder builder){
		return builder.routes()
				.route(p -> p
						.path("/conversions")
						.filters(f -> f.addRequestHeader())).build();
	}

}
