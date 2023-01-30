package com.erp.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.erp.service.CrmService;
import com.erp.service.CrmVO;

@RestController
public class CrmController {
	@Autowired
	private CrmService crmService;
	
	@RequestMapping(value = "/main.do")
	public ModelAndView userList(CrmVO userVo, ModelMap model) {
		System.out.println("---------------userList------------------");
		List<CrmVO> userList = crmService.selectSample(userVo);
		model.addAttribute("resultList", userList);
		ModelAndView mav = new ModelAndView("userList");
		return mav;
	}
}
