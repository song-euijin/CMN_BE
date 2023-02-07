package com.cmn.service;

public class ModifyVO {
	private String userId;
	private String userImg;
	private String userDept;
	private String userRank;
	private String userPosition;
	private String userAuthority;
	private String userStatus;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getUserRank() {
		return userRank;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public String getUserPosition() {
		return userPosition;
	}
	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}
	public String getUserAuthority() {
		return userAuthority;
	}
	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	@Override
	public String toString() {
		return "ModifyVO [userId=" + userId + ", userImg=" + userImg + ", userDept=" + userDept + ", userRank="
				+ userRank + ", userPosition=" + userPosition + ", userAuthority=" + userAuthority + ", userStatus="
				+ userStatus + "]";
	}

}
