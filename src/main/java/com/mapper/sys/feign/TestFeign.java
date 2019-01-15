package com.mapper.sys.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mapper.sys.sysuser.data.SysUser;

@FeignClient("w1")
public interface TestFeign {
	@RequestMapping(method = RequestMethod.GET,value="/getUser")
	public SysUser getUser();
}
