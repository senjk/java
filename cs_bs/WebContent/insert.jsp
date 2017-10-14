<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>插入数据</title>
</head>
<body>
<center>
  <form>
     <div>
       <label>Id:</label>
       <input type="text" id="ids">
     </div>
     
     <div>
       <label>Code:</label>
       <input type="text" id="code">
     </div>
     <div>
       <label>Password:</label>
       <input type="text" id="password">
     </div>
     <div>
       <label>Name:</label>
       <input type="text" id="name">
     </div>
      <div>
       <label>Sex:</label>
       <input type="text" id="sex">
     </div>
      <div>
       <label>Age:</label>
       <input type="text" id="age">
     </div>
       <input type="button" value="添加" onclick="ajax()">
        
  </form>
  <div id="message" style="color:red;"></div>
  </center>
  <script type="text/javascript">
  	 function ajax(){
  		 var datas={"id":$('#ids').val(),"code":$('#code').val(),"password":$('#password').val(),"name":$('#name').val(),"sex":$('#sex').val(),"age":$('#age').val()};
  		 $.ajax({
  			 url:'InsertServlet',
  			 type:'post',
  			 dataType:'json',
  			 data:datas,
  			 success:success_function,
  			 error:error_function
  		 })
  	 }
  	
  	function success_function(ajaxData){
  		if("0"==ajaxData){
  			alert("添加成功");
  			location.href="login.jsp";
  		}else{
  			$('#message').html("添加失败！");
  		}
  	}
  	function error_function(){
  		alert("ajax错误！");
  	}
  	</script>
</body>
</html>