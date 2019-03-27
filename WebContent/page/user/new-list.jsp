<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
<jsp:include page="elements/link.jsp"></jsp:include>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 新聞管理 <span class="c-gray en">&gt;</span> 新聞列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 
		<form id="form"  method="post">
			<span class="select-box inline">
				<select id="select" class="select">
					<option value="0">全部分类</option>
					<c:forEach var="ncList" items="${ncList }">
						<c:if test="${ncList.ncid==ncid }"><option value="${ncList.ncid }" selected="selected">${ncList.ncclass }</option></c:if>
						<c:if test="${ncList.ncid!=ncid }"><option value="${ncList.ncid }">${ncList.ncclass }</option></c:if>
					</c:forEach>	
				</select>
			</span>
	
		搜索：
			<input type="text" onfocus="WdatePicker({ Date:'%y-%M-%d' })" id="log" class="input-text Wdate" style="width:120px;">
			 <button name="seach" id="seach" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
		</form>
	</div>
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
		<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
			<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
		</a> <a class="btn btn-primary radius" onclick="add('添加内容','${pageContext.request.contextPath}/new/newsPreAdd.action')" href="javascript:;">
			<i class="Hui-iconfont">&#xe600;</i> 添加内容
		</a></span> 
		<span class="r"><!-- 共有数据：<strong>54</strong> 条 -->
		</span> 
	</div>
	<div class="mt-20">
		<table  class="table table-border table-bordered table-bg table-hover table-sort" >
			<thead>
				<tr class="text-c" style="font-size: 30px">
					<th width="40"><input  type="checkbox" ></th>
					<th width="80">ID</th>
					<th width="100">新聞分类</th>
					<th width="100">标题</th>
					<th width="100">封面</th>
					<th width="150">更新时间</th>
					<th width="100">来源</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<c:forEach var="nList" items="${nList}">
				<tr id="tr" class="text-c" style="font-size: 70px">
					<td><input type="checkbox" value="${nList.nid }" name="tag"></td>
					<td class="text-c" name="nid">${nList.nid }</td>
					<td class="text-c">${nList.ncclass }</td>
					<td class="text-c">${nList.nname }</td>
					<td>
						<c:if test="${nList.npic!=null && nList.npic!=''}"><img width="80" height="50" class="picture-thumb" src="${nList.npic }"></c:if>
						<c:if test="${nList.npic==null || nList.npic==''}"><img width="80" height="50" class="picture-thumb" src="/static/upload/new/NoImage.jpg"></c:if>
					</td>
					<td>${nList.ndate }</td>
					<td class="text-c">${nList.username }</td>
					<td class="td-manage">
						<!-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架">
							<i class="Hui-iconfont">&#xe6de;</i>
						</a> --> 
						<a style="text-decoration:none" class="ml-5" onClick="edit('编辑','${pageContext.request.contextPath}/new/newsPreUpd.action?nid=${nList.nid }')" href="javascript:;" title="编辑">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<!-- onClick="edu_del(this,${eList.eid })" -->
						<a style="text-decoration:none" class="ml-5"  href="${pageContext.request.contextPath}/new/newsDel.action?nid=${nList.nid }" title="删除">
							<i class="Hui-iconfont">&#xe6e2;</i>
						</a>
					</td>
				</tr>
			</c:forEach>	
		</table>
	</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript">
   
$('.table-sort').dataTable({
	/* "stripeClasses": [
			"even" : red
		], */
	/* "bScrollCollapse" : true, */
	"aaSorting": [[ 1, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	 "aoColumnDefs": [
	 // {"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	 {"orderable":false,"aTargets":[0,7]}// 制定列不参与排序
	], 
	/* "paging": true, */
    "lengthMenu": [10]
});

/*添加*/
function add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url,
		cancel: function(index, layero){ 
			  if(confirm('确定要关闭么')){ //只有当点击confirm框的确定时，该层才会关闭
			    layer.close(index)
			  }
			  return false; 
			} ,
		end: function () {
	        location.reload();
	      }
	});
	layer.full(index);
} 


/*编辑*/
function edit(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url,
		cancel: function(index, layero){ 
			  if(confirm('确定要关闭么')){ //只有当点击confirm框的确定时，该层才会关闭
			    layer.close(index)
			  }
			  return false; 
			} ,
		end: function () {
	        location.reload();
	      }
	});
	layer.full(index);
} 
/* 批量删除 */
function datadel(){
    var checkedbox = $("input[name='tag']:checked");
    if(checkedbox.length == 0){
        alert("请选择要删除的标签");
    }else{
        if(confirm("确定要删除吗？")){
            var res = checkedbox.map(function(){
                return this.value;
            });
            //window.location.href="${pageContext.request.contextPath}/deleteTags/ids="+res.toArray().join(",")+".action";
            $.post(
					
                    "${pageContext.request.contextPath}/new/newsAllDel.action?ids="+res.toArray().join(","),
                    function(data){
                        
	 /* $("input[name='tag']:checked").each(function(i,e){
		                                $(this).remove();
		                            }); */
                       // location.reload();
						location.replace(location.href);
                    }
                );
            
        }
    }
}
//下拉框查询
$("#select").change(function(){
	var url="${pageContext.request.contextPath}/new/findNewsAndClassByClass.action?ncid="+$("#select").val();
	$("#form").attr('action',url);
	$("#form").submit();
});
// 搜索框查询
$("#seach").click(function(){
	var url="${pageContext.request.contextPath}/new/findNewsAndClassByDate.action?ndate="+$("#log").val();
	$("#form").attr('action',url);
	$("#form").submit();
});
</script>
</body>
</html>