<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새 글 작성</title>
</head>
<body>
	<form:form commandName="post" action="/post" method="POST">
		<p>
			<label>제목</label>
			<form:input path="title" type="text" maxlength="20" size="50" />
			<form:errors path="title" cssClass="smdis-error-message" />
		</p>
		<p>
			<form:textarea path="content" cols="50" rows="10"></form:textarea>
		</p>
		<input type="submit" value="저장" />
	</form:form>
</body>
</html>