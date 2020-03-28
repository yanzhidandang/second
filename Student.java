package com.ischoolbar.programmer.model;

import java.io.InputStream;

/**
 * 
 * @author llq
 *学生实体类
 */
public class Student {
	private int id;
	private String sn;//学号
	private String name;
	private String password;
	private int clazzId;
	private String sex = "男";
	private String mobile;
	private String temperature;
	private String address;
	private String hubei;
	private String wuhan;
	private InputStream photo;//头像
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public int getClazzId() {
		return clazzId;
	}
	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String Hubei() {
		return hubei;
	}
	public void setHubei(String hubei) {
		this.hubei = hubei;
	}
	public String wuhan() {
		return wuhan;
	}
	public void setWuhan(String wuhan) {
		this.wuhan = wuhan;
	}
	public InputStream getPhoto() {
		return photo;
	}
	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
