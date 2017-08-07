<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String baidu = session.getAttribute("baidu").toString();
    String burl = session.getAttribute("burl").toString();
    String bili=session.getAttribute("bili").toString();
    String biurl=session.getAttribute("biurl").toString();

    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="<%=burl%>">
<%=baidu %>
</a>
<br />
<a href="<%=biurl%>">
<%=bili %>
</a>

</body>
</html>