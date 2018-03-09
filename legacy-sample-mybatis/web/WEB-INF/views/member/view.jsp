<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${member.name }의 상세정보</title>
</head>
<body>
이름: ${member.name} | <a href="/member/update">Update</a> | <a href="/member/delete/${member.id}">Delete</a>
</body>
</html>