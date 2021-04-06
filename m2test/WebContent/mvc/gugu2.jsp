<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- V view-->
<title>Insert title here</title>
</head>
<body>
	<h1>View</h1>
<%

	//Object list = request.getAttribute("list");
	ArrayList<String> list = (ArrayList<String>)(request.getAttribute("list")); // 형변환
	for(String s : list){
%>
		<div><%=s%></div>
<%
	}
%>
</body>
</html>