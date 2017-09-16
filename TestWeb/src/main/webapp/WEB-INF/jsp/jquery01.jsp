<%--
  Created by IntelliJ IDEA.
  User: wise
  Date: 2017/9/15
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="<%= request.getContextPath()%>/res/jquery/jquery-1.6.4.min.js"></script>
    <title>jquery测试</title>
</head>
<body>

<button id="btn" onclick="hid()">按钮</button>
<p id="pp">hello Jquery</p>
<script>


   /* $(document).ready(function () {

    })*/

    $(function () {
        console.log("页面加载完毕")
        
    });



    /*等页面加载完加载script*/
    function hid()  {
        console.log('hid');
    };

    var f1 ={
        name: 'wise',
        age: 18,
        eat: function () {
            console.log("好的");
        }
    };

    console.log(f1.name);
    f1.eat();

</script>



</body>
</html>
