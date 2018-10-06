package com.mapper;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@RestController
public class Welcome {
	
	@Value("${spring.application.name}")
	private String instanceName;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/getserverurl")
	public String serviceUrl() {
	    List<ServiceInstance> list = discoveryClient.getInstances(instanceName);
	    if (list != null && list.size() > 0 ) {
	        return list.get(0).getUri().toString();
	    }
	    return null;
	}
	
	@RequestMapping("/")
    public String home() {
        return "Hello world";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Welcome.class,args);
    }

}
