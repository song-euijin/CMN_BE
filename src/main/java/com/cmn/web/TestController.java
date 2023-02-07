package com.cmn.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmn.service.UserService;
import com.cmn.service.CodeVO;
import com.cmn.service.UserVO;

@Controller
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private UserService userService;
	
	// 사용자 목록 조회
	@RequestMapping(value = "/testList.do")
	public String getUserList(Model model) throws Exception {
		List<UserVO> userList = userService.getUserList();
		model.addAttribute("userList", userList);
		log.info("userList   :   {}", userList);
		
		return "testList";
	}
	
	// 사용자 등록 페이지 조회
	@GetMapping(value = "/testReg.do")
	public String getRegPage(Model model) throws Exception {
		List<CodeVO> deptList = userService.getDeptList();
		List<CodeVO> rankList = userService.getRankList();
		List<CodeVO> positionList = userService.getPositionList();
		List<CodeVO> authorityList = userService.getAuthorityList();
		model.addAttribute("deptList", deptList);
		model.addAttribute("rankList", rankList);
		model.addAttribute("positionList", positionList);
		model.addAttribute("authorityList", authorityList);
		log.info("deptList   :   {}", deptList);
		log.info("rankList   :   {}", rankList);
		log.info("positionList   :   {}", positionList);
		log.info("authorityList   :   {}", authorityList);
		
		return "testReg";
	}
	
	// 사용자 등록 처리
	@PostMapping(value = "/testReg.do")
	public String userReg(UserVO user) throws Exception {
		log.info("user   :   {}", user);
		userService.userReg(user);
		
		return "redirect:/testList.do";
	}
	
	// 사용자 수정 페이지 조회
	@GetMapping(value = "/testModify.do")
	public String getModifyPage(@RequestParam("userId")String userId, Model model) throws Exception {
		log.info("userId   :   {}", userId);
		List<UserVO> targetInfo = userService.getUserInfo(userId);
		log.info("targetInfo   :   {}", targetInfo);
		model.addAttribute("targetInfo", targetInfo);
		
		List<CodeVO> deptList = userService.getDeptList();
		List<CodeVO> rankList = userService.getRankList();
		List<CodeVO> positionList = userService.getPositionList();
		List<CodeVO> authorityList = userService.getAuthorityList();
		List<CodeVO> statusList = userService.getStatusList();
		model.addAttribute("deptList", deptList);
		model.addAttribute("rankList", rankList);
		model.addAttribute("positionList", positionList);
		model.addAttribute("authorityList", authorityList);
		model.addAttribute("statusList", statusList);
		log.info("deptList   :   {}", deptList);
		log.info("rankList   :   {}", rankList);
		log.info("positionList   :   {}", positionList);
		log.info("authorityList   :   {}", authorityList);
		log.info("statusList   :   {}", statusList);
		
		return "testModify";
	}
	
	// 사용자 수정 처리
	@PostMapping(value = "/testModify.do")
	public String userModify(UserVO user) throws Exception {
		log.info("modify_user   :   {}", user);
		//cmnService.userModify(user);
		
		return "redirect:/testList.do";
	}
	
	// 사용자 삭제 처리
	@PostMapping(value = "/testDelete.do")
	public String userDelete(@RequestParam("userId")String userId) throws Exception {
		log.info("delete_user   :   {}", userId);
		userService.userDelete(userId);
		
		return "testList.do";
	}
	
}
