<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- jsp파일만 있으면 가능 -->
	<!-- 코드가 지저분하고 재사용성(수정) 문제가있음 -->
	<h1>jsp방식 구구단</h1>
	<div>안녕하세요</div>
	<%
				//   클래스.메소드 parseInt 정적메소드(유틸리티성 메소드를 작성할때 자주쓰임)
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan+"<--dan");
		for(int i=1; i<10; i++){
	%>
		<div><%=dan%>*<%=i%>=<%=dan*i%></div>
	<%
		}
	%>
</body>
</html>