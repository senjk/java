<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%
    String path=request.getContextPath();
    %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<style type="text/css">
    td{
    height: 20px;
    }

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
   <%--  <%=session.getAttribute("name1") %>您好，欢迎您的到来！
    您的密码是：
     <%=session.getAttribute("password1") %><br /> --%>
     ${code1}您好，欢迎您的到来！  您的密码是：${password1}<br />
<!--      <a href="insert.jsp">添加</a> -->
<!--       <a href="update.jsp">更改</a> -->
<!--        <a href="delete.jsp">删除</a>  -->
       
       <a href="#" onclick="odata('1','add')">新增</a>
        <a href="login.jsp">退出</a>
    <%--  <c:forEach var="i" begin="1" end="5">
     	<c:if test="${i==1 }">
     		<c:out value="123"></c:out><br />
     	</c:if>
     	Item:<c:out value="${i }"></c:out><br />
     </c:forEach> --%>
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
						location.href="success.jsp";
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
		}
	</script>
</body>
</html>