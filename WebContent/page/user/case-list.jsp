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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 创业管理 <span class="c-gray en">&gt;</span> 列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 
		<form id="form"  method="post">
			<span class="select-box inline">
				<select id="select" class="select">
					<option value="0">全部分类</option>
					<c:forEach var="ccList" items="${ccList }">
						<c:if test="${ccList.ccid==ccid }"><option value="${ccList.ccid }" selected="selected">${ccList.ccclass }</option></c:if>
						<c:if test="${ccList.ccid!=ccid }"><option value="${ccList.ccid }">${ccList.ccclass }</option></c:if>
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
		</a> <a class="btn btn-primary radius" onclick="add('添加内容','${pageContext.request.contextPath}/case/casePreAdd.action')" href="javascript:;">
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
					<th width="100">分类</th>
					<th width="100">名称</th>
					<th width="100">队员数目</th>
					<th width="150">更新时间</th>
					<th width="100">指导教师</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<c:forEach var="cList" items="${cList}">
				<tr id="tr" class="text-c" style="font-size: 70px">
					<td><input type="checkbox" value="${cList.cid }" name="tag"></td>
					<td class="text-c" name="cid">${cList.cid }</td>
					<td class="text-c">${cList.ccclass }</td>
					<td class="text-c">${cList.cname }</td>
					<td class="text-c">${cList.members }</td>
					<td>${cList.cdate }</td>
					<td class="text-c">${cList.tname }</td>
					<td class="td-manage">
						<!-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架">
							<i class="Hui-iconfont">&#xe6de;</i>
						</a> --> 
						<a style="text-decoration:none" class="ml-5" onClick="edit('编辑','${pageContext.request.contextPath}/case/casePreUpd.action?cid=${cList.cid }')" href="javascript:;" title="编辑">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<!-- onClick="edu_del(this,${eList.eid })" -->
						<a style="text-decoration:none" class="ml-5"  href="${pageContext.request.contextPath}/case/caseDel.action?cid=${cList.cid }" title="删除">
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
					
                    "${pageContext.request.contextPath}/case/eduAllDel.action?ids="+res.toArray().join(","),
                    function(data){
                       /*  if(data == "ok"){
                            layer.msg('删除成功',{icon:1,time:1000});
                            $("input[name='tag']:checked").each(function(i,e){
                                $(this).remove();
                            });
                            
                        }else{
                            layer.msg('删除失败',{icon:2,time:1000});
                        } */
                        location.replace(location.href);
                    }
                );
            
        }
    }
}
//下拉框查询
$("#select").change(function(){
	var url="${pageContext.request.contextPath}/case/findCaseAndClassByClass.action?ccid="+$("#select").val();
	$("#form").attr('action',url);
	$("#form").submit();
});
// 搜索框查询
$("#seach").click(function(){
	var url="${pageContext.request.contextPath}/case/findCaseAndClassByDate.action?cdate="+$("#log").val();
	$("#form").attr('action',url);
	$("#form").submit();
});
</script>
</body>
</html>