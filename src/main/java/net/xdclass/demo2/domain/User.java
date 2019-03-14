package net.xdclass.demo2.domain;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	private String age;
	@JsonIgnore
	private String pwd;
	
	@JsonProperty("account")
	private String phone;
	
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
	private Date createTime;
	
	public User() {
		super();
	}
	
	public User(String age, String pwd, String phone, Date createTime) {
		super();
		this.age = age;
		this.pwd = pwd;
		this.phone = phone;
		this.createTime = createTime;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", pwd=" + pwd + ", phone=" + phone + ", createTime=" + createTime + "]";
	}
	
	
}
