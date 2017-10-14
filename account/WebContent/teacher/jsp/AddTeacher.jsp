<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path=request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=path %>/js/jquery-1.12.4.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增页面</title>
</head>
<body>
<center>
  <form>
     <div>
       <label>主键:</label>
       <input type="text" id="ids">
     </div>
    
     <div>
       <label>姓名:</label>
       <input type="text" id="name">
     </div>
      <div>
       <label>学校:</label>
       <input type="text" id="schoolid">
     </div>
      <div>
       <label>课程:</label>
       <input type="text" id="classs">
     </div>
       <input type="button" value="添加" onclick="addSave()">
        
  </form>

  </center>
  <script type="text/javascript">
    function addSave(){
    	var datas={
    			"flag":"1","id":$("#ids").val(),
    			"name":$("#name").val(),
    			"schoolid":$("#schoolid").val(),"classs":$("#classs").val()
    	};
    	 $.ajax({
			  url:'<%=path%>/TeacherServlet',
			  type:'post',
			  dataType:'json',
			  data:datas,
			  success:success_function,
			  error:error_function
		  });
    	 function success_function(datas){
			  if("0"==datas){
				  var flags=3;
					 var idatass = {"flag":flags};
					 $.ajax({
						  url:'<%=path%>/TeacherServlet',
						  type:'post',
						  dataType:'json',
						  data:idatass,
						  success:success_functionn,
						  error:error_functionn
					  });
					 
					function success_functionn(odatas){
						if("0" == odatas){
							 location.href="<%=path%>/Teacher.jsp";
						}
					}
					function error_functionn(){
						alert("新增1错误！");
					} 
				  alert("新增成功");
				  
			  }else{
				  alert("新增失败");
			  }
		  }
    	 function error_function(){
			  alert("新增错误");
		  }
		  return;
    }
  
  </script>
</body>
</html>