# 💬 RandomChatApp

A real-time anonymous chat application built using **Java Servlets, JSP, HTML, CSS, and JavaScript**. Users are anonymously matched with another online user and can exchange messages in real time through a simple and responsive chat interface.

> **Current Status:** Prototype with real matchmaking and synchronized backend messaging.

---

# 📌 Features

* ✅ Anonymous user matchmaking
* ✅ Automatic waiting queue
* ✅ Session-based user management
* ✅ Real-time synchronized messaging (AJAX Polling)
* ✅ Responsive chat interface
* ✅ Automatic room generation
* ✅ Multi-user support across browsers
* ✅ Git version controlled

---

# 🛠 Tech Stack

### Backend

* Java
* Java Servlets
* JSP (Java Server Pages)

### Frontend

* HTML5
* CSS3
* JavaScript
* Fetch API (AJAX)

### Server

* Apache Tomcat 9

### Version Control

* Git
* GitHub

---

# 📂 Project Structure

```
RandomChatApp/
│
├── src/
│   ├── controller/
│   │   ├── StartChatServlet.java
│   │   ├── CheckMatchServlet.java
│   │   ├── SendMessageServlet.java
│   │   └── GetMessagesServlet.java
│   │
│   └── service/
│       ├── MatchMakingService.java
│       └── MessageService.java
│
├── WebContent/
│   ├── pages/
│   │   ├── index.jsp
│   │   ├── waiting.jsp
│   │   └── chat.jsp
│   │
│   ├── css/
│   │   ├── styles.css
│   │   └── chat.css
│   │
│   └── js/
│       └── chat.js
│
└── README.md
```

---

# 🏗 Architecture

```
Browser

   │

   ▼

JSP + JavaScript

   │

   ▼

Servlet Controllers

   │

   ▼

Service Layer

   │

   ▼

In-Memory Data Structures
(HashMap)
```

---

# 🚀 Application Flow

```
Home Page

      │

      ▼

Start Chat

      │

      ▼

StartChatServlet

      │

      ▼

MatchMakingService

      │

      ▼

Matched ?

 ┌──────────────┐
 │              │
 │ No           │ Yes
 │              │
 ▼              ▼

Waiting      Chat Room

                 │

                 ▼

      SendMessageServlet

                 │

                 ▼

        MessageService

                 │

                 ▼

      GetMessagesServlet

                 │

                 ▼

         Updated Chat UI
```

---

# 🧠 Core Modules

## 1. MatchMakingService

Responsible for:

* Managing waiting users
* Matching two anonymous users
* Maintaining user sessions

---

## 2. MessageService

Responsible for:

* Creating chat rooms
* Storing messages
* Retrieving conversation history

---

## 3. Controller Layer

Handles all HTTP requests.

Current servlets:

* StartChatServlet
* CheckMatchServlet
* SendMessageServlet
* GetMessagesServlet

---

## 4. Frontend

Provides:

* Landing page
* Waiting animation
* Chat interface
* Message rendering
* AJAX communication

---

# ⚙️ How It Works

1. User opens the application.
2. A unique session is created.
3. User enters the matchmaking queue.
4. When another user joins, both users are matched.
5. A unique chat room is generated.
6. Messages are stored on the server.
7. Clients poll the server periodically to receive new messages.

---

# 📷 Current Features

* Anonymous chatting
* Session-based matchmaking
* Real-time message synchronization
* Responsive UI
* AJAX communication
* Browser-to-browser messaging

---

# 🚧 Current Limitations

The project is currently an educational prototype.

Current limitations include:

* Messages stored only in memory
* No database integration
* No user authentication
* Uses AJAX polling instead of WebSockets
* Skip/disconnect lifecycle not yet implemented

---

# 🎯 Future Improvements

* MySQL database integration
* User authentication
* WebSocket support
* Skip & reconnect functionality
* Online/offline status
* Chat history persistence
* Deployment to cloud
* Mobile-friendly improvements

---

# ▶️ Running the Project

### Prerequisites

* Java 8+
* Eclipse IDE
* Apache Tomcat 9
* Git

### Steps

1. Clone the repository

```
git clone https://github.com/<your-username>/RandomChatApp.git
```

2. Import as **Dynamic Web Project** into Eclipse.

3. Configure Apache Tomcat.

4. Run the project.

5. Open:

```
http://localhost:8080/RandomChatApp
```

6. Open another browser or incognito window to simulate a second user.

---

# 📚 Concepts Demonstrated

* Java Servlets
* JSP
* HTTP Request/Response
* Session Management
* AJAX Polling
* Layered Architecture
* Separation of Concerns
* Client–Server Communication
* Real-time Messaging
* Version Control using Git

---

# 👨‍💻 Author

**Bhuvaneshwar Pratap**

Built as a learning project to understand real-time communication, Java web development, and software architecture using Servlets and JSP.
