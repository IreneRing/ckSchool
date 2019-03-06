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
			<div id="layerslider">
			<!-- 輪播圖 -->
				<jsp:include page="elements/pic.jsp"></jsp:include>
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
			<jsp:include page="elements/bottom.jsp"></jsp:include>
		</div>
		<!-- main wrapp starts-->
	</div>
	<!-- main container ends-->

</body>
</html>