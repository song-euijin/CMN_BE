package com.cmn.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmn.service.CodeService;
import com.cmn.service.CodeVO;

@Service("CodeService")
public class CodeServiceImpl implements CodeService {
	@Resource(name = "CodeMapper")
	private CodeMapper codeMapper;

	public List<CodeVO> selectCodeList(CodeVO codeVo) {
		return codeMapper.selectCodeList(codeVo);
	}
}
