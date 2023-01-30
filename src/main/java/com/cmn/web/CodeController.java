package com.cmn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cmn.service.CodeService;
import com.cmn.service.CodeVO;

@RestController
public class CodeController {
	@Autowired
	private CodeService codeService;

	@RequestMapping(value = "/CodeList.do") 
	public List<CodeVO> codeList(CodeVO codeVo, ModelMap model) {
		System.out.println("------- code 출력 -------------");
		List<CodeVO> codeList = codeService.selectCodeList(codeVo);
		model.addAttribute("resultList", codeList); 
		ModelAndView mav = new ModelAndView("codeList"); 
		System.out.println(mav);
		return codeList; 
		}	

}
