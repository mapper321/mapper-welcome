package com.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mapper.core.model.GenericResultView;
import com.mapper.core.model.ResultView;
import com.mapper.feign.WelcomeFeign;
import com.mapper.sys.sysuser.data.SysUser;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@Controller
@EnableFeignClients
public class Welcome {

	@Value("${spring.application.name}")
	private String instanceName;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping("/getserverurl")
	@ResponseBody()
	public String serviceUrl() {
		List<ServiceInstance> list = discoveryClient.getInstances(instanceName);
		if (list != null && list.size() > 0) {
			return list.get(0).getUri().toString();
		}
		return null;
	}

	@RequestMapping("/")
	@ResponseBody()
	public String home() {
		return "Hello world";
	}

	@RequestMapping("/sendMessage")
	@ResponseBody()
	public ResultView saveMessage(String message) {
		jmsTemplate.convertAndSend("mapper321", message);
		return ResultView.ok();
	}

	@RequestMapping("/loginPage")
	public String loginpage() {
		return "index";
	}
	
	@Autowired
	WelcomeFeign wf;
	@RequestMapping("/testFeign")
	@ResponseBody()
	public GenericResultView<SysUser> testFeign() {
		SysUser sysUser = wf.getlist().getRows().get(0);
		return wf.getlist();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Welcome.class, args);
	}

}
