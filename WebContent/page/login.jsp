<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
<style>
        .bg-wrap, body, html {height: 100%;}
        input{line-height: normal;-webkit-appearance: textfield;background-color: white;-webkit-rtl-ordering: logical;cursor: text;padding: 1px;border-width: 2px;border-style: inset;border-color: initial;border-image: initial;}
        input[type="text"], input[type="password"]{border: 0;outline: 0;}
        input, button{text-rendering: auto;color: initial;letter-spacing: normal;word-spacing: normal;text-transform: none;text-indent: 0px;text-shadow: none;display: inline-block;text-align: start;margin: 0em;font: 400 13.3333px Arial;}
        input[type=button]{-webkit-appearance: button;cursor: pointer;}
        .bg-wrap {position: relative;background: url(http://uscat.javaex.cn/FipOsQoe90u_7i3dOVpaeX5QD7c6) top left no-repeat;background-size: cover;overflow: hidden;}
        .main-cont-wrap{z-index: 1;position: absolute;top: 50%;left: 50%;margin-left: -190px;margin-top: -255px;box-sizing: border-box;width: 380px;padding: 30px 30px 40px;background: #fff;box-shadow: 0 20px 30px 0 rgba(63,63,65,.06);border-radius: 10px;}
        .form-title{margin-bottom: 40px;}
        .form-title>span{font-size: 20px;color: #2589ff;}
        .form-item{margin-bottom: 30px;position: relative;height: 40px;line-height: 40px;border-bottom: 1px solid #e3e3e3;box-sizing: border-box;}
        .form-txt{display: inline-block;width: 70px;color: #595961;font-size: 14px;margin-right: 10px;}
        .form-input{border: 0;outline: 0;font-size: 14px;color: #595961;width: 155px;}
        .form-btn{margin-top: 40px;}
        .ui-button{display: block;width: 320px;height: 50px;text-align: center;color: #fff;background: #2589ff;border-radius: 6px;font-size: 16px;border: 0;outline: 0;}
    </style>
</head>
<body>


<div class="bg-wrap">
    <div class="main-cont-wrap login-model">
        <form id="form" action="${pageContext.request.contextPath}/user/login.action" method="post">
            <div class="form-title">
                <span>后台登录</span>
                <span id="sp" style="color: red">${msg}</span>
            </div>
            <div class="form-item">
                <span class="form-txt">账号：</span>
                <input type="text" class="form-input original" id="user" name="user" placeholder="请输入账号" data-type="必填" error-pos="32" />
                <span id="sp1"></span>
            </div>
            <div class="form-item">
                <span class="form-txt">密码：</span>
                <input type="password" class="form-input original" id="password" name="password" placeholder="请输入密码" data-type="必填" error-pos="32" />
                <span id="sp2"></span>
            </div>
            <div class="form-btn">
                <input type="button" class="ui-button" id="save" value="登录" onclick="submit1(this.form);"/>
            </div>
        </form>
    </div>
</div>
</body>
<script type="text/javascript">
	var user=document.getElementById("user");
	var password=document.getElementById("password");
	var sp=document.getElementById("sp");
	var sp1=document.getElementById("sp1");
	var sp2=document.getElementById("sp2");
	user.onclick=function () {
		sp.innerHTML="";
		sp1.innerHTML="";
		sp1.style.color="black";
		user.innerHTML="";
	}
	password.onclick=function () {
		sp.innerHTML="";
		sp2.innerHTML="";
		sp2.style.color="black";
		password.innerHTML="";
	}
	function submit1(obj){
		if(user.value=="" ){
			sp1.innerHTML="输入错误";
			sp1.style.color="red";
		}else if (password.value=="") {
			sp2.innerHTML="输入错误";
			sp2.style.color="red";
		}
		else  {
			
			obj.submit();
		}
	}
</script>
</html>