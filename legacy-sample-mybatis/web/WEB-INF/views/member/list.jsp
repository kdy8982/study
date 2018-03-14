<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample Member List</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<h2>회원목록</h2>
<ul>
<c:forEach items="${list}" var="member">
	<li>이름 : <a href="/member/${member.id}">${member.name}</a> | 이메일 : ${member.email}</li>
</c:forEach>
</ul>
</body>
</html>