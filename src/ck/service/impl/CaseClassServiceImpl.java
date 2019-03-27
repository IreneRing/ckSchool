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
	@Override
	public CaseClass findCaseClassById(int ccid) {
		// TODO Auto-generated method stub
		return caseClassDao.findCaseClassById(ccid);
	}
	@Override
	public int addCaseClass(CaseClass caseClass) {
		// TODO Auto-generated method stub
		return caseClassDao.addCaseClass(caseClass);
	}
	@Override
	public int updCaseClass(CaseClass caseClass) {
		// TODO Auto-generated method stub
		return caseClassDao.updCaseClass(caseClass);
	}
	@Override
	public int delCaseClass(int ccid) {
		// TODO Auto-generated method stub
		return caseClassDao.delCaseClass(ccid);
	}
	@Override
	public int delAllCaseClass(List ccid) {
		// TODO Auto-generated method stub
		return caseClassDao.delAllCaseClass(ccid);
	}
	@Override
	public CaseClass findCaseClassByName(String ccclass) {
		// TODO Auto-generated method stub
		return caseClassDao.findCaseClassByName(ccclass);
	}
	
}
