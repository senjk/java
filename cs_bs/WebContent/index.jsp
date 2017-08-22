<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("baidu", "百度");
     session.setAttribute("burl", "https://www.baidu.com");
     session.setAttribute("bili", "哔哩哔哩");
     session.setAttribute("biurl", "https://www.bilibili.com/");
     session.setAttribute("num", "6");
 %> 
<a href="NewFile.jsp">
<%= "跳转页面" %>
</a>
<br />
<% 
for(int i=0;i<5;++i){
  out.println("zhb是第"+i+"次来");
}
%>

</body>
</html>