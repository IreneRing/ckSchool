<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
<jsp:include page="elements/link.jsp"></jsp:include>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-article-add" action="${pageContext.request.contextPath}/teaClass/teaClassUpd.action" method="post" >
	<input type="hidden" class="input-text" value="${eduClass.ecid}" placeholder="" id=tcid name="tcid">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>名稱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${teaClass.tcclass}" id="tcclass" name="tcclass">
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
			<!-- onClick="article_save_submit();" -->
				<button  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
				<!-- <button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button> -->
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
	
	/* 檢驗重名 */
	$("#tcclass").change('input propertychange',function(){
		$.ajax({
			url:  "${pageContext.request.contextPath}/teaClass/teaClassCheck.action?tcclass="+$("#tcclass").val(),
	        type: "post",
		    success: function (data) {
			     if(data == 'yes'){
			            	 //layer.closeAll('loading');
			            	 layer.msg("已存在！请重新填写");
			            	 $("#tcclass").val("");
			      }
		    }
		});
	});
	
	//表单验证
	$("#form-article-add").validate({
		rules:{
			tcclass:{
				required:true,
			},
			
		},
		onkeyup:false,
		focusCleanup:true,		//当为false时，验证无效时，没有焦点响应  
		success:"valid",
		submitHandler:function(form){	//表单提交句柄,为一回调函数，带一个参数：form 
			$(form).ajaxSubmit({
				 type: 'post',
			    url: "${pageContext.request.contextPath}/teaClass/teaClassUpd.action",
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
			//form.submit();
		}
	}); 
	
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>