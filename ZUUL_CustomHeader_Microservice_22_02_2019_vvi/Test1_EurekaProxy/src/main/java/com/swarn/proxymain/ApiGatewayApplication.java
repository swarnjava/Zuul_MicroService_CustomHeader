package com.swarn.proxymain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.swarn.proxyfilter.SimpleFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {
	     SpringApplication.run(ApiGatewayApplication.class, args);
	  }
	  @Bean
	  public SimpleFilter simpleFilter() {
	     return new SimpleFilter();
	  }
}
