package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.UserEx;
import ck.dao.UserDao;
import ck.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{
	//dao层对象
	@Autowired
	private UserDao userDao;
	
	//登陆返回user对象

	public UserEx onLogin(String user, String password) {
		return userDao.onLogin(user, password);
	}
	//返回user集合
	@Override
	public List<UserEx> findAllUser() {
		return userDao.findUser();
	}

}
