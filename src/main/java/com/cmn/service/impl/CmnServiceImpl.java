package com.cmn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cmn.service.CmnService;
import com.cmn.service.CodeVO;
import com.cmn.service.CompanyVO;
import com.cmn.service.ModifyVO;
import com.cmn.service.UserVO;
import com.cmn.web.TestController;
import com.common.AES256;
import com.common.SHA256;

@Service("CmnService")
public class CmnServiceImpl implements CmnService {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Resource(name = "CmnMapper")
	private CmnMapper cmnMapper;
	
	// 사용자 목록 조회
	@Override
	public List<UserVO> getUserList() throws Exception {
		List<UserVO> list = cmnMapper.getUserList();
		AES256 aes256 = new AES256();
		for(int i = 0 ; i<list.size() ; i++){
			log.info("check  :  {}", list.get(i).getUserPhone());
			list.get(i).setUserPhone(aes256.decrypt(list.get(i).getUserPhone()));
		}
		return list;
	}

	// 사용자 검색
	@Override
	public List<UserVO> getSearchUserList(String searchKey, String searchValue) {
		return cmnMapper.getSearchUserList(searchKey, searchValue);
	}
	
	// 부서 목록 조회
	@Override
	public List<CodeVO> getDeptList() {
		return cmnMapper.getDeptList();
	}

	// 직급 목록 조회
	@Override
	public List<CodeVO> getRankList() {
		return cmnMapper.getRankList();
	}
	
	// 직책 목록 조회
	@Override
	public List<CodeVO> getPositionList() {
		return cmnMapper.getPositionList();
	}
	
	// 권한 목록 조회
	@Override
	public List<CodeVO> getAuthorityList() {
		return cmnMapper.getAuthorityList();
	}
	
	// 상태 목록 조회
	@Override
	public List<CodeVO> getStatusList() {
		return cmnMapper.getStatusList();
	}
	
	// 회사 정보 조회
	@Override
	public List<CompanyVO> getCompanyInfo() {
		return cmnMapper.getCompanyInfo();
	}
	
	// 아이디 중복확인
	@Override
	public int idDupleCheck(String userId) {
		log.info("dupleCheck   :   {}", userId);
		return cmnMapper.idDupleCheck(userId);
	}
	
	// 사용자 등록 처리
	@Override
	public int userReg(UserVO user) throws Exception {
		log.info("reguser   :   {}", user);
		SHA256 sha256 = new SHA256();
		AES256 aes256 = new AES256();
		user.setUserPw(sha256.encrypt(user.getUserPw()));
		user.setUserPhone(aes256.encrypt(user.getUserPhone()));
		return cmnMapper.userReg(user);
	}
	
	// 사용자 정보 페이지 조회
	@Override
	public List<UserVO> getUserInfo(String userId) throws Exception {
		AES256 aes256 = new AES256();
		List<UserVO> info =  cmnMapper.getUserInfo(userId);
		for(int i = 0 ; i<info.size() ; i++){
			info.get(i).setUserPhone(aes256.decrypt(info.get(i).getUserPhone()));
		}
		return info;
	}
	
	// 사용자 코드 정보 조회
	@Override
	public List<UserVO> getTargetCodeInfo(String userId) {
		return cmnMapper.getTargetCodeInfo(userId);
	}
	
	// 사용자 수정 처리
	@Override
	public int userModify(ModifyVO user) {
		log.info("modifyuser   :   {}", user);
		
		return cmnMapper.userModify(user);
	}
	
	// 사용자 삭제 처리
	@Override
	public int userDelete(String userId) {
		log.info("deleteuser   :   {}", userId);
		return cmnMapper.userDelete(userId);
	}
}
