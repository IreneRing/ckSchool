<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创客案例</title>
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
		<!--main navigation wrapper ends -->
		</header>
		<!-- header ends-->
 
		<div id="content">
			 		<div id="breadcrumb">
					<!-- breadcrumb starts-->
				<div class="container">
					<div class="one-half">
						<h1>创业案例</h1>
					</div>
					<div class="one-half ">
						<nav id="breadcrumbs"><!--breadcrumb nav starts-->
						<ul>
							<li>你在这里:</li>
							<li><a href="${pageContext.request.contextPath}/base/index.action">首页</a></li>
							<li>创业案例</li>
						</ul>
						</nav>
							<!--breadcrumb nav ends -->
					</div>
				</div>
			</div>
				<!--breadcrumbs ends -->
			<div class="container">
				<ul id="filterable">
					<li><a data-categories="*">全部</a></li>
				<c:forEach var="ccList" items="${ccList }">
					<li><a data-categories="print">${ccList.ccclass }</a></li>
				</c:forEach>
				</ul>
				 
				<ul id="portfolio-container" class="four-columns">
					<c:forEach var="caseList" items="${pageInfo.list }">
					<li class="isotope-item" data-categories="design print"
								style="float: left">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i
											class="icon-link"></i></a>
									<a href="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg"
											data-rel="prettyPhoto" class="item-preview"><i
											class="icon-zoom-in"></i></a>
									<img src="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" alt="" />
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">${caseList.cname}</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					</c:forEach>
					<!-- <li class="isotope-item" data-categories="development">
							<div class="item-wrapp">
								<div class="flexslider portfolio-items-slider slide">
									<ul class="slides">
										<li><img src="images/portfolio/portfolio-item-2.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-3.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-4.jpg" alt=""/></li>
									</ul>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">T-Shirt Design</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-5.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-5.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Joomla Plugins</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="photography print">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-6.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-6.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Video Project</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="design development">
						<div class="item-wrapp">
								<div class="flexslider portfolio-items-slider slide">
									<ul class="slides">
										<li><img src="images/portfolio/portfolio-item-8.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-9.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-10.jpg" alt=""/></li>
									</ul>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Custom PHP CMS</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="development photography">
							<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-9" class="item-preview" data-rel="prettyPhoto"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-9.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Joomla Templates</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="design illustration">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-10.jpg" class="item-preview" data-rel="prettyPhoto"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-10.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Custom Magento Theme</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="photography print">
						<div class="item-wrapp">
								<div class="flexslider portfolio-items-slider slide">
									<ul class="slides">
										<li><img src="images/portfolio/portfolio-item-11.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-12.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-13.jpg" alt=""/></li>
									</ul>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">T-Shirt Design</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="design development illustration">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-12.jpg" class="item-preview" data-rel="prettyPhoto"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-12.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Video Project</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="print photography">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-13.jpg" class="item-preview" data-rel="prettyPhoto"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-13.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Custom PHP CMS</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item" data-categories="illustration development">
						<div class="item-wrapp">
								<div class="flexslider portfolio-items-slider slide">
									<ul class="slides">
										
										<li><img src="images/portfolio/portfolio-item-14.jpg" alt=""/></li>
										<li><img src="images/portfolio/portfolio-item-15.jpg" alt=""/></li>
									</ul>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Joomla Templates</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li>
					<li class="isotope-item " data-categories="illustration">
						<div class="item-wrapp">
								<div class="portfolio-item">
									<a href="single-project-small.html" class="item-permalink"><i class="icon-link"></i></a>
									<a href="images/portfolio/portfolio-item-16.jpg" class="item-preview" data-rel="prettyPhoto"><i class="icon-zoom-in"></i></a>
									<img src="images/portfolio/portfolio-item-16.jpg" alt=""/>
								</div>
								<div class="portfolio-item-title">
									<a href="single-project-small.html">Font Design</a>
									<p>
										 Design / Development
									</p>
								</div>
							</div>
					</li> -->
				</ul>
				 

					<!-- Pagination -->
						<nav class="pagination">
						<ul>
							<li><a href="${pageContext.request.contextPath}/case/findAllTeacher.action?currentPage=1">首页</a></li>
							<li><a href="${pageContext.request.contextPath}/case/findAllTeacher.action?currentPage=${pageInfo.prePage}" >上一页</a></li>
							<li><a href="${pageContext.request.contextPath}/case/findAllTeacher.action?currentPage=${pageInfo.nextPage}">下一页</a></li>
							<li><a href="${pageContext.request.contextPath}/case/findAllTeacher.action?currentPage=${pageInfo.pages}">尾页</a></li>
							<li><a href="javascript:void(0);">当前[${pageInfo.pageNum }/${pageInfo.pages }]页</a></li>
						</ul>
						 
						</nav>
					<!-- End pagination -->
			</div>
			</div>
		<jsp:include page="elements/bottom.jsp"></jsp:include>
	</div>
	<!-- main wrapp starts-->
</div>
<!-- main container ends-->

</body>
</html>