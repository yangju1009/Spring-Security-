package com.project.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberVO {
	
	
	private String userid;
	private String userpw;
	private String userName;
	private boolean enabled;
	
	private Date regDate;
	private Date updateDate;
	private List<AuthVO> authList;
	
	
	
	public List<AuthVO> getAuthList() {
		return authList;
	}



	public void setAuthList(List<AuthVO> authList) {
		this.authList = authList;
	}

	

	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getUserpw() {
		return userpw;
	}



	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}



	public boolean isEnabled() {
		return enabled;
	}



	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	public Date getRegDate() {
		return regDate;
	}



	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}



	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", userName=" + userName + ", enabled=" + enabled
				+ ", regDate=" + regDate + ", updateDate=" + updateDate + ", authList=" + authList + "]";
	}
}
