/**
 * 
 */
package com.itheima.entity;

import java.io.Serializable;

/**
 * 联系人的实体类
 *
 */

/**
 * 实体类的编写规则
 * 1.需要一个公开的类，公开的无参构造方法
 * 2.私有的属性，并提供公开的getter，setter
 * 3.需要一个持久化标识OID
 * 4。实现Serializable接口
 * 5.实体类不能使用final修饰
 * 6.使用包装类型替换基本数据类型
 * 	   包装类型默认值：null
 * 	   基本数据类型：0
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */

public class LinkMan implements Serializable {

	private Long lkmId;
	private String lkmName;
	private String lkmGender;
	private String lkmPhone;
	private String lkmMobile;
	private String lkmEmail;
	private String lkmPosition;
	private String lkmMemo;
	
	

	public LinkMan(Long lkmId, String lkmName) {
		this.lkmId = lkmId;
		this.lkmName = lkmName;
	}
	
	public LinkMan(){}
	
	
	public Long getLkmId() {
		return lkmId;
	}
	public void setLkmId(Long lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkmGender() {
		return lkmGender;
	}
	public void setLkmGender(String lkmGender) {
		this.lkmGender = lkmGender;
	}
	public String getLkmPhone() {
		return lkmPhone;
	}
	public void setLkmPhone(String lkmPhone) {
		this.lkmPhone = lkmPhone;
	}
	public String getLkmMobile() {
		return lkmMobile;
	}
	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}
	public String getLkmEmail() {
		return lkmEmail;
	}
	public void setLkmEmail(String lkmEmail) {
		this.lkmEmail = lkmEmail;
	}
	public String getLkmPosition() {
		return lkmPosition;
	}
	public void setLkmPosition(String lkmPosition) {
		this.lkmPosition = lkmPosition;
	}
	public String getLkmMemo() {
		return lkmMemo;
	}
	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}
	@Override
	public String toString() {
		return "LinkMan [lkmId=" + lkmId + ", lkmName=" + lkmName + ", lkmGender=" + lkmGender + ", lkmPhone="
				+ lkmPhone + ", lkmMobile=" + lkmMobile + ", lkmEmail=" + lkmEmail + ", lkmPosition=" + lkmPosition
				+ ", lkmMemo=" + lkmMemo + "]";
	}
	
}
