<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--JSP 주석입니다.
레레렐ㄹㄹㄹ --%>
<!-- html 주석입니다. -->
<%
//자바주석입니다.
/* 이거거걱
*/
	for(int i = 1; i<=5;i++){

%>
<h<%=i %>>아름다운 한글</h<%=i%>>
<%
	}
%>
</body>
</html>