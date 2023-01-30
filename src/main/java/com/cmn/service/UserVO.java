package com.cmn.service;

public class UserVO {
	private String userId;
	private String userPw;
	private String userFirstName;
	private String userLastName;
	private String userDept;
	private String userRank;
	private String userPosition;
	private String userAuthority;
	private String userStatus;
	private String userPhone;
	private String userLandLineNumber;
	private String userZipCode;
	private String userAddr;
	private String userAddrDetail;
	private String targetId;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
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
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserLandLineNumber() {
		return userLandLineNumber;
	}
	public void setUserLandLineNumber(String userLandLineNumber) {
		this.userLandLineNumber = userLandLineNumber;
	}
	public String getUserZipCode() {
		return userZipCode;
	}
	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserAddrDetail() {
		return userAddrDetail;
	}
	public void setUserAddrDetail(String userAddrDetail) {
		this.userAddrDetail = userAddrDetail;
	}
	public String getTargetId() {
		return targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userDept=" + userDept + ", userRank=" + userRank
				+ ", userPosition=" + userPosition + ", userAuthority=" + userAuthority + ", userStatus=" + userStatus
				+ ", userPhone=" + userPhone + ", userLandLineNumber=" + userLandLineNumber + ", userZipCode="
				+ userZipCode + ", userAddr=" + userAddr + ", userAddrDetail=" + userAddrDetail + ", targetId="
				+ targetId + ", userName=" + userName + "]";
	}

}
