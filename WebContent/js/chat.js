function sendMessage(){
	let input = document.querySelector("#messageInput");
	let chatBox = document.querySelector("#chatBox");
	let message = input.value.trim();
	if(message === "") {
		return;
	}
	let messageDiv = document.createElement("div");
	messageDiv.classList.add(
		"message", 
		"you"
	);
	messageDiv.innerText = message;
	chatBox.appendChild(messageDiv);
	input.value = "";
	chatBox.scrollTop = chatBox.scrollHeight;
	let typingDiv =
	document.createElement(
		"div"
	);
	typingDiv.classList.add(
		"message",
		"stranger"
	);
	typingDiv.id = "typing";
	typingDiv.innerHTML =
		`Stranger is typing<span id="dots">.</span>`;
	chatBox.appendChild(
		typingDiv
	);
	let dots =
	document.getElementById(
		"dots"
	);
	let count = 1;
	let typingAnimation =
	setInterval(function(){
		count++;
		if(count > 3){
			count = 1;
		}
		dots.innerText =
			".".repeat(count);
	}, 400);
	chatBox.scrollTop =
		chatBox.scrollHeight;
	setTimeout(function(){
		clearInterval(typingAnimation);
		document.getElementById("typing").remove();
		let strangerDiv =
		document.createElement(
			"div"
		);
		strangerDiv.classList.add(
			"message",
			"stranger"
		);
		strangerDiv.innerText =
			getAutoReply();
		chatBox.appendChild(
			strangerDiv
		);
		chatBox.scrollTop =
		chatBox.scrollHeight;
	}, 2000);
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
function getAutoReply(){
	let replies = [
		"Hello!",
		"How are you?",
		"Nice to meet you!",
		"That's interesting.",
		"Tell me more.",
		"Cool!",
		"What are your hobbies?",
		"Where are you from?"
	];
	let randomIndex = Math.floor(
		Math.random() * replies.length
	);
	return replies[randomIndex];
}