<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑文章 - 导师管理</title>
<jsp:include page="elements/link.jsp"></jsp:include>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-article-add" action="${pageContext.request.contextPath}/tea/teaUpd.action" method="post" enctype="multipart/form-data">
	<input type="hidden" class="input-text" value="${tList.tid}"  id=tid name="tid">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>名字：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${tList.tname}"  id="tname" name="tname">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>分组：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
			
				<select name="tcid" class="select">
				<c:forEach var="tcList" items="${tcList }">
					<c:if test="${tcList.tcid == tList.tcid}">
						<option value="${tcList.tcid }" selected="selected">${tcList.tcclass }</option>
					</c:if>
					<c:if test="${tcList.tcid != tList.tcid}">
						<option value="${tcList.tcid }">${tcList.tcclass }</option>
					</c:if>
				</c:forEach>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">email：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" readonly="readonly" class="input-text" value="${tList.temail}"  id="temail" name="temail">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">qq：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" readonly="readonly" class="input-text" value="${tList.tqq}" id="tqq" name="tqq">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" readonly="readonly" class="input-text" value="${tList.tphone}" id="tphone" name="tphone">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<!-- <input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'commentdatemax\')||\'%y-%M-%d\'}' })" id="commentdatemin" name="commentdatemin" class="input-text Wdate">
				 --><input type="text" value="${tList.tdate }" onfocus="WdatePicker({ Date:'%y-%M-%d' })" id="tdate" name="tdate" class="input-text Wdate" style="width:120px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">图片：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<!-- <div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div> -->
  				<input name="newFile" type="file" value="${tList.tpic }" class="opt_input" />
  				<br>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">原图片：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label><c:if test="${tList.tpic==null || tList.tpic==''}">沒有圖片</c:if></label>
				<label>${tList.tpic }</label>
				<input name="tpic" type="hidden" value="${tList.tpic }" class="opt_input" />
			</div>
		</div> 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">简介：</label>
			<div class="formControls col-xs-8 col-sm-9"> 
				<!-- <script id="editor" type="text/plain" style="width:100%;height:400px;"></script> 
				-->
				<textarea name="ttitle"  style="height:auto; font-size:14px; width: 545px;height: 250px">${tList.ttitle }</textarea>
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
	
	//表单验证
	$("#form-article-add").validate({
		rules:{
			tname:{
				required:true,
			},
			tphone:{
				required:true,
			},
			tqq:{
				required:true,
			},
			temail:{
				required:true,
			},
			ttitle:{
				required:true,
			},
			tcid:{
				required:true,
			},
			tdate:{
				required:true,
			},
			tmessage:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,		//当为false时，验证无效时，没有焦点响应  
		success:"valid",
		submitHandler:function(form){	//表单提交句柄,为一回调函数，带一个参数：form 
			//$(form).ajaxSubmit();
			//var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			//parent.layer.close(index);
			//form.submit();
			$(form).ajaxSubmit({
				 type: 'post',
			    url: "${pageContext.request.contextPath}/tea/teaUpd.action",
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