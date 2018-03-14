<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div style="background-color: burlywood">
<jsp:include page="/WEB-INF/views/sidebar.jsp"/>
	<span>김대연의 자유게시판 프로젝트</span>
	 <span style="float: right; margin-top: 5px;" > 
		<c:if test="${sessionScope.member.name == null}">
			<a href="<c:url value='/auth/login'/>" style="color: black">로그인</a>
			| <a href="/member/form" style="color: black">회원가입</a>
		</c:if>
		<c:if test="${sessionScope.member.name != null}">
			<a href="/member/${sessionScope.member.id}">${sessionScope.member.name}</a> 님 환영합니다 
			| <a href="<c:url value='/auth/logout'/>" style="color: black">로그아웃</a>
		</c:if>
		</span>	
</div>
</html>