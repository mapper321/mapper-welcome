package com.mapper.sys.sysuser;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.core.mybatis.IEntityDao;
import com.mapper.core.service.BaseService;
import com.mapper.sys.sysuser.data.SysUser;
import com.mapper.sys.sysuser.SysUserDao;

/**
 * 对象功能:sys_user Service类
 * 开发公司:mapper
 * 开发人员:mapper
 * 创建时间:2018-10-02 10:09:23
 */
@Service
public class SysUserService extends BaseService<SysUser>
{
	@Resource
	private SysUserDao dao;
	
	public SysUserService()
	{
	}
	
	@Override
	protected IEntityDao<SysUser, Long> getEntityDao() 
	{
		return dao;
	}
	
}
