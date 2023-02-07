package com.cmn.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cmn.service.CodeVO;
import com.cmn.service.CompanyVO;
import com.cmn.service.ModifyVO;
import com.cmn.service.UserVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("CmnMapper")
public interface UserMapper {
	
	// 사용자 목록 조회
	List<UserVO> getUserList();
	
	// 사용자 검색 처리
	List<UserVO> getSearchUserList(@Param("searchKey") String searchKey, @Param("searchValue") String searchValue);
	
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
	int userReg(UserVO user);
	
	// 사용자 정보 페이지 조회
	List<UserVO> getUserInfo(String userId);
	
	// 사용자 코드 정보 조회
	List<UserVO> getTargetCodeInfo(String userId);
	
	// 사용자 수정 처리
	int userModify(ModifyVO user);
	
	// 사용자 삭제 처리
	int userDelete(String userId);

}
