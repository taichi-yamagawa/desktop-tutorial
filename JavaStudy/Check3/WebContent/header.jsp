<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="header">

		<label class="headerName"> login </label> 
		
		<!-- 現在日時の取得 -->
		<label class="date">
			<%
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String formatDate = sdf.format(date);
			out.print(formatDate);
			%>
		</label>

	</div>

</body>
</html>