package ck.service;
/**
 * user功能
 */

import java.util.List;

import ck.bean.UserEx;
public interface UserService {
	//登陆返回user对象
	
	UserEx onLogin(String user,String password);
	//返回user集合
	List<UserEx> findAllUser();
}
