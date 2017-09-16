<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 在update.jsp这里回显数据, value对查找出来的数据进行回显,然后修改,
				最后提交,注意:这里提交要将 查到出来带到这里的id也要提交,因为是根据id修改的
				所以我们将传 修改时 隐藏的 id 提交时也要提交-->	
	<form action="${pageContext.request.contextPath}/user/update" method="post">
		<input type="hidden" name="id"  value="${user.id}"> 
		
		name:<input type="text" name="name" value="${user.name}"><br>
		age:<input type="text" name="age"  value="${user.age}"><br>
		birthday:<input type="text" name="birthday"  value="${user.birthday}"><br>
		address:<input type="text" name="address"  value="${user.address}"><br>
		<input type="submit" value="submit">
	</form>
	
</body>
</html>