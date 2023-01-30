package com.cmn.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface CmnService {
	
	// 사용자 목록 조회
	List<UserVO> getUserList();
	
	// 사용자 검색
	List<UserVO> getSearchUserList(String searchKey, String searchValue);
	
	// 부서, 직급, 직책, 권한, 상태, 회사정보 조회
	List<CodeVO> getDeptList();
	List<CodeVO> getRankList();
	List<CodeVO> getPositionList();
	List<CodeVO> getAuthorityList();
	List<CodeVO> getStatusList();
	List<CompanyVO> getCompanyInfo();
	
	// 아이디 중복검사
	int idDupleCheck(String userId);
	
	// 사용자 등록 처리
	int userReg(UserVO user) throws NoSuchAlgorithmException;
	
	// 사용자 수정 페이지 조회
	List<UserVO> getUserInfo(String userId);
	
	// 수정을위한 코드정보 조회
	List<UserVO> getTargetCodeInfo(String userId);
	
	// 사용자 수정 처리
	int userModify(ModifyVO user);
	
	// 사용자 삭제 처리
	int userDelete(String userId);
}
