<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="ajax方式">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
    
    $(document).ready(function () {
    	
    });
        function login() {
        	
        	var user_id=1;
       for(var i=1;i<=10;i++)
          {	 
           user_id=i;
           // $.ajax({
            //几个参数需要注意一下
              //  ype: "GET",//方法类型
              //  dataType: "json",//预期服务器返回的数据类型
               // url: "http://localhost:8080/demo/Demo/Rob_red.red" ,
               // data: user_id,
               // success:function(),
              //  error : function() {
               // 	if(i==1){
               //     alert("异常！");
                //	}
                //}
            	 $.ajax({
            		 type: "GET",
            		url:"Demo/Rob_red.red?red_id=1&user_id="+i,
            				
            		success:function (result){}
            	
            });
        		
        }
          };
    </script>
</head>
<body>
<div id="form-div">
    
        <p><input type="button" value="登录" onclick="login()">&nbsp;<input type="reset" value="重置"></p>
    
</div>
</body>
</html>