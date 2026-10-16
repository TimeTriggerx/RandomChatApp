# RandomChatApp

RandomChatApp is a web-based anonymous chat application developed using Java Servlets, JSP, HTML, CSS, and JavaScript. The application allows two users to communicate anonymously by matching them through a server-side matchmaking mechanism and providing real-time synchronized messaging.

The project is designed to demonstrate client-server communication, session management, layered architecture, and asynchronous web programming using Java EE technologies.

---

## Features

- Anonymous one-to-one chat
- Automatic user matchmaking
- Session-based user identification
- Real-time message synchronization using AJAX polling
- Responsive chat interface
- Dynamic room generation for each conversation
- Multi-browser support for concurrent users

---

## Technology Stack

### Backend
- Java
- Java Servlets
- JSP (JavaServer Pages)

### Frontend
- HTML5
- CSS3
- JavaScript
- Fetch API (AJAX)

### Server
- Apache Tomcat 9

### Version Control
- Git
- GitHub

---

## Project Structure

```
RandomChatApp
│
├── src
│   ├── controller
│   │   ├── StartChatServlet.java
│   │   ├── CheckMatchServlet.java
│   │   ├── SendMessageServlet.java
│   │   └── GetMessagesServlet.java
│   │
│   └── service
│       ├── MatchMakingService.java
│       └── MessageService.java
│
├── WebContent
│   ├── pages
│   │   ├── index.jsp
│   │   ├── waiting.jsp
│   │   └── chat.jsp
│   │
│   ├── css
│   └── js
│
└── README.md
```

---

## System Architecture

```
Client (Browser)
        │
        ▼
 JSP / JavaScript
        │
        ▼
 Servlet Controllers
        │
        ▼
 Business Services
        │
        ▼
 In-Memory Storage
```

---

## Request Flow

1. A user opens the application.
2. A new HTTP session is created.
3. The user requests to start a chat.
4. The matchmaking service places the user into a waiting queue.
5. When another user joins, both users are paired.
6. A unique room identifier is generated.
7. Messages are exchanged through the server.
8. Clients periodically request updated messages using AJAX polling.

---

## Core Components

### MatchMakingService

Responsible for:

- Managing waiting users
- Pairing anonymous users
- Maintaining active chat sessions

### MessageService

Responsible for:

- Creating unique chat rooms
- Storing messages
- Retrieving conversation history

### Controller Layer

The controller layer consists of the following servlets:

- StartChatServlet
- CheckMatchServlet
- SendMessageServlet
- GetMessagesServlet

These servlets handle HTTP requests and coordinate communication between the presentation layer and the service layer.

---

## Design Principles

The project follows a layered architecture consisting of:

- Presentation Layer (JSP, HTML, CSS, JavaScript)
- Controller Layer (Servlets)
- Service Layer (Business Logic)

This separation improves maintainability, readability, and extensibility.

---

## Current Limitations

The current implementation is intended as a prototype.

Limitations include:

- Data is stored in memory using Java collections.
- Messages are not persisted after server restart.
- AJAX polling is used instead of WebSockets.
- User authentication is not implemented.
- Database integration is pending.
- Skip/disconnect functionality is under development.

---

## Future Enhancements

Planned improvements include:

- MySQL database integration
- User authentication
- WebSocket-based real-time communication
- Skip and reconnect functionality
- Chat history persistence
- Online/offline presence detection
- Cloud deployment

---

## Installation

### Prerequisites

- Java 8 or later
- Eclipse IDE
- Apache Tomcat 9

### Steps

Clone the repository:

```bash
git clone https://github.com/TimeTriggerx/RandomChatApp.git
```

Import the project as a Dynamic Web Project.

Configure Apache Tomcat.

Run the application.

Open:

```
http://localhost:8080/RandomChatApp
```

To simulate multiple users, open another browser or an incognito window.

---

## Concepts Demonstrated

- Java Servlets
- JSP
- Session Management
- Client-Server Architecture
- AJAX Communication
- HTTP Request/Response Lifecycle
- Layered Software Architecture
- Separation of Concerns
- Real-Time Web Communication
- Version Control using Git

---

## Author

**Bhuvaneshwar Pratap**

This project was developed as part of learning Java Web Development and real-time client-server application design using Servlets and JSP.
