package com.cmn.service.impl;

import java.util.List;

import com.cmn.service.CodeVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("CodeMapper")
public interface CodeMapper {

	List<CodeVO> selectCodeList(CodeVO codeVo);


}
