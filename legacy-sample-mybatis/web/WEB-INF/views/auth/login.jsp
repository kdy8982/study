<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
	<form:form action="/auth/login" method="POST">
		<p>
			<label>이메일</label>
			<input name="email" id="email" />
		</p>
		<p>
			<label>비밀번호</label>
			<input type="password" name="password" id="email"/>
		</p>
		<input type="submit" value="로그인" />
		
		<c:if test="${msg == 'failure'}">
			<div style="color:red">
				아이디 또는 비밀번호가 일치하지 않습니다.
			</div>
		</c:if>
		
		<c:if test="${msg == 'logout'}">
			<div style="color:red">
				로그아웃 되었습니다.
			</div>
		</c:if>
	</form:form>
</body>
</html>