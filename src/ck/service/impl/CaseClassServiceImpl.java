package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.CaseClass;
import ck.dao.CaseClassDao;
import ck.service.CaseClassService;
@Service("CaseClassService")
public class CaseClassServiceImpl implements CaseClassService {
	//dao层对象
	@Autowired
	private CaseClassDao caseClassDao;
	@Override
	public List<CaseClass> findAllCaseClass() {
		// TODO Auto-generated method stub
		return caseClassDao.findAllCaseClass();
	}
	
}
