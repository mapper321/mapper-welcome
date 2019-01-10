package com.mapper.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mapper.core.model.GenericResultView;
import com.mapper.sys.sysuser.data.SysUser;

@FeignClient("welcome1")
public interface WelcomeFeign {
	@RequestMapping(method = RequestMethod.GET,value="/api/user/list",consumes = MediaType.APPLICATION_JSON_VALUE)
	public GenericResultView<SysUser> getlist();
}
