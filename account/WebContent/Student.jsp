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
<title>学生主页面</title>
</head>
<body>
<center>
		<a href="#" onclick="odata('1','add')">新增</a>
 	
        <a href="Login.jsp">退出</a>
         <table border="1" width="1000">
     <tr>
        <td>id</td>
        <td>名称</td>
        <td>教师</td>
        <td>学校</td>
        <td>操作</td>
     </tr>
     <c:forEach var="student" items="${list}">
     	<tr>
     	   <td>${student.id}</td>
     		<td>${student.name}</td>
     		<td>${student.teacher}</td>
     		<td>${student.schoolid}</td>
     		<td>
     		<a href="#" onclick="odata('2',${student.id});">删除</a>
			<a href="#" onclick="odata('0', ${student.id});">修改</a>
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
				location.href="student/jsp/AddStudent.jsp";
				return;
			}
			if("2"== flag){
				var idatas = {"flag":flag, "id":id};
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
						 var flags=0;
						 var idatass = {"flag":flags};
						 $.ajax({
							  url:'StudentServlet',
							  type:'post',
							  dataType:'json',
							  data:idatass,
							  success:success_functionn,
							  error:error_functionn
						  });
						 
						function success_functionn(odatas){
							if("0" == odatas){
								location.href="Student.jsp";
							}
						}
						function error_functionn(){
							alert("删除1错误！");
						} 
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
					url:'StudentServlet',
					type:'post',
					dataType:'json',
					data:idatas,
					success:success_function,
					error:error_function
				});
				function success_function(odatas){
					if("0" == odatas){
						location.href="student/jsp/UpdateStudent.jsp";
					}else{
						
					}
				}
				function error_function(){
					alert("修改错误！");
				}
				return;
			}
		}
	</script>
</body>
</html>