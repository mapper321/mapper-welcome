package com.mapper.sys.api;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mapper.core.model.PageBean;
import com.mapper.core.model.ResultView;
import com.mapper.core.web.controller.BaseController;
import com.mapper.sys.sysuser.SysUserDao;
import com.mapper.sys.sysuser.data.SysUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user/")
@Api(tags={"用户操作接口"})
public class UserApiController extends BaseController
{
	
	@Resource
	private SysUserDao sysUserDao;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	@ApiOperation(value="获取用户列表", notes="根据分页和用户相关参数进行查询")
	public ResultView list(PageBean pb,SysUser sysUser)
	{		
		return sysUserDao.getAll(pb, sysUser); //查询所有信息
	} 
	
	
}
