<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Searching...</title>
<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="container">
		<h1>Finding Stranger...</h1>
		<p>Please wait while we connect you</p>
		<div class="loader"></div>
	</div>
<script>
	setTimeout(function(){
		window.location.href = "chat.jsp";
	}, 3000);
</script>
</body>
</html>