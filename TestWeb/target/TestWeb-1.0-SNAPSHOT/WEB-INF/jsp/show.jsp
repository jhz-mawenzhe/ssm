<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" align="center"  width="800"> 
		<tr>
			<th>序号</th>   <!--th加粗,居中  -->
			<th>姓名</th>
			<th>年龄</th>
			<th>生日</th>
			<th>地址</th>
			<th>操作</th>
		</tr>
	

		<c:forEach items="${userList }" var="user" varStatus="vs">
			<tr>
				<td>${vs.count}</td>


				<td>${user.birthday }</td>
				<td>${user.address }</td>

				<td><a href="${pageContext.request.contextPath}/user/preUpdate?id=${user.id}">修改</a>
				
				<!-- 获取前台数据分格,在后缀名前面加上EL参数,多个用/分开,提交到后台时,提交的数据就会将数值可以在后台使用了 -->
					<%--<a href="${pageContext.request.contextPath}/user/preUpdate1/${user.id}.do">修改</a>
					<a href="${pageContext.request.contextPath}/user/preUpdate2/${user.id}/${user.name }.do">修改</a>--%>
			</td>
			</tr>
		</c:forEach>	
		
	 </table>

</body>
</html>













