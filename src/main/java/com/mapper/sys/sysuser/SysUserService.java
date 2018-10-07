package com.mapper.sys.sysuser;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mapper.core.mybatis.IEntityDao;
import com.mapper.core.service.BaseService;
import com.mapper.sys.sysuser.data.SysUser;

/**
 * 对象功能:sys_user Service类 开发公司:mapper 开发人员:mapper 创建时间:2018-10-02 10:09:23
 */
@Service
public class SysUserService extends BaseService<SysUser> implements UserDetailsService {
	@Resource
	private SysUserDao dao;
	
	public SysUserService() {
	}

	@Override
	protected IEntityDao<SysUser, Long> getEntityDao() {
		return dao;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Map m = new HashMap<>();
		m.put("account", username);
		SysUser user = dao.getOne("getAll", m);
		if(user != null) {
			return user;
		}else {
			throw new UsernameNotFoundException("用户: " + username + " 不存在!");
		}
	}

}
