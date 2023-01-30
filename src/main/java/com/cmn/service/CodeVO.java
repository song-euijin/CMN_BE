package com.cmn.service;

public class CodeVO {
	private String commonCode;
	private String upperCommonCode;
	private String codeName;
	private String codeDescription;
	
	public String getCommonCode() {
		return commonCode;
	}
	public void setCommonCode(String commonCode) {
		this.commonCode = commonCode;
	}
	public String getUpperCommonCode() {
		return upperCommonCode;
	}
	public void setUpperCommonCode(String upperCommonCode) {
		this.upperCommonCode = upperCommonCode;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getCodeDescription() {
		return codeDescription;
	}
	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}
	
	@Override
	public String toString() {
		return "CodeVO [commonCode=" + commonCode + ", upperCommonCode=" + upperCommonCode + ", codeName=" + codeName
				+ ", codeDescription=" + codeDescription + "]";
	}
}
