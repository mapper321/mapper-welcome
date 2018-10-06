package com.mapper.sys.sysuser;

import org.springframework.stereotype.Repository;
import com.mapper.core.mybatis.BaseDao;
import com.mapper.sys.sysuser.data.SysUser;
/**
 * 对象功能:sys_user Dao类
 * 开发公司:mapper
 * 开发人员:mapper
 * 创建时间:2018-10-02 10:09:23
 */
@Repository
public class SysUserDao extends BaseDao<SysUser>
{
	@Override
	public Class<SysUser> getEntityClass()
	{
		return SysUser.class;
	}

}