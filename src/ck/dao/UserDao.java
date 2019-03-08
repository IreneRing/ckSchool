package ck.dao;
/**
 * user操作类
 */
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.UserEx;

public interface UserDao {

	//返回对象查询接口
	UserEx onLogin(@Param("user") String user, @Param("password") String password);
	//返回全部對象接口
	List<UserEx> findUser();
}
