<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chat Room</title>
<link rel="stylesheet" href="../css/chat.css">
</head>
<body>
	<div class="chat-container">
		<div class="chat-header">
			<h2>Random Chat</h2>
			<button class="skip-btn">Skip</button>
		</div>
		<div class="chat-box" id="chatBox">
		</div>
		<div class="chat-input">
			<input type="text" id="messageInput" placeholder="Type a message...">
			<button onclick="sendMessage()">Send</button>
		</div>
	</div>
	<script src="../js/chat.js"></script>
</body>
</html>