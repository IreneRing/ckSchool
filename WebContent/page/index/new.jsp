<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创客新聞</title>
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
						
					</ul>-->
					<!-- Second Level / End -->
					</li>
					<li><a href="${pageContext.request.contextPath}/achievements/findAllAchievements.action">创客成果</a> <!-- Second Level / Start -->
						
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
						<h1>创客新聞</h1>
					</div>
					<div class="one-half">
						<nav id="breadcrumbs">
						<!--breadcrumb nav starts-->
						<ul>
							<li>你在这里:</li>
							<li><a href="index.html">首页</a></li>
							<li>创客新聞</li>
						</ul>
						</nav>
						<!--breadcrumb nav ends -->
					</div>
				</div>
			</div>
			<!--breadcrumbs ends -->
			<div class="container">
				<div class="one">
					<div class="three-fourth">
					
					<c:forEach var="newList" items="${newList}">
						<div class="blog-post layout-2">
							<div class="media-holder">
								<div class="item-wrapp">
									<div class="blog-item small">
										<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
										<a href="${pageContext.request.contextPath}/static/index/images/blog/blog-small-01.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
										<img src="${pageContext.request.contextPath}/static/index/images/blog/blog-small-01.jpg" alt=""/>
									</div>
								</div>
							</div>
							<div class="permalink">
								<h4><a href="blog-post.html">${newList.nname}</a></h4>
							</div>
							<ul class="post-meta">
								<li><i class="icon-time"></i>${newList.ndate}</li>
								<!-- Date -->
								<li><i class="icon-user"></i><a href="#">${newList.username}</a></li>
								<!-- Author -->
								<li><i class="icon-tags"></i><a href="#">Web Development</a></li>
								<!-- Category -->
								<li><i class="icon-comments"></i><a href="#">32 Comments</a></li>
								<!-- Comments -->
							</ul>
							<!-- End post-meta -->
							<div class="post-intro">
								<p>
									 ${newList.nmessage}
								</p>
								<br/>
								<p>
									<a href="blog-post.html" class="button simple-grey small round">Read More</a>
								</p>
							</div>
						</div>
						</c:forEach>
						<!-- <div class="blog-post layout-2">
							<div class="media-holder">
								<div class="item-wrapp">
									<div class="blog-item small">
										<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
										<a href="images/blog/blog-small-02.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
										<img src="images/blog/blog-small-02.jpg" alt=""/>
									</div>
								</div>
							</div>
							<div class="permalink">
								<h4><a href="blog-post.html">Best Way to Build Responsive Web Sites</a></h4>
							</div>
							<ul class="post-meta">
								<li><i class="icon-time"></i> 2 July, 2013 </li>
								Date
								<li><i class="icon-user"></i><a href="#">Admin</a></li>
								Author
								<li><i class="icon-tags"></i><a href="#">Web Development</a></li>
								Category
								<li><i class="icon-comments"></i><a href="#">32 Comments</a></li>
								Comments
							</ul>
							End post-meta
							<div class="post-intro">
								<p>
									 Morbi placerat bibendum eget dolor pellentesque sed consectetur pulvinar pellentesque bibendum. Vestibulum varius hendrerit turpis quiseam cursus. Donec bibendum vestibulum gravida.
								</p>
								<br/>
								<p>
									<a href="blog-post.html" class="button simple-grey small round">Read More</a>
								</p>
							</div>
						</div> -->
						<!-- <div class="blog-post layout-2">
							<div class="media-holder">
								<div class="item-wrapp">
									<div class="flexslider portfolio-items-slider slide">
										<ul class="slides">
											<li><img src="images/blog/blog-small-02.jpg" alt=""/></li>
											<li><img src="images/blog/blog-small-03.jpg" alt=""/></li>
											<li><img src="images/blog/blog-small-04.jpg" alt=""/></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="permalink">
								<h4><a href="blog-post.html">Creating Fully Layered PSD Mockup</a></h4>
							</div>
							<ul class="post-meta">
								<li><i class="icon-time"></i> 2 July, 2013 </li>
								Date
								<li><i class="icon-user"></i><a href="#">Admin</a></li>
								Author
								<li><i class="icon-tags"></i><a href="#">Web Development</a></li>
								Category
								<li><i class="icon-comments"></i><a href="#">32 Comments</a></li>
								Comments
							</ul>
							End post-meta
							<div class="post-intro">
								<p>
									 Morbi placerat bibendum eget dolor pellentesque sed consectetur pulvinar pellentesque bibendum. Vestibulum varius hendrerit turpis quiseam cursus. Donec bibendum vestibulum gravida.
								</p>
								<br/>
								<p>
									<a href="blog-post.html" class="button simple-grey small round">Read More</a>
								</p>
							</div>
						</div>
						<div class="blog-post layout-2">
							<div class="media-holder">
								<div class="item-wrapp">
									<div class="blog-item small">
										<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
										<a href="images/blog/blog-small-04.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
										<img src="images/blog/blog-small-04.jpg" alt=""/>
									</div>
								</div>
							</div>
							<div class="permalink">
								<h4><a href="blog-post.html">10+ Free Fonts For Download</a></h4>
							</div>
							<ul class="post-meta">
								<li><i class="icon-time"></i> 2 July, 2013 </li>
								Date
								<li><i class="icon-user"></i><a href="#">Admin</a></li>
								Author
								<li><i class="icon-tags"></i><a href="#">Web Development</a></li>
								Category
								<li><i class="icon-comments"></i><a href="#">32 Comments</a></li>
								Comments
							</ul>
							End post-meta
							<div class="post-intro">
								<p>
									 Morbi placerat bibendum eget dolor pellentesque sed consectetur pulvinar pellentesque bibendum. Vestibulum varius hendrerit turpis quiseam cursus. Donec bibendum vestibulum gravida.
								</p>
								<br/>
								<p>
									<a href="blog-post.html" class="button simple-grey small round">Read More</a>
								</p>
							</div>
						</div> -->
						<!-- Pagination -->
						<nav class="pagination">
						<ul>
							<li><a href="#">上一页</a></li>
							<li><a href="#" class="current">1</a></li>
							<li><a href="#" >2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">下一页</a></li>
						</ul>
						<div class="clearfix">
						</div>
						</nav>
						<!-- End pagination -->
					</div>
					<div class="one-fourth sidebar right">
						<div class="widget">
							<nav class="top-search">
							<!-- search starts-->
							<form action="404-error.html" method="get">
								<button class="search-btn"></button>
								<input class="search-field" type="text" onblur="if(this.value=='')this.value='Search';" onfocus="if(this.value=='Search')this.value='';" value="Search"/>
							</form>
							</nav>
						</div>
						<div class="widget">
							<h4 class="widget-title">About Our Writing</h4>
							<p>
								 Lorem ipsum dolor sit amet nec, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes. Lorem ipsum dolor sit amet nec, consectetuer adipiscing elit. Aenean commodo ligula eget dolor
							</p>
						</div>
						<div class="widget">
							<h4 class="widget-title">Archive</h4>
							<ul class="sidebar-nav">
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>July 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>June 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>May 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>April 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>March 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>February 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>January 2013</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>December 2012</a></li>
								<li><a href="#" title="Some Title"><i class="icon-angle-right"></i>November 2012</a></li>
							</ul>
						</div>
						<div class="widget">
							<h4 class="widget-title">Popular Tags</h4>
							<ul class="popular-tags">
								<li><a href="#"><i class="icon-tag"></i>AJAX</a></li>
								<li><a href="#"><i class="icon-tag"></i>HTML5</a></li>
								<li><a href="#"><i class="icon-tag"></i>jQuery</a></li>
								<li><a href="#"><i class="icon-tag"></i>CSS3</a></li>
								<li><a href="#"><i class="icon-tag"></i>PHP</a></li>
								<li><a href="#"><i class="icon-tag"></i>Wordpress</a></li>
								<li><a href="#"><i class="icon-tag"></i>Photoshop</a></li>
								<li><a href="#"><i class="icon-tag"></i>Uncategorized</a></li>
								<li><a href="#"><i class="icon-tag"></i>Ruby</a></li>
								<li><a href="#"><i class="icon-tag"></i>Drupal</a></li>
								<li><a href="#"><i class="icon-tag"></i>Inspiration</a></li>
								<li><a href="#"><i class="icon-tag"></i>Joomla</a></li>
								<li><a href="#"><i class="icon-tag"></i>Design</a></li>
								<li><a href="#"><i class="icon-tag"></i>Responsive</a></li>
								<li><a href="#"><i class="icon-tag"></i>Envato</a></li>
								<li><a href="#"><i class="icon-tag"></i>Wallpapers</a></li>
								<li><a href="#"><i class="icon-tag"></i>Fonts</a></li>
							</ul>
						</div>
						<div class="widget">
							<h4 class="widget-title">照片</h4>
							<div class="flickr-widget inner">
							</div>
						</div>
					</div>
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