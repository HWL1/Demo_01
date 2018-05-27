<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
 <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<script type="text/javascript">

$(document).ready(function () {
	
	$("#button").click(del_systemuser);
	
});


function action(){
	
	alert("11");
	var max=1000;
	for(var i=1;i<=xam;i++){
	     $.ajax({
		 type: "POST",
		url:"Demo/Rob_red.red?user_id="+i,
				
		success:function (result){}
	});
	}
	
}

</script>

</head>
<body>
<input  type="button" id="button">Hello World!</h2>
</body>
</html>
