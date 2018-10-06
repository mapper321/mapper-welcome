package com.mapper.sys.sysuser.data;

import com.mapper.core.model.BaseModel;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
/**
 * 对象功能:sys_user Model对象
 * 开发公司:mapper
 * 开发人员:mapper
 * 创建时间:2018-10-02 10:09:23
 */
public class SysUser extends BaseModel
{
	private static final long serialVersionUID = 1L;
	// userid
	protected Long  userid;
	// fullname
	protected String  fullname;
	// account
	protected String  account;
	// password
	protected String  password;
	// isexpired
	protected Long  isexpired;
	// islock
	protected Long  islock;
	// createtime
	protected java.util.Date  createtime;
	//开始 createtime
	protected java.util.Date  begincreatetime;
	//结束 createtime
	protected java.util.Date  endcreatetime;	
	// status
	protected Long  status;
	// email
	protected String  email;
	// phone
	protected String  phone;
	// sex
	protected String  sex;
	// picture
	protected String  picture;
	// createuser
	protected String  createuser;
	// updatetime
	protected java.util.Date  updatetime;
	//开始 updatetime
	protected java.util.Date  beginupdatetime;
	//结束 updatetime
	protected java.util.Date  endupdatetime;	
	// updateby
	protected Long  updateby;
	// updateuser
	protected String  updateuser;
	public void setUserid(Long userid) 
	{
		this.userid = userid;
	}
	/**
	 * 返回 userid
	 * @return
	 */
	public Long getUserid() 
	{
		return this.userid;
	}
 

	public void setFullname(String fullname) 
	{
		this.fullname = fullname;
	}
	/**
	 * 返回 fullname
	 * @return
	 */
	public String getFullname() 
	{
		return this.fullname;
	}
 

	public void setAccount(String account) 
	{
		this.account = account;
	}
	/**
	 * 返回 account
	 * @return
	 */
	public String getAccount() 
	{
		return this.account;
	}
 

	public void setPassword(String password) 
	{
		this.password = password;
	}
	/**
	 * 返回 password
	 * @return
	 */
	public String getPassword() 
	{
		return this.password;
	}
 

	public void setIsexpired(Long isexpired) 
	{
		this.isexpired = isexpired;
	}
	/**
	 * 返回 isexpired
	 * @return
	 */
	public Long getIsexpired() 
	{
		return this.isexpired;
	}
 

	public void setIslock(Long islock) 
	{
		this.islock = islock;
	}
	/**
	 * 返回 islock
	 * @return
	 */
	public Long getIslock() 
	{
		return this.islock;
	}
 

	public void setCreatetime(java.util.Date createtime) 
	{
		this.createtime = createtime;
	}
	/**
	 * 返回 createtime
	 * @return
	 */
	public java.util.Date getCreatetime() 
	{
		return this.createtime;
	}
 
	public void setBegincreatetime(java.util.Date begincreatetime) 
	{
		this.begincreatetime = begincreatetime;
	}
	/**
	 * 返回 开始createtime
	 * @return
	 */
	public java.util.Date getBegincreatetime() 
	{
		return this.begincreatetime;
	}
	
	public void setEndcreatetime(java.util.Date endcreatetime) 
	{
		this.endcreatetime = endcreatetime;
	}
	/**
	 * 返回 结束createtime
	 * @return
	 */
	public java.util.Date getEndcreatetime() 
	{
		return this.endcreatetime;
	}

	public void setStatus(Long status) 
	{
		this.status = status;
	}
	/**
	 * 返回 status
	 * @return
	 */
	public Long getStatus() 
	{
		return this.status;
	}
 

	public void setEmail(String email) 
	{
		this.email = email;
	}
	/**
	 * 返回 email
	 * @return
	 */
	public String getEmail() 
	{
		return this.email;
	}
 

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	/**
	 * 返回 phone
	 * @return
	 */
	public String getPhone() 
	{
		return this.phone;
	}
 

	public void setSex(String sex) 
	{
		this.sex = sex;
	}
	/**
	 * 返回 sex
	 * @return
	 */
	public String getSex() 
	{
		return this.sex;
	}
 

	public void setPicture(String picture) 
	{
		this.picture = picture;
	}
	/**
	 * 返回 picture
	 * @return
	 */
	public String getPicture() 
	{
		return this.picture;
	}
 

	public void setCreateuser(String createuser) 
	{
		this.createuser = createuser;
	}
	/**
	 * 返回 createuser
	 * @return
	 */
	public String getCreateuser() 
	{
		return this.createuser;
	}
 

	public void setUpdatetime(java.util.Date updatetime) 
	{
		this.updatetime = updatetime;
	}
	/**
	 * 返回 updatetime
	 * @return
	 */
	public java.util.Date getUpdatetime() 
	{
		return this.updatetime;
	}
 
	public void setBeginupdatetime(java.util.Date beginupdatetime) 
	{
		this.beginupdatetime = beginupdatetime;
	}
	/**
	 * 返回 开始updatetime
	 * @return
	 */
	public java.util.Date getBeginupdatetime() 
	{
		return this.beginupdatetime;
	}
	
	public void setEndupdatetime(java.util.Date endupdatetime) 
	{
		this.endupdatetime = endupdatetime;
	}
	/**
	 * 返回 结束updatetime
	 * @return
	 */
	public java.util.Date getEndupdatetime() 
	{
		return this.endupdatetime;
	}

	public void setUpdateby(Long updateby) 
	{
		this.updateby = updateby;
	}
	/**
	 * 返回 updateby
	 * @return
	 */
	public Long getUpdateby() 
	{
		return this.updateby;
	}
 

	public void setUpdateuser(String updateuser) 
	{
		this.updateuser = updateuser;
	}
	/**
	 * 返回 updateuser
	 * @return
	 */
	public String getUpdateuser() 
	{
		return this.updateuser;
	}
 


   
   	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) 
	{
		if (!(object instanceof SysUser)) 
		{
			return false;
		}
		SysUser rhs = (SysUser) object;
		return new EqualsBuilder()
		.append(this.userid, rhs.userid)
		.append(this.fullname, rhs.fullname)
		.append(this.account, rhs.account)
		.append(this.password, rhs.password)
		.append(this.isexpired, rhs.isexpired)
		.append(this.islock, rhs.islock)
		.append(this.createtime, rhs.createtime)
		.append(this.status, rhs.status)
		.append(this.email, rhs.email)
		.append(this.phone, rhs.phone)
		.append(this.sex, rhs.sex)
		.append(this.picture, rhs.picture)
		.append(this.createuser, rhs.createuser)
		.append(this.updatetime, rhs.updatetime)
		.append(this.updateby, rhs.updateby)
		.append(this.updateuser, rhs.updateuser)
		.isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() 
	{
		return new HashCodeBuilder(-82280557, -700257973)
		.append(this.userid) 
		.append(this.fullname) 
		.append(this.account) 
		.append(this.password) 
		.append(this.isexpired) 
		.append(this.islock) 
		.append(this.createtime) 
		.append(this.status) 
		.append(this.email) 
		.append(this.phone) 
		.append(this.sex) 
		.append(this.picture) 
		.append(this.createuser) 
		.append(this.updatetime) 
		.append(this.updateby) 
		.append(this.updateuser) 
		.toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return new ToStringBuilder(this)
		.append("userid", this.userid) 
		.append("fullname", this.fullname) 
		.append("account", this.account) 
		.append("password", this.password) 
		.append("isexpired", this.isexpired) 
		.append("islock", this.islock) 
		.append("createtime", this.createtime) 
		.append("status", this.status) 
		.append("email", this.email) 
		.append("phone", this.phone) 
		.append("sex", this.sex) 
		.append("picture", this.picture) 
		.append("createuser", this.createuser) 
		.append("updatetime", this.updatetime) 
		.append("updateby", this.updateby) 
		.append("updateuser", this.updateuser) 
		.toString();
	}
   
  

}