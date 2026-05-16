function sendMessage(){
	let input = document.querySelector("#messageInput");
	let chatBox = document.querySelector("#chatBox");
	let message = input.value.trim();
	if(message === "") {
		return;
	}
	input.value = "";
	chatBox.scrollTop = chatBox.scrollHeight;
	fetch("../send-message", {
		method: "POST",
		headers: {
			"Content-Type": "application/x-www-form-urlencoded"
		},
		body: "message=" + encodeURIComponent(message)
	});
}

document.getElementById("messageInput")
.addEventListener(
    "keypress",
    function(event){
        if(event.key === "Enter"){
            sendMessage();
        }
    }
);

function skipChat(){
	window.location.href =
		"waiting.jsp";
}

function loadMessages() {

	fetch("../get-messages")
	.then(response => response.text())
	.then(data => {
		let chatBox =document.querySelector("#chatBox");
		chatBox.innerHTML = "";
		let messages = data.trim().split("\n");

		messages.forEach(function(message){
			if(message.trim() === ""){
				return;
			}
			let div = document.createElement("div");
			div.classList.add("message");
			let parts = message.split(":");
			let senderId = parts[0];
			let actualMessage = parts.slice(1).join(":");
			div.innerText =	actualMessage;
			if(senderId === currentUserId){
				div.classList.add("you");
			} else{
				div.classList.add("stranger");
			}
			chatBox.appendChild(div);
		});
		chatBox.scrollTop = chatBox.scrollHeight;
	});
}
setInterval(loadMessages, 1000);
