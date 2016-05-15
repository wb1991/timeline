package com.wb.timeline.domain;

import java.util.Date;

import com.wb.timeline.dao.BaseEntity;

/**
 * 会员实体类.
 * @author wb1991
 *
 */
public class User extends BaseEntity{
	
	private static final long serialVersionUID = -4819474232517330420L;

	/**用户名. */
	private String userName;

	/**密码. */
    private String password;
    
    /**邮箱. */
    private String email;

    /**年龄. */
    private Integer age;
    
    /**是否可用. */
    private boolean isEnable;
    
    /**最后登录日期. */
    private Date lastLoginDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
}