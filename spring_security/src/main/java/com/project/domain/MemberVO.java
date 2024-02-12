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



	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", userName=" + userName + ", enabled=" + enabled
				+ ", regDate=" + regDate + ", updateDate=" + updateDate + ", authList=" + authList + "]";
	}
}
