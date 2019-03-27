package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Case;
import ck.bean.CaseEx;
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

	@Override
	public CaseEx findCaseExById(int cid) {
		// TODO Auto-generated method stub
		return caseDao.findCaseExById(cid);
	}

	@Override
	public int addCaseEx(Case c) {
		// TODO Auto-generated method stub
		return caseDao.addCaseEx(c);
	}

	@Override
	public int updCaseEx(Case c) {
		// TODO Auto-generated method stub
		return caseDao.updCaseEx(c);
	}

	@Override
	public int delCaseEx(int cid) {
		// TODO Auto-generated method stub
		return caseDao.delCaseEx(cid);
	}

	@Override
	public int delAllCase(List cid) {
		// TODO Auto-generated method stub
		return caseDao.delAllCase(cid);
	}

	@Override
	public List<CaseEx> findCaseExByClass(int ccid) {
		// TODO Auto-generated method stub
		return caseDao.findCaseExByClass(ccid);
	}

	@Override
	public List<CaseEx> findCaseExByDate(String cdate) {
		// TODO Auto-generated method stub
		return caseDao.findCaseExByDate(cdate);
	}

	@Override
	public List<CaseEx> findAllCaseEx() {
		// TODO Auto-generated method stub
		return caseDao.findAllCaseEx();
	}

}
