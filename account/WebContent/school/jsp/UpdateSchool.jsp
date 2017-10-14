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
       <label>学校名称:</label>
       <input type="text" id="name" value=${school.name} />
     </div>
      
      <div>
       <label>级别:</label>
       <input type="text" id="jibie" value=${school.jibie}>
     </div>
       <input type="button" value="修改" onclick="UpdateSave(${school.id})">
        
  </form>
  </center>
  <script type="text/javascript">
  var id;
    function UpdateSave(id){
    	var datas={
    			"flag":"0","id":id,
    			"name":$("#name").val(),"jibie":$("#jibie").val()
    	};
    	 $.ajax({
			  url:'<%=path%>/SchoolServlet',
			  type:'post',
			  dataType:'json',
			  data:datas,
			  success:success_function,
			  error:error_function
		  });
    	 function success_function(datas){
			  if("0"==datas){
				  var flags=4;
					 var idatass = {"flag":flags};
					 $.ajax({
						  url:'<%=path%>/SchoolServlet',
						  type:'post',
						  dataType:'json',
						  data:idatass,
						  success:success_functionn,
						  error:error_functionn
					  });
					 
					function success_functionn(odatas){
						if("0" == odatas){
							 location.href="<%=path%>/School.jsp";
						}
					}
					function error_functionn(){
						alert("修改1错误！");
					} 
				 
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