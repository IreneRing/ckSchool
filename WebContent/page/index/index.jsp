<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首頁</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" href="images/favicon.gif" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/style.css"
	media="screen" />
<!-- MAIN STYLE CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/responsive.css"
	media="screen" />
<!-- RESPONSIVE CSS FILE -->
<link rel="stylesheet" id="style-color"
	href="${pageContext.request.contextPath}/static/index/css/colors/blue-color.css"
	media="screen" />
<!-- DEFAULT BLUE COLOR CSS FILE -->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,300,700,500'
	rel='stylesheet' type='text/css'>
<!-- ROBOTO FONT FROM GOOGLE CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/prettyPhoto.css"
	media="screen" />
<!--PRETTYPHOTO CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/font-awesome/font-awesome.min.css"
	media="screen" />
<!-- FONT AWESOME ICONS CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/layer-slider.css"
	media="screen" />
<!-- LAYER SLIDER CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/flexslider.css"
	media="screen" />
<!-- FLEX SLIDER CSS FILE -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/index/css/revolution-slider.css"
	media="screen" />
<!-- REVOLUTION SLIDER CSS FILE -->
<!-- All JavaScript Files (FOR FASTER LOADING OF YOUR SITE, REMOVE ALL JS PLUGINS YOU WILL NOT USE)-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.min.js"></script>
<!-- JQUERY JS FILE -->
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<!-- JQUERY UI JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/flex-slider.min.js"></script>
<!-- FLEX SLIDER JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/navigation.min.js"></script>
<!-- MAIN NAVIGATION JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.layerslider.js"></script>
<!-- LAYER SLIDER JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/layerslider.transitions.js"></script>
<!-- LAYER SLIDER TRANSITIONS JS FILE -->

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/carousel.js"></script>
<!-- CAROUSEL SLIDER JS -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.theme.plugins.min.js"></script>
<!-- REVOLUTION SLIDER PLUGINS JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.themepunch.revolution.min.js"></script>
<!-- REVOLUTION SLIDER JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/flickr.js"></script>
<!-- FLICKR WIDGET JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/instagram.js"></script>
<!-- INSTAGRAM WIDGET JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.twitter.js"></script>
<!--TWITTER WIDGET JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/prettyPhoto.min.js"></script>
<!-- PRETTYPHOTO JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.tooltips.min.js"></script>
<!-- TOOLTIPS JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/isotope.min.js"></script>
<!--ISOTOPE JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/scrolltopcontrol.js"></script>
<!-- SCROLL TO TOP JS PLUGIN -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.easy-pie-chart.js"></script>
<!-- EASY PIE JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/jquery.transit.min.js"></script>
<!-- TRANSITION JS FILE -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/index/js/custom.js"></script>
<!-- CUSTOM JAVASCRIPT JS FILE -->
</head>
<body>
	<div id="container">
		<!-- main container starts-->
		<div id="wrapp">
			<!-- main wrapp starts-->
			<header id="header"> <!--header starts -->
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
						<li><a href="res.jsp">资源下载</a></li>
					</ul>
					<!-- main navigation ends-->
					<div class="after-nav-info">
						<h4>联系 电话: +123000000000</h4>
					</div>
				</div>
			</div>
			<!--main navigation wrapper ends --> </header>
			<!-- header ends-->
			<div id="layerslider">
				<!--layer slider starts-->
				<div class="slider-shadow-top"></div>
				<div class="slider-shadow-bottom"></div>
				<!-- 轮播图 -->
				<div class="ls-layer"
					style="slidedirection: top; slidedelay: 6000; durationin: 1500; durationout: 1500; delayout: 500;">
					<img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/1/slide1-bg.jpg"
						class="ls-bg" alt=""> <img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/1/slide0-1.png"
						class="ls-s6" alt=""
						style="top: 10px; left: -15px; slidedirection: bottom; slideoutdirection: bottom; durationin: 1500; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 600;">
					<h1 class="ls-s3 ls_large_text_01"
						style="position: absolute; top: 100px; left: 490px; slidedirection: top; slideoutdirection: top; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 1000;">
						Modern Business Template.<br> Comes Fully Responsive!
					</h1>
					<h4 class="ls-s3 l1-s1 ls_large_text_02"
						style="position: absolute; top: 210px; left: 490px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 1000;">A
						super clean template ready for some serious business.</h4>
					<a class="button huge color round ls-s8" href="#"
						style="position: absolute; top: 270px; left: 490px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 1100;">Our
						Services</a>
				</div>
				<div class="ls-layer"
					style="slidedirection: right; slidedelay: 5000; durationin: 1500; durationout: 1500;">
					<img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/2/slide-bg.jpg"
						class="ls-bg" alt=""> <img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/2/item-01.png"
						class="ls-s6" alt=""
						style="top: 15px; left: 480px; slidedirection: bottom; slideoutdirection: bottom; durationin: 1500; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 600;">
					<h1 class="ls-s3 ls_large_text_01"
						style="position: absolute; font-family: Arial; top: 100px; left: 0px; slidedirection: right; slideoutdirection: left; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 400;">Clean
						Corporate Design</h1>
					<h4 class="ls-s3 l1-s1 ls_large_text_02"
						style="position: absolute; top: 160px; left: 0px; border-color: #fff; slidedirection: bottom; slideoutdirection: left; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 500;">Clean
						Corporate Template with some Awesome &amp; Unique Features</h4>
					<a class="button huge color round ls-s8" href="#"
						style="position: absolute; top: 210px; left: 0px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 0;">Our
						Portfolio</a>
				</div>
				<div class="ls-layer"
					style="slidedirection: right; slideoutdirection: top; slidedelay: 5000; durationin: 1500; durationout: 1500; delayout: 500;">
					<img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/3/slide3-bg.jpg"
						class="ls-bg" alt=""> <img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/3/slide3-pic1.png"
						class="ls-s6" alt=""
						style="top: 25px; left: 0px; slidedirection: fade; slideoutdirection: fade; durationin: 1500; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 500;">
					<h1 class="ls-s3 ls_large_text_01"
						style="position: absolute; top: 120px; left: 400px; slidedirection: top; slideoutdirection: top; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 600;">Fully
						Responsive HTML5 Template</h1>
					<h4 class="ls-s3 l1-s1 ls_large_text_02"
						style="position: absolute; top: 170px; left: 400px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 700;">Filterable
						Portfolio Included, Pricing Tables and much more...</h4>
					<a class="button huge color round ls-s8" href="#"
						style="position: absolute; top: 210px; left: 400px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 800;">Pricing
						Tables</a>
				</div>
				<div class="ls-layer"
					style="slidedirection: top; slideoutdirection: top; slidedelay: 5000; durationin: 1500; durationout: 1500; delayout: 500;">
					<img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/4/slide4-bg.jpg"
						class="ls-bg" alt=""> <img
						src="${pageContext.request.contextPath}/static/index/images/slider/layer/4/slider_4_man.png"
						class="ls-s6" alt=""
						style="top: 10px; left: 550px; slidedirection: bottom; slideoutdirection: bottom; durationin: 1500; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 300;">
					<h1 class="ls-s3 ls_large_text_01"
						style="position: absolute; top: 100px; left: 0px; slidedirection: top; slideoutdirection: top; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 500;">Fullwidth
						&amp; Boxed Versions Included</h1>
					<h4 class="ls-s3 l1-s1 ls_large_text_02"
						style="position: absolute; top: 160px; left: 0px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInBack; delayin: 600;">You
						just need to change your container width to change entire grid
						system</h4>
					<a class="button huge color round ls-s8" href="#"
						style="position: absolute; top: 210px; left: 0px; slidedirection: bottom; slideoutdirection: bottom; durationin: 3000; durationout: 750; easingin: easeInOutQuint; easingout: easeInOutQuint; delayin: 700;">Contact
						Us</a>
				</div>
			</div>
			<!--layer slider ends-->
			<div id="content">
				<div class="home-intro">
					<!-- home intro starts -->
					<div class="container">
						<div class="three-fourth"></div>
						<div class="one-fourth"></div>
					</div>
				</div>
				<!--home intro ends-->

				<!-- 导师  -->

				<div class="container">
					<h4>导 师</h4>

					<c:forEach var="teaList" items="${teaList }">
						<div class="one-third">
							<div class="feature-block">
								<!-- features blocks starts -->
								<div class="feature-block-title">
									<div class="feature-block-icon">
										<i class="icon-lightbulb"></i><span></span>
									</div>
									<h4>${teaList.tname}</h4>
									<h6>${teaList.tqq}</h6>
								</div>
								<p>${teaList.ttitle}</p>
							</div>
						</div>
					</c:forEach>
				</div>

				<!--项目-->

				<div class="intro-features">
					<!-- intro features panel starts -->
					<div class="container">
						<h4>我 们 项 目</h4>
						<div class="slidewrap">
							<!--project carousel starts-->
							<ul class="slider" id="sliderName">

								<li class="slide">
									<!-- carousel item starts --> <c:forEach var="caseList"
										items="${caseList }">
										<div class="one-fourth">
											<div class="item-wrapp">
												<div class="portfolio-item">
											<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
											<a href="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
											<img src="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" alt=""/>
										</div>

												<div class="portfolio-item-title">
													<a href="single-project-small.html">${caseList.cname}</a>
													<p>Design / Development</p>
												</div>

											</div>
										</div>

									</c:forEach>
								</li>
								<li class="slide">
									<!-- carousel item starts --> <c:forEach var="caseList"
										items="${caseList }">
										<div class="one-fourth">
											<div class="item-wrapp">
												<div class="portfolio-item">
													<a href="single-project-small.html" class="item-permalink"><i
														class="icon-link"></i></a> <a
														href="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg"
														data-rel="prettyPhoto" class="item-preview"><i
														class="icon-zoom-in"></i></a> <img
														src="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" alt="" />
												</div>

												<div class="portfolio-item-title">
													<a href="single-project-small.html">${caseList.cname}</a>
													<p>Design / Development</p>
												</div>

											</div>
										</div>

									</c:forEach>
								</li>



							</ul>
							<!-- carousel items UL ends -->
							<ul class="slidecontrols">
								<li><a href="#sliderName" class="prev">Prev</a></li>
								<li><a href="#sliderName" class="next">Next</a></li>

							</ul>
						</div>
					</div>
				</div>
				<!-- intro features panel ends -->

				<!-- 创新  图标   -->

				<div class=" clients-wrapp">
					<div class="container">
						<h4>图 标</h4>

						<div class="flexslider clients-slider ">
							<!-- flex slider starts -->
							<ul class="slides client-block">
								<li>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-1.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-2.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-3.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-4.png"
											alt="" /></a>
									</div>
									<div class="one-fifth ">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-5.png"
											alt="" /></a>
									</div>
								</li>
								<li>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-6.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-5.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-4.png"
											alt="" /></a>
									</div>
									<div class="one-fifth">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-3.png"
											alt="" /></a>
									</div>
									<div class="one-fifth ">
										<a href="#" class="tooltip" title="Some Clients Name"><img
											src="${pageContext.request.contextPath}/static/index/images/clients/client-2.png"
											alt="" /></a>
									</div>
								</li>
							</ul>
						</div>
						<!-- flex slider ends -->
					</div>
				</div>
			</div>
			<section class="footer-call-to-action"><!-- footer call to action starts -->
			<section class="container">
			<div class="three-fourth">
				<!--<h4>If you you’re interested in working with Us, feel free to contact Us via contact form.</h4>-->
			</div>
			<div class="one-fourth">
				<!--<a href="#" class="button grey huge round">Purchase Now</a>-->
			</div>
			</section> </section>
			<!-- footer call to action ends -->
			<footer id="footer"><!--footer starts --> <section
				class="container"> <section class="one-third">
			<h4>地址</h4>
			<ul class="twitter-feeds">
				<!-- twitter widget starts-->
			</ul>
			<!-- twitter widget ends-->
			<p>
				<a>东莞市松山湖高新技术产业开发区大学路3号</a>
			</p>
			</section> <section class="one-third">
			<h4>招生信息</h4>
			<ul>
				<!-- latest posts widget starts-->
				<li><a>招生： 11111111111</a></li>
				<li><a>就业： 11112222222</a></li>
				<li><a>院办： 23133131121</a></li>
				<li><a>传真： 78874115115</a></li>
			</ul>
			<!-- lastest posts widget ends--> </section> <section class="one-third">
			<h4>邮编</h4>
			<ul>
				<!-- latest posts widget starts-->
				<li><a>523808</a></li>

			</ul>
			<div class="flickr-widget">
				<!-- flickr widget starts-->
			</div>
			</section> </section> </footer>
			<section id="copyrights"> <section class="container">
			<div class="one-half">
				<p>Copyright &copy; 完成时间 2019 ； 版权--by zxy</p>
			</div>
			<div class="one-half">
				<!--<ul class="copyright_links">
				<li><a href="#" title="Home">Home</a></li>
				<li><a href="#" title="About">About us</a></li>
				<li><a href="#" title="Blog">Blog</a></li>
				<li><a href="#" title="Contact">Contact</a></li>
			</ul>-->
			</div>
			</section> </section>
		</div>
		<!-- main wrapp starts-->
	</div>
	<!-- main container ends-->

</body>
</html>