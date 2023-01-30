package com.erp.service.impl;
import java.util.List;

import com.erp.service.CrmVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("CrmMapper")
public interface CrmMapper {

	List<CrmVO> selectUserList(CrmVO crmVO);

}
