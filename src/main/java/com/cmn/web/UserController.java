package com.cmn.web;

//안녕하세요!ㅠㅠㅠ
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cmn.service.UserService;
import com.cmn.service.CodeVO;
import com.cmn.service.CompanyVO;
import com.cmn.service.ModifyVO;
import com.cmn.service.UserVO;

@RestController
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	// 사용자 목록 조회
	@RequestMapping(value = "/CMN/userList.do")
	public List<UserVO> getUserList() throws Exception {
		List<UserVO> userList = userService.getUserList();
		log.info("userList   :   {}", userList);
		
		return userList;
	}
	
	// 사용자 검색
	@RequestMapping(value = "/CMN/userSearch.do")
	public List<UserVO> getSearchUserList(@RequestParam(name = "searchKey", required = false, defaultValue = "userDept") String searchKey
										,  @RequestParam(name = "searchValue", required = false) String searchValue) throws Exception {
		
		if(searchKey.equals("userName")) {
			searchKey = "USER_NAME";
		}else if(searchKey.equals("userId")) {
			searchKey = "USER_ID";
		}else if(searchKey.equals("userDept")) {
			searchKey = "cd.CODE_NAME";
		}else if(searchKey.equals("userRank")) {
			searchKey = "cr.CODE_NAME";
		}else if(searchKey.equals("userPosition")) {
			searchKey = "cp.CODE_NAME";
		}else if(searchKey.equals("userStatus")) {
			searchKey = "cr.CODE_NAME";
		}
		
		log.info("Controller - searchKey   :   {}", searchKey);
		log.info("Controller - searchValue   :   {}", searchValue);
		
		List<UserVO> searchList = userService.getSearchUserList(searchKey, searchValue);
		log.info("Controller - searchList   :   {}", searchList);
		
		return searchList;
	}
	
	// 사용자 부서 조회
	@RequestMapping(value = "/CMN/deptList.do")
	public List<CodeVO> getDeptList() throws Exception {
		List<CodeVO> deptList = userService.getDeptList();
		log.info("deptList   :   {}", deptList);
		
		return deptList;
	}
	
	// 사용자 직급 조회
	@RequestMapping(value = "/CMN/rankList.do")
	public List<CodeVO> getRankList() throws Exception {
		List<CodeVO> rankList = userService.getRankList();
		log.info("rankList   :   {}", rankList);
		
		return rankList;
	}
	
	// 사용자 직책 조회
	@RequestMapping(value = "/CMN/positionList.do")
	public List<CodeVO> getPositionList() throws Exception {
		List<CodeVO> positionList = userService.getPositionList();
		log.info("positionList   :   {}", positionList);
		
		return positionList;
	}
	
	// 사용자 권한 조회
	@RequestMapping(value = "/CMN/authorityList.do")
	public List<CodeVO> getAuthorityList() throws Exception {
		List<CodeVO> authorityList = userService.getAuthorityList();
		log.info("authorityList   :   {}", authorityList);
		
		return authorityList;
	}
	
	// 사용자 상태 조회
	@RequestMapping(value = "/CMN/statusList.do")
	public List<CodeVO> getStatusList() throws Exception {
		List<CodeVO> statusList = userService.getStatusList();
		log.info("statusList   :   {}", statusList);
		
		return statusList;
	}
	
	// 회사 정보 조회
	@RequestMapping(value = "/CMN/companyInfo.do")
	public List<CompanyVO> getCompanyInfo() throws Exception {
		List<CompanyVO> companyInfo = userService.getCompanyInfo();
		log.info("companyInfo   :   {}", companyInfo);
		
		return companyInfo;
	}
	
	// 아이디 중복검사
	@RequestMapping(value = "/CMN/idDupleCheck.do")
	public int idDupleCheck(@RequestParam("userId")String userId) throws Exception {
		System.out.println("controller - 아이디 중복검사 진행!!");
		log.info("userId  :  {}", userId);
		int result = userService.idDupleCheck(userId);
		log.info("result  :  {}", result);
		
		return result;
	}
	
	// 사용자 등록 처리
	@RequestMapping(value = "/CMN/userReg.do")
	public int userReg(UserVO user) throws Exception {
		log.info("reg_user   :   {}", user);
		int result = userService.userReg(user);
		log.info("reg-result   :   {}", result);
		
		return result;
	}
	
	// 사용자 정보 페이지 조회
	@RequestMapping(value = "/CMN/userInfo.do")
	public List<UserVO> getUserInfo(@RequestParam("userId")String userId) throws Exception {
		log.info("userId   :   {}", userId);
		List<UserVO> targetInfo = userService.getUserInfo(userId);
		log.info("targetInfo   :   {}", targetInfo);
		
		return targetInfo;
	}
	
	// 사용자 코드 정보 조회
	@RequestMapping(value = "/CMN/targetCodeInfo.do")
	public List<UserVO> getTargetCodeInfo(@RequestParam("userId")String userId) throws Exception {
		log.info("userId   :   {}", userId);
		List<UserVO> targetInfo = userService.getTargetCodeInfo(userId);
		log.info("targetInfo   :   {}", targetInfo);
		
		return targetInfo;
	}
	
	// 사용자 수정 처리
	@RequestMapping(value = "/CMN/userModify.do")
	public int userModify(ModifyVO user) throws Exception {
		log.info("modify_user   :   {}", user);
		int result = userService.userModify(user);
		
		return result;
	}
	
	// 사용자 삭제 처리
	@RequestMapping(value = "/CMN/userDelete.do")
	public int userDelete(@RequestParam("userId")String userId) throws Exception {
		log.info("delete_user   :   {}", userId);
		int result = userService.userDelete(userId);
		
		return result;
	}
	
	
}
