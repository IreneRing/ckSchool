<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资源下载</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" href="images/favicon.gif"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/style.css" media="screen"/><!-- MAIN STYLE CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/responsive.css" media="screen"/><!-- RESPONSIVE CSS FILE -->
<link rel="stylesheet" id="style-color" href="${pageContext.request.contextPath}/static/index/css/colors/blue-color.css" media="screen"/><!-- DEFAULT BLUE COLOR CSS FILE -->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700,500' rel='stylesheet' type='text/css'><!-- ROBOTO FONT FROM GOOGLE CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/prettyPhoto.css" media="screen"/><!--PRETTYPHOTO CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/font-awesome/font-awesome.min.css" media="screen"/><!-- FONT AWESOME ICONS CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/layer-slider.css" media="screen"/><!-- LAYER SLIDER CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/flexslider.css" media="screen"/><!-- FLEX SLIDER CSS FILE -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/index/css/revolution-slider.css" media="screen"/><!-- REVOLUTION SLIDER CSS FILE -->
<!-- All JavaScript Files (FOR FASTER LOADING OF YOUR SITE, REMOVE ALL JS PLUGINS YOU WILL NOT USE)-->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.min.js"></script><!-- JQUERY JS FILE -->
<script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script><!-- JQUERY UI JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/flex-slider.min.js"></script><!-- FLEX SLIDER JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/navigation.min.js"></script><!-- MAIN NAVIGATION JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.layerslider.js"></script><!-- LAYER SLIDER JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/layerslider.transitions.js"></script><!-- LAYER SLIDER TRANSITIONS JS FILE -->

<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/carousel.js"></script><!-- CAROUSEL SLIDER JS -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.theme.plugins.min.js"></script><!-- REVOLUTION SLIDER PLUGINS JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.themepunch.revolution.min.js"></script><!-- REVOLUTION SLIDER JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/flickr.js"></script><!-- FLICKR WIDGET JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/instagram.js"></script><!-- INSTAGRAM WIDGET JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.twitter.js"></script><!--TWITTER WIDGET JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/prettyPhoto.min.js"></script><!-- PRETTYPHOTO JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.tooltips.min.js"></script><!-- TOOLTIPS JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/isotope.min.js"></script><!--ISOTOPE JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/scrolltopcontrol.js"></script><!-- SCROLL TO TOP JS PLUGIN -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.easy-pie-chart.js"></script><!-- EASY PIE JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/jquery.transit.min.js"></script><!-- TRANSITION JS FILE -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/index/js/custom.js"></script><!-- CUSTOM JAVASCRIPT JS FILE -->
</head>
<body>
<div id="container">
	<!-- main container starts-->
	<div id="wrapp">
		<!-- main wrapp starts-->
		<header id="header">
		<!--header starts -->
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
				<a href="${pageContext.request.contextPath}/base/index.action" id="logo"><!--<img src="images/logo.png" alt=""/>--><span> <h1>东莞职业技术学院创客培育学校 </h1></span></a>
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
					<li><a href="${pageContext.request.contextPath}/base/index.action" id="current">首页</a>
					<!-- Second Level / Start -->
					<!-- Second Level / End -->
					</li>
				<li><a href="edu.jsp"> 创客教育</a>
					<!-- Mega Menu / Start -->
					<!-- Mega Menu / End -->
					</li>
					<li><a href="new.jsp"> 创客新聞</a>
					<!-- Second Level / Start -->
					<!-- Second Level / End -->
					</li>
					<li><a href="teacher.jsp"> 创客导师</a>
					<!-- Second Level / Start -->
					<!-- Second Level / End -->
					<li><a href="case.jsp">创客案例</a>
					<!-- Second Level / Start -->
					<!--<ul>
						
					</ul>-->
					<!-- Second Level / End -->
					</li>
					<li><a href="ach.jsp">创客成果</a>
					<!-- Second Level / Start -->
					<!-- Second Level / End -->
					</li>
					<li><a href="res.jsp">资源下载</a></li>
				</ul>
				<!-- main navigation ends-->
				<div class="after-nav-info">
					<h4>联系         电话: +123000000000</h4>
				</div>
			</div>
		</div>
		<!--main navigation wrapper ends -->
		</header>
		<!-- header ends-->
		<div id="content">
			<div id="breadcrumb">
				<!-- breadcrumb starts-->
				<div class="container">
					<div class="one-half">
						<h1>资源下载</h1>
					</div>
					<div class="one-half">
						<nav id="breadcrumbs">
						<!--breadcrumb nav starts-->
						<ul>
							<li>你在这里:</li>
							<li><a href="index.html">首页</a></li>
							<li>资源下载</li>
						</ul>
						</nav>
						<!--breadcrumb nav ends -->
					</div>
				</div>
			</div>
			<!--breadcrumbs ends -->
			<div class="container">
				<section class="one">
				<div class="one-fourth">
					<h4>电子书</h4>
					<ul class="unstyled">
						<li>1</li>
						<li>1</li>
						<li>1</li>
						<li>1</li>
					</ul>
				</div>



				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<h4>工具</h4>
				<section class="one-fourth">
				<ul class="unstyled">
					<li>1</li>
					<li>1</li>
					<li>1</li>
					<li>1</li>
				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<section class="one-fourth">
				<h4>Currency Icons</h4>
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<section class="one-fourth">
				<h4>Text Editor Icons</h4>
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<h4>Directional Icons</h4>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<h4>Video Player Icons</h4>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				</section>
				<section class="one">
				<div class="horizontal-line">
				</div>
				<h4>Social Icons</h4>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">

				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">
				</ul>
				</section>
				<section class="one-fourth">
				<ul class="unstyled">
				</ul>
				</section>
				</section>
				<div class="horizontal-line">
				</div>
			</div>
		</div>
		<section class="footer-call-to-action">
		<section class="container">
		<div class="three-fourth">
			<!--<h4>If you you’re interested in working with Us, feel free to contact Us via contact form.</h4>-->
		</div>
		<div class="one-fourth">
			<!--<a href="#" class="button grey huge round">Purchase Now</a>-->
		</div>
		</section>
		</section><!-- footer call to action ends -->
		<footer id="footer"><!--footer starts -->
		<section class="container">
		<section class="one-third">
			<h4>地址</h4>
		<ul class="twitter-feeds">
			<!-- twitter widget starts-->
		</ul>
		<!-- twitter widget ends-->
		<p>
			<a >东莞市松山湖高新技术产业开发区大学路3号</a>
		</p>
		</section>
		<section class="one-third">
		<h4>招生信息</h4>
		<ul>
			<!-- latest posts widget starts-->
			<li><a >招生：  11111111111</a></li>
			<li><a >就业：  11112222222</a></li>
			<li><a >院办：  23133131121</a></li>
			<li><a >传真：  78874115115</a></li>
		</ul>
		<!-- lastest posts widget ends-->
		</section>
		<section class="one-third">
		<h4>邮编</h4>
		<ul>
			<!-- latest posts widget starts-->
			<li><a >523808</a></li>
			
		</ul>
		<div class="flickr-widget">
			<!-- flickr widget starts-->
		</div>
		</section>
		</section>
		</footer>
		<section id="copyrights">
		<section class="container">
		<div class="one-half">
			<p>
				 Copyright &copy; 完成时间   2019 ； 版权--by zxy
			</p>
		</div>
		<div class="one-half">
			<!--<ul class="copyright_links">
				<li><a href="#" title="Home">Home</a></li>
				<li><a href="#" title="About">About us</a></li>
				<li><a href="#" title="Blog">Blog</a></li>
				<li><a href="#" title="Contact">Contact</a></li>
			</ul>-->
		</div>
		</section>
		</section>
	</div>
	<!-- main wrapp starts-->
</div>
<!-- main container ends-->

</body>
</html>