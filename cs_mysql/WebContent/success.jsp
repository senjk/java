<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
   <%--  <%=session.getAttribute("name1") %>您好，欢迎您的到来！
    您的密码是：
     <%=session.getAttribute("password1") %><br /> --%>
     ${code1}您好，欢迎您的到来！  您的密码是：${password1}<br />
    <%--  <c:forEach var="i" begin="1" end="5">
     	<c:if test="${i==1 }">
     		<c:out value="123"></c:out><br />
     	</c:if>
     	Item:<c:out value="${i }"></c:out><br />
     </c:forEach> --%>
     <table border="1" width="1200" height="200">
     <tr>
        <td>账户</td>
        <td>名称</td>
        <td>性别</td>
        <td>年龄</td>
     </tr>
     <c:forEach var="is" items="${list}">
     	<tr>
     		<td>${is.code}</td>
     		<td>${is.name}</td>
     		<td>${is.sex}</td>
     		<td>${is.age}</td>
     		<td>${is.password}</td>
     	</tr>
     </c:forEach>
     </table>
     
    </center>
</body>
</html>