<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="header-links">
				<div class="container">
					<div class="one-half">
						<ul class="contact-links">
							<!-- header social links starts-->
							<li><a ><i class="icon-home"></i>東莞職業技術學院 </a></li>
							<li><a ><i class="icon-phone"></i>+10000000000 </a></li>
							<li><a ><i class="icon-map-marker"></i>22323232@333.com</a></li>
						</ul>
					</div>

					<!--通訊標志 -->
					<div class="one-half">
						<ul class="social-links">
						</ul>
						<!--header social links ends -->
					</div>
				</div>
			</div>
			<div class="container">
				<div class="head-wrapp">
					<a href="${pageContext.request.contextPath}/base/index.action" id="logo">
						<!--<img src="images/logo.png" alt=""/>-->
						<span>
							<h1>东莞职业技术学院创客培育学校</h1>
					</span>
					</a>
					<!--your logo-->
					<!-- 搜索框 -->
					<nav class="top-search"> &nbsp;&nbsp;
					<!-- <form action="404-error.html" method="get">
						<button class="search-btn"></button>
						<input class="search-field" type="text"
							onblur="if(this.value=='')this.value='Search';"
							onfocus="if(this.value=='Search')this.value='';" value="Search" />
					</form>-->
					</nav> 
					<!--search ends -->
				</div>
			</div>
			<div id="main-navigation">
				<!--main navigation wrapper starts -->
				<div class="container">
					<ul class="main-menu">
						<li><a href="${pageContext.request.contextPath}/base/index.action" id="current">首页</a> <!-- Second Level / Start -->
							<!-- Second Level / End --></li>
						<li><a href="${pageContext.request.contextPath}/edu/findAllEducation.action"> 创客教育</a> <!-- Mega Menu / Start --> <!-- Mega Menu / End -->
						</li>
						<li><a href="${pageContext.request.contextPath}/new/findAllNew.action"> 创客新聞</a> <!-- Second Level / Start -->
							<!-- Second Level / End --></li>
						<li><a href="${pageContext.request.contextPath}/tea/findAllTeacher.action"> 创客导师</a> <!-- Second Level / Start -->
							<!-- Second Level / End -->
						<li><a href="${pageContext.request.contextPath}/case/findAllTeacher.action">创客案例</a> <!-- Second Level / Start -->
							<!--<ul>
						
					</ul>--> <!-- Second Level / End --></li>
						<li><a href="${pageContext.request.contextPath}/achievements/findAllAchievements.action">创客成果</a> <!-- Second Level / Start -->
							<!-- Second Level / End --></li>
						<li><a href="${pageContext.request.contextPath}/res/findAllRes.action">资源下载</a></li>
					</ul>
					<!-- main navigation ends-->
					<div class="after-nav-info">
						<h4>联系 电话: +123000000000</h4>
					</div>
				</div>
			</div>
</body>
</html>
