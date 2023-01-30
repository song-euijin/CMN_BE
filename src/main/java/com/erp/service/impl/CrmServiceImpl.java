package com.erp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.erp.service.CrmService;
import com.erp.service.CrmVO;

@Service("CrmService")
public class CrmServiceImpl implements CrmService {
	@Resource(name = "CrmMapper")
	private CrmMapper crmMapper;

	@Override
	public List<CrmVO> selectSample(CrmVO crmVO) {
		return crmMapper.selectUserList(crmVO);
	}
}
 