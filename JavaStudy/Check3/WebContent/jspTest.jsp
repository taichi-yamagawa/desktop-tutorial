<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- CSSファイルの読み込み -->
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<!-- ヘッダーの記述（header.jspファイルの読み込み） -->
	<%@ include file="header.jsp"%>

	<!-- 入力フォーム -->
	<div class="inputForm">
		<table>
			<tr>
				<td>name</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="text" /></td>
			</tr>
		</table>
	</div>

	<!-- フッターの記述（footer.jspファイルの読み込み） -->
	<%@ include file="footer.jsp"%>
</body>
</html>