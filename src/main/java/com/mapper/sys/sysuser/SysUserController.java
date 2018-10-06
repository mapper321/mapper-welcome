package com.mapper.sys.sysuser;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.servlet.ModelAndView;
import com.mapper.core.model.PageBean;
import com.mapper.core.model.ResultView;
import com.mapper.core.util.UniqueIdUtil;
import com.mapper.core.util.StringUtil;
import com.mapper.core.web.controller.BaseController; 

import com.mapper.sys.sysuser.data.SysUser;
import com.mapper.sys.sysuser.SysUserDao;
/**
 * 对象功能:sys_user 控制器类
 * 开发公司:mapper
 * 开发人员:mapper
 * 创建时间:2018-10-02 10:09:23
 */
@RestController
@RequestMapping("/sys/sysuser/")
public class SysUserController extends BaseController
{
	@Resource
	private SysUserDao sysUserDao;
	
	@RequestMapping("sysUser")
	public ModelAndView returnView()
	{	
		ModelAndView m = new ModelAndView();
		m.setViewName("sys/sysuser/sysUser");
		return m;
	} 
	
	@RequestMapping("list")
	public ResultView list(PageBean pb,SysUser sysUser)
	{		
		return sysUserDao.getAll(pb, sysUser); //查询所有信息
	} 
	
	
	
	@RequestMapping("del")
	public ResultView del(String userid)
	{
		Long[] lAryId = StringUtil.getLongAryByStr(userid);
		for (int i = 0; i < lAryId.length; i++) {
			sysUserDao.delById(lAryId[i]);
		}  
		return new ResultView(); 
	}
	
	
	@RequestMapping("save")
	public  ResultView save(SysUser sysUser)
	{	
		ResultView resultView=new ResultView(); 
		if(sysUser.getUserid()==null||sysUser.getUserid()<=0){
			sysUser.setUserid(UniqueIdUtil.genId()); 
			sysUserDao.add(sysUser);
		}else{
			sysUserDao.update(sysUser);
		}
		resultView.addKV("id",sysUser.getUserid().toString());
		return resultView;
	}
	
	/**
	 * 取得sys_user明细
	 * @param request   
	 * @param response
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("get")
	public ResultView get(Long userid){
		ResultView rv = new ResultView();
		SysUser sysUser = sysUserDao.getById(userid);
		rv.appendObject(sysUser);
		return rv;	
	}
}
