<%--
  Created by IntelliJ IDEA.
  User: wise
  Date: 2017/9/11
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json测试</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
    function requestJson(){
        var json = JSON.stringify({"name":"tom","age":"20"});   //请求json数据
        alert(json);
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/requestJson",
            contentType:"application/json;charset=utf-8",
            data:json,

            success: function (data) {
                alert(data.name);
            }
        });
    }

    function requestPojo(){
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/requestPojo.do",
            data:"name=tom&age=20",
            success:function(data){
                alert(data.age);
            }
        });
    }

</script>
</head>
<body>

<input type="button" value="请求json，获得json" onclick="requestJson()">
<input type="button" value="请求pojo，获得json" onclick="requestPojo()">
</body>
</html>

















