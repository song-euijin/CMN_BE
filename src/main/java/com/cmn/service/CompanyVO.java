package com.cmn.service;

public class CompanyVO {
	private String companyCode;
	private String companyName;
	private String companyDomain;
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDomain() {
		return companyDomain;
	}
	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}
	
	@Override
	public String toString() {
		return "CompanyVO [companyCode=" + companyCode + ", companyName=" + companyName + ", companyDomain="
				+ companyDomain + "]";
	}
	
}
