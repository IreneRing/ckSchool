package ck.controller;
/**
 * user控制器
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ck.bean.User;
import ck.bean.UserEx;
import ck.service.UserService;

@Controller
@RequestMapping("user")
public class UserAction {

	@Autowired
	private UserService userService;
	
	/**
	 * 首页跳转登录页面
	 */
	@RequestMapping("index.action")
	public String index() {
		return "user/login";
	}
	
	/**
	 * 用户登录
	 * @param loginName 登录名
	 * @param passWord 登录密码
	 */
	@RequestMapping("login.action")
	public String login(ModelMap map,
			@RequestParam(required=false, value="user") String user,
			@RequestParam(required=false, value="password") String password) {
		
		System.out.println(user+";"+password);
		// 如果登录名或密码未填写，直接返回登录页面
		if (StringUtils.isEmpty(user) || StringUtils.isEmpty(password)) {
			map.addAttribute("msg","不能为空");
			return "login";
		}
		
		// 校验用户名、密码是否正确
		UserEx userName = userService.onLogin(user, password);
		if (userName==null) {
			map.addAttribute("msg","账号或密码错误");
			return "login";
		}
		
		// 登录成功，进入主页
		if(userName.getRname().equals("管理员")) {
			return "admin/index";
		}else {
			return "user/index";
		}
	}

	@RequestMapping("getAllUser.action")
	public String  getAllUser(Model model) {
		List<UserEx> list=userService.findAllUser();
		model.addAttribute("list", list);
		return "user/index";
	}
}
