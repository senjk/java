<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
    td{
    height: 20px;
    }
</style>
<title>主页面</title>
</head>
<body>
<center>
 	${code1}您好，欢迎您的到来！  您的密码是：${password1}<br />
 	<a href="#" onclick="odata('1','add')">新增</a>
 	<a href="#" onclick="odata('3','teacher')">教师</a>
 	<a href="#" onclick="odata('4','school')">学校</a>
 	<a href="#" onclick="odata('5','student')">学生</a>
        <a href="Login.jsp">退出</a>
         <table border="1" width="1000">
     <tr>
        <td>id</td>
        <td>账户</td>
        <td>名称</td>
        <td>性别</td>
        <td>年龄</td>
        <td>操作</td>
     </tr>
     <c:forEach var="account" items="${list}">
     	<tr>
     	   <td>${account.id}</td>
     		<td>${account.code}</td>
     		<td>${account.name}</td>
     		<td>${account.sex}</td>
     		<td>${account.age}</td>
     		<td>
     		<a href="#" onclick="odata('2',${account.id});">删除</a>
			<a href="#" onclick="odata('0', ${account.id});">修改</a>
     		</td>
     	</tr>
     </c:forEach>
     </table>
    </center>
     <script type="text/javascript">
		var flag;
		var id;
		function odata(flag, id){
			if("1" == flag){
				location.href="account/jsp/AddAccount.jsp";
				return;
			}
			if("2"== flag){
				var idatas = {"flag":flag, "id":id};
				 $.ajax({
					  url:'AccountServlet',
					  type:'post',
					  dataType:'json',
					  data:idatas,
					  success:success_function,
					  error:error_function
				  });
				function success_function(odatas){
					if("0" == odatas){
						location.href="Success.jsp";
						alert("删除成功！");
					}else{
						alert("删除失败！");
					}
				}
				function error_function(){
					alert("删除错误！");
				}
				return;
			}
			if("0" == flag){
				var idatas = {"flag":flag, "id":id};
				$.ajax({
					url:'AccountServlet',
					type:'post',
					dataType:'json',
					data:idatas,
					success:success_function,
					error:error_function
				});
				function success_function(odatas){
					if("0" == odatas){
						location.href="account/jsp/UpdateAccount.jsp";
					}else{
						
					}
				}
				function error_function(){
					alert("修改错误！");
				}
				return;
			}
			
			
			if("3" == flag){
				var idatas = {"flag":flag};
				$.ajax({
					url:'TeacherServlet',
					type:'post',
					dataType:'json',
					data:idatas,
					success:success_function,
					error:error_function
				});
				function success_function(odatas){
					if("0" == odatas){
						location.href="Teacher.jsp";
					}else{
						
					}
				}
				function error_function(){
					alert("错误！");
				}
				return;
			}
			
			if("4" == flag){
				var idatas = {"flag":flag};
				$.ajax({
					url:'SchoolServlet',
					type:'post',
					dataType:'json',
					data:idatas,
					success:success_function,
					error:error_function
				});
				function success_function(odatas){
					if("0" == odatas){
						location.href="School.jsp";
					}else{
						
					}
				}
				function error_function(){
					alert("错误！");
				}
				return;
			}
			
			
			if("5" == flag){
				var flag=0;
				var idatas = {"flag":flag};
				$.ajax({
					url:'StudentServlet',
					type:'post',
					dataType:'json',
					data:idatas,
					success:success_function,
					error:error_function
				});
				function success_function(odatas){
					if("0" == odatas){
						location.href="Student.jsp";
					}else{
						
					}
				}
				function error_function(){
					alert("错误！");
				}
				return;
			}
		}
	</script>
</body>
</html>