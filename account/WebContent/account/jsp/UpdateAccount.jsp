<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path=request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=path %>/js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改页面</title>
</head>
<body>
<center>
  <form>
     <div>
       <label>账户:</label>
       <input type="text" id="code" value=${account.code} />
     </div>
     <div>
       <label>密码:</label>
       <input type="text" id="password" value=${account.password}  />
     </div>
     <div>
       <label>姓名:</label>
       <input type="text" id="name" value=${account.name} />
     </div>
      <div>
       <label>性别:</label>
       <input type="text" id="sex" value=${account.sex} />
     </div>
      <div>
       <label>年龄:</label>
       <input type="text" id="age" value=${account.age}>
     </div>
       <input type="button" value="修改" onclick="UpdateSave(${account.id})">
        
  </form>
  </center>
  <script type="text/javascript">
  var id;
    function UpdateSave(id){
    	var datas={
    			"flag":"3","id":id,
    			"code":$("#code").val(),"password":$("#password").val(),"name":$("#name").val(),
    			"sex":$("#sex").val(),"age":$("#age").val()
    	};
    	 $.ajax({
			  url:'<%=path%>/AccountServlet',
			  type:'post',
			  dataType:'json',
			  data:datas,
			  success:success_function,
			  error:error_function
		  });
    	 function success_function(datas){
			  if("0"==datas){
				  location.href="<%=path%>/Success.jsp";
				  alert("修改成功");
				  
			  }else{
				  alert("修改失败");
			  }
		  }
    	 function error_function(){
			  alert("修改错误");
		  }
		  return;
    }
  
  </script>
</body>
</html>