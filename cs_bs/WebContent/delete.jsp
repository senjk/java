<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>删除数据</title>
</head>
<body>
<center>
  <form>
     <div>
       <label>Id:</label>
       <input type="text" id="ids">
        <input type="button" value="查询" onclick="ajax1()">
     </div>
       <input type="button" value="删除" onclick="ajax()">
        
  </form>
  <div id="message" style="color:red;"></div>
  <div id="table">
     <table  border="1" width="1200" height="100">
     <tr>
        <td>账户</td>
        <td>名称</td>
        <td>性别</td>
        <td>年龄</td>
     </tr>
     <c:forEach var="account" items="${list1}">
     	<tr>
     		<td>${account.code}</td>
     		<td>${account.name}</td>
     		<td>${account.sex}</td>
     		<td>${account.age}</td>
     	</tr>
     </c:forEach>
     </table> 
     </div>
  </center>
  <script type="text/javascript">
      //window.location.reload();
     
  	 function ajax(){
  		 var datas={"id":$('#ids').val()};
  		 $.ajax({
  			 url:'DeleteServlet',
  			 type:'post',
  			 dataType:'json',
  			 data:datas,
  			 success:success_function,
  			 error:error_function
  		 })
  	 }
  	
  	 function ajax1(){
  		var datas={"id":$('#ids').val()};
  		$.ajax({
  			 url:'SelectServlet',
  			 type:'post',
  			 dataType:'json',
  			 data:datas,
  			 success:success_function1,
  			 error:error_function
  		})
  	 }
 	function success_function1(ajaxData){
 		
  		if("0"==ajaxData){
  			location.reload();
  		 $('#table').css("display","block");
  		}
  	}
  	function success_function(ajaxData){
  		if("0"==ajaxData){
  			alert("删除成功");
  			location.href="login.jsp";
  		}else{
  			$('#message').html("删除失败！");
  		}
  	}
  	function error_function(){
  		alert("ajax错误！");
  	}
  	</script>
</body>
</html>