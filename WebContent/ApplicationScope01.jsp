<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try {
	int value = (int)application.getAttribute("value");
	value = value +2;
	application.setAttribute("value", value);
	%>
	<h1><%=value %></h1>
	<%
	} catch(NullPointerException e) {
		out.print("value의 값이 설정되지 않았습니다.");
	}
%>

</body>
</html>