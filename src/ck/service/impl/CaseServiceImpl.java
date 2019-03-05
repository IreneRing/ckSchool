package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Case;
import ck.dao.CaseDao;
import ck.service.CaseService;
@Service("CaseService")
public class CaseServiceImpl implements CaseService{
	//dao层对象
	@Autowired
	private CaseDao caseDao;
	@Override
	public List<Case> findAllCase() {
		// TODO Auto-generated method stub
		return caseDao.findAllCase();
	}

	@Override
	public List<Case> findInCase() {
		// TODO Auto-generated method stub
		return caseDao.findInCase();
	}

}
