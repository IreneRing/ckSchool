<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创客教育</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
	<jsp:include page="elements/link.jsp"></jsp:include>
<!-- CUSTOM JAVASCRIPT JS FILE -->
</head>
<body>
	<div id="container">
		<!-- main container starts-->
		<div id="wrapp">
			<!-- main wrapp starts-->
			<header id="header"> <!--header starts -->
			
			<jsp:include page="elements/top.jsp"></jsp:include>
			<!--main navigation wrapper ends --> </header>
			<!-- header ends-->
			<div id="content">
				<div id="breadcrumb">
					<!-- breadcrumb starts-->
					<div class="container">
						<div class="one-half">
							<h1>创客教育</h1>
						</div>
						<div class="one-half">
							<nav id="breadcrumbs"> <!--breadcrumb nav starts-->
							<ul>
								<li>你在这里:</li>
								<li><a
									href="${pageContext.request.contextPath}/base/index.action">首页</a></li>
								<li>创客教育</li>
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
						
						 <c:forEach var="eduList" items="${pageInfo.list}">
							<div class="blog-post layout-2">
								<div class="media-holder">
									<div class="item-wrapp">
										<div class="blog-item small">
											<a href="single-project-small.html" class="item-permalink"><i
												class="icon-link"></i></a> <a
												href="${pageContext.request.contextPath}/static/index/images/blog/blog-small-01.jpg" data-rel="prettyPhoto"
												class="item-preview"><i class="icon-zoom-in"></i></a> <img
												src="${pageContext.request.contextPath}/static/index/images/blog/blog-small-01.jpg" alt="" />
										</div>
									</div>
								</div>
							
								<div class="permalink">
									<h4>
										<a href="blog-post.html">${eduList.ename}</a>
									</h4>
								</div>
							
								<ul class="post-meta">
									<li><i class="icon-time"></i> ${eduList.edate}</li>
									<!-- Date -->
									<li><i class="icon-user"></i><a href="#">${eduList.username}</a></li>
									<!-- Author -->
									<li><i class="icon-tags"></i><a href="#">Web
											Development</a></li>
									<!-- Category -->
									<li><i class="icon-comments"></i><a href="#">32
											Comments</a></li>
									<!-- Comments -->
								</ul>
								<!-- End post-meta -->
								<div class="post-intro">
									<p>${eduList.emessage}</p>
									<br />
									<p>
										<a href="blog-post-edu.html"
											class="button simple-grey small round">Read More</a>
									</p>
								</div>
								
							</div>
							</c:forEach>
							<!-- Pagination -->
							<nav class="pagination">
							<ul>
								<li><a href="${pageContext.request.contextPath}/edu/findAllEducation.action?currentPage=1">首页</a></li>
								<li><a href="${pageContext.request.contextPath}/edu/findAllEducation.action?currentPage=${pageInfo.prePage}" >上一页</a></li>
								<li><a href="${pageContext.request.contextPath}/edu/findAllEducation.action?currentPage=${pageInfo.nextPage}">下一页</a></li>
								<li><a href="${pageContext.request.contextPath}/edu/findAllEducation.action?currentPage=${pageInfo.pages}">尾页</a></li>
								<li><a href="javascript:void(0);">当前[${pageInfo.pageNum }/${pageInfo.pages }]页</a></li>
							</ul>
							<div class="clearfix"></div>
							</nav>
							<!-- End pagination -->
						</div>
						<div class="one-fourth sidebar right">
							<div class="widget">
								<nav class="top-search"> <!-- search starts-->
								<form action="404-error.html" method="get">
									<button class="search-btn"></button>
									<input class="search-field" type="text"
										onblur="if(this.value=='')this.value='Search';"
										onfocus="if(this.value=='Search')this.value='';"
										value="Search" />
								</form>
								</nav>
							</div>
							<div class="widget">
								<h4 class="widget-title">About Our Writing</h4>
								<p>Lorem ipsum dolor sit amet nec, consectetuer adipiscing
									elit. Aenean commodo ligula eget dolor. Aenean massa. Cum
									sociis natoque penatibus et magnis dis parturient montes. Lorem
									ipsum dolor sit amet nec, consectetuer adipiscing elit. Aenean
									commodo ligula eget dolor</p>
							</div>
							<div class="widget">
								<h4 class="widget-title">Archive</h4>
								<ul class="sidebar-nav">
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>July 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>June 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>May 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>April 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>March 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>February 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>January 2013</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>December 2012</a></li>
									<li><a href="#" title="Some Title"><i
											class="icon-angle-right"></i>November 2012</a></li>
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
								<div class="flickr-widget inner"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<jsp:include page="elements/bottom.jsp"></jsp:include>
		</div>
		<!-- main wrapp starts-->
	</div>
	<!-- main container ends-->

</body>
</html>