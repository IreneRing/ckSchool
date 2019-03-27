<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增文章 - 新聞管理</title>
<jsp:include page="elements/link.jsp"></jsp:include>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-article-add" action="${pageContext.request.contextPath}/new/newsAdd.action" method="post" enctype="multipart/form-data">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>标题：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text"  id="nname" name="nname">
			</div>
		</div>
		<div class="row cl">
		</div>
		<div class="row cl">
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>新聞类型：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
			
				<select name="ncid" class="select">
				<c:forEach var="ncList" items="${ncList }">
					<option value="${ncList.ncid }">${ncList.ncclass }</option>
				</c:forEach>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">新聞来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" readonly="readonly" class="input-text" value="${user.username}" placeholder="" id="username" name="username">
				<input type="hidden" name="uid" value="${user.uid}">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<!-- <input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })" id="commentdatemin" name="commentdatemin" class="input-text Wdate">
				 --><input type="text" onfocus="WdatePicker({ Date:'%y-%M-%d' })" id="ndate" name="ndate" class="input-text Wdate" style="width:120px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">图片：</label>
			<div class="formControls col-xs-8 col-sm-9">
  				<input name="file" type="file" class="opt_input" />
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">内容：</label>
			<div class="formControls col-xs-8 col-sm-9"> 
				<textarea name="nmessage" style="height:auto; font-size:14px; width: 545px;height: 250px"></textarea>
			 </div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button  id="btn" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
				<button onClick="removeIframe();" class="btn btn-default radius" type="reset">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</article>

<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	//表单验证
	$("#form-article-add").validate({
		rules:{
			nname:{
				required:true,
			},
			ncid:{
				required:true,
			},
			ndate:{
				required:true,
			},
			nmessage:{
				required:true,
			},
		},
		onkeyup:false, 
		focusCleanup:true,		//当为false时，验证无效时，没有焦点响应  
		success:"valid",
		submitHandler:function(form){	//表单提交句柄,为一回调函数，带一个参数：form 
			$(form).ajaxSubmit({
				 type: 'post',
			    url: "${pageContext.request.contextPath}/new/newsAdd.action",
			    success: function(data){
			    	     //layer.msg('添加成功!',{icon:1,time:1000});
				    		var index = parent.layer.getFrameIndex(window.name);
				    		parent.layer.close(index);
			    	    },
			    	                error: function(XmlHttpRequest, textStatus, errorThrown){
			    	   var index = parent.layer.getFrameIndex(window.name);
		    		parent.layer.close(index);
			    	    }
			});
			
		}
	}); 
	
	
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>