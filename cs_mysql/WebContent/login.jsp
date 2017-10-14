<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<center>
  <form>
     <div>
       <label>用户名称:</label>
       <input type="text" id="code">
     </div>
     
     <div>
       <label>用户密码:</label>
       <input type="password" id="password1">
     </div>
     
       <input type="button" value="登录" onclick="ajax()">
  </form>
  <div id="message" style="color:red;"></div>
  </center>
  	<script type="text/javascript">
  	 function ajax(){
  		 var datas={"code":$('#code').val(),"password1":$('#password1').val()};
  		 $.ajax({
  			 url:'LogginServlet',
  			 type:'post',
  			 dataType:'json',
  			 data:datas,
  			 success:success_function,
  			 error:error_function
  		 })
  	 }
  	function success_function(ajaxData){
  		if("0"==ajaxData){
  			location.href="success.jsp";
  		}else{
  			$('#message').html("用户名或密码错误！");
  		}
  	}
  	function error_function(){
  		alert("ajax错误！");
  	}
  	</script>
</body>
</html>