<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创业成果</title>
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
						<h1>创业成果</h1>
					</div>
					<div class="one-half">
						<nav id="breadcrumbs"><!--breadcrumb nav starts-->
						<ul>
							<li>你在这里:</li>
							<li><a href="${pageContext.request.contextPath}/base/index.action">首页</a></li>
							<li>创业成果</li>
						</ul>
						</nav><!--breadcrumb nav ends -->
					</div>
				</div>
			</div><!--breadcrumbs ends -->
		<div class="container">
		 <ul class="client-block modern">
		 <c:forEach var="achievementsList" items="${achievementsList }" varStatus="status">
		 	<c:if test="status%2==0">
		 		<div class="horizontal-line"></div>
		 	</c:if>
			 <li class="one-third" style="margin-bottom: 15px">
			 	<a href="about-us.html" class="tooltip" title="Some Clients Name">
			 		<img src="${pageContext.request.contextPath}/static/index/images/clients/client-1.png" alt=""/>
		 		</a>
		 		<p>${achievementsList.aname}</p>
			 </li>
			 
		 </c:forEach>
		 </ul>
		<div class="horizontal-line"></div>

		<!-- <ul class="client-block modern">
			 <li class="one-fourth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-1.png" alt=""/></a></li>
			 <li class="one-fourth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-2.png" alt=""/></a></li>
			 <li class="one-fourth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-3.png" alt=""/></a></li>
			 <li class="one-fourth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-4.png" alt=""/></a></li>
		 </ul> -->

		 <div class="horizontal-line"></div>

		<!--  <ul class="client-block modern">
			 <li class="one-fifth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-1.png" alt=""/></a></li>
			 <li class="one-fifth"><a href="about-us.html#" class="tooltip" title="Some Clients Name"><img src="images/clients/client-2.png" alt=""/></a></li>
			 <li class="one-fifth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-3.png" alt=""/></a></li>
			 <li class="one-fifth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-4.png" alt=""/></a></li>
			 <li class="one-fifth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-5.png" alt=""/></a></li>
		 </ul> -->
		 <div class="horizontal-line"></div>

		 <!-- <ul class="client-block modern">
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-1.png" alt=""/></a></li>
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-2.png" alt=""/></a></li>
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-3.png" alt=""/></a></li>
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-4.png" alt=""/></a></li>
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-5.png" alt=""/></a></li>
			 <li class="one-sixth"><a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-6.png" alt=""/></a></li>
		 </ul> -->
		
	</div>
	</div>
<div class="intro-features">
				<div class="container">
					<div class="flexslider clients-slider  no-margin "><!-- flex slider starts -->
						<ul class="slides client-block">
							<li>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-1.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-2.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-3.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-4.png" alt=""/></a>
							</div>
							<div class="one-fifth ">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-5.png" alt=""/></a>
							</div>
							</li>
							<li>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-6.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-5.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-4.png" alt=""/></a>
							</div>
							<div class="one-fifth">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-3.png" alt=""/></a>
							</div>
							<div class="one-fifth ">
								<a href="about-us.html" class="tooltip" title="Some Clients Name"><img src="images/clients/client-2.png" alt=""/></a>
							</div>
							</li>
						</ul>
					</div><!-- flex slider ends -->
				</div>
			</div>
			
		<jsp:include page="elements/bottom.jsp"></jsp:include>
	</div>
	<!-- main wrapp starts-->
</div>
<!-- main container ends-->

</body>
</html>