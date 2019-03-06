<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创客导师模块</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<jsp:include page="elements/link.jsp"></jsp:include>
</head>
<body>
<div id="container">
	<!-- main container starts-->
	<div id="wrapp">
		<!-- main wrapp starts-->
		<header id="header">
		<!--header starts -->
		
		<jsp:include page="elements/top.jsp"></jsp:include>
		<!--main navigation wrapper ends -->
		</header>
		<!-- header ends-->
 
		<div id="content">
			 		<div id="breadcrumb"><!-- breadcrumb starts-->
				<div class="container">
					<div class="one-half">
						<h1>导师模块</h1>
					</div>
					<div class="one-half ">
						<nav id="breadcrumbs"><!--breadcrumb nav starts-->
						<ul>
							<li>你在这里:</li>
							<li><a href="${pageContext.request.contextPath}/base/index.action">首页</a></li>
							<li>导师模块</li>
						</ul>
						</nav><!--breadcrumb nav ends -->
					</div>
				</div>
			</div><!--breadcrumbs ends -->
			<div class="container">
				<ul id="filterable">
					<li><a data-categories="*">全部</a></li>
					<li><a data-categories="print">Print Design</a></li>
					<li><a data-categories="design">Design</a></li>
					<li><a data-categories="illustration">Illustration</a></li>
					<li><a data-categories="photography">Photography</a></li>
					<li><a data-categories="development">Development</a></li>
				</ul>
				<ul id="portfolio-container" class="two-columns">
					<c:forEach var="teaList" items="${teaList }">
						<li class="isotope-item" data-categories="design print" style="float: left">
							<div class="item-wrapp" >
									<div class="portfolio-item">
										<a href="team-member.html" class="item-permalink"><i class="icon-link"></i></a>
										<a href="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" data-rel="prettyPhoto" class="item-preview"><i class="icon-zoom-in"></i></a>
										<img src="${pageContext.request.contextPath}/static/index/images/portfolio/portfolio-item-1.jpg" alt=""/>
									</div>
									<div class="portfolio-item-title">
										<a href="team-member.html" style="font-size: 20px">
											${teaList.tname}
										</a>
										<p>---------------</p>
										<p style="font-size: 14px">
											 ${teaList.ttitle}
										</p>
									</div>
							</div>
						</li>
					</c:forEach>
					 
				</ul>

					<!-- Pagination -->
						<nav class="pagination">
						<ul>
							<li><a href="#">上一页</a></li>
							<li><a href="#" class="current">1</a></li>
							<li><a href="#" >2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">下一页</a></li>
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