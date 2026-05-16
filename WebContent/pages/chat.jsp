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
			<p class="user-id">
				You are:
				<%=
					session.getAttribute("userId")
				%>
			</p>
			<p class="user-id">
				Stranger:
				<%=
					session.getAttribute("strangerId")
				%>
			</p>
			<button class="skip-btn" onclick="skipChat()">Skip</button>
		</div>
		<div class="chat-box" id="chatBox">
		</div>
		<div class="chat-input">
			<input type="text" id="messageInput" placeholder="Type a message...">
			<button onclick="sendMessage()">Send</button>
		</div>
	</div>
	<script>
		const currentUserId = 
			"<%= session.getAttribute("userId") %>";
	</script>
	<script src="../js/chat.js"></script>
</body>
</html>