<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String[] strs=new String[5] ;
	
	strs[0]="0";
	strs[1]="1";
	strs[2]="2";
	strs[3]="3";
	strs[4]="4";
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=0;i<strs.length;i++){
	out.println("第"+strs[i]+"条数据");
}

%>
</body>
</html>