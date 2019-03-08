<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资源下载</title>
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
							<li><a href="${pageContext.request.contextPath}/base/index.action">首页</a></li>
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
				<c:forEach var="list" items="${pageInfo.list }">
					<h4>${list.rcclass}</h4>
					<ul class="unstyled">
					<c:forEach var="res" items="${list.res}">
						<li><a href="#">${res.rname}</a></li>
					</c:forEach>
					</ul>
				</c:forEach>
				</div>
				<!-- Pagination -->
					<nav class="pagination">
						<ul>
							<li><a href="${pageContext.request.contextPath}/res/findAllRes.action?currentPage=1">首页</a></li>
							<li><a href="${pageContext.request.contextPath}/res/findAllRes.action?currentPage=${pageInfo.prePage}" >上一页</a></li>
							<li><a href="${pageContext.request.contextPath}/res/findAllRes.action?currentPage=${pageInfo.nextPage}">下一页</a></li>
							<li><a href="${pageContext.request.contextPath}/res/findAllRes.action?currentPage=${pageInfo.pages}">尾页</a></li>
							<li><a href="javascript:void(0);">当前[${pageInfo.pageNum }/${pageInfo.pages }]页</a></li>
						</ul>
					</nav>
				<!-- End pagination -->
				
				</section>
				<!-- <section class="one">
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
				</section> -->
				<div class="horizontal-line">
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