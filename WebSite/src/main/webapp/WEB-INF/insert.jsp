<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> 값이 들어간건가?? ....~~~</h1>
	
	${requestScope.member.id}
	${requestScope.member.name }
	${requestScope.member.message }
	
	<br>
	<c:forEach items="${requestScope.memberList}" var="member" varStatus="cnt">
		${member.id }
		${member.name }
		${member.message }
	</c:forEach>
	<a href="index.jsp"> 이전 페이지</a>
</body>
</html>