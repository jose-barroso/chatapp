# 🗨️ ChatApp – Local Web Chatroom using Spring Boot & WebSockets

![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen?logo=spring-boot)
![WebSocket](https://img.shields.io/badge/WebSocket-STOMP-lightgrey?logo=websocket)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)


**ChatApp** is a simple **local network chatroom** application built with **Java 17**, **Spring Boot**, and **WebSockets**. It enables **real-time**, **bidirectional messaging** between clients on the same LAN using **STOMP over WebSocket**.

---

## 🚀 Technologies Used

* ☕ Java JDK 17
* 🌱 Spring Boot 3.5.3
* 🔄 WebSocket (STOMP protocol)
* 🧩 SockJS (WebSocket fallback)
* ✍️ Lombok
* 📦 Maven

---

## ⚙️ Features

* 💬 Real-time messaging over LAN
* 🔁 Bi-directional communication using WebSockets
* 🕒 Timestamped messages
* ⚡ Lightweight Spring-based architecture
* 🎨 Fully functional front-end (HTML, CSS, JS)

---

## 📁 Project Structure

```
chatapp/
├── src/
│   └── main/
│       ├── java/com/jose/chatapp/
│       │   ├── config/WebSocketConfig.java       # WebSocket configuration
│       │   ├── controller/ChatController.java    # Message handler
│       │   └── model/ChatMessage.java            # Message model
│       └── resources/static/
│           ├── index.html                        # Web UI
│           ├── app.js                            # Front-end logic
│           └── main.css                          # Stylesheet
├── pom.xml                                       # Maven dependencies and build
└── README.md                                     # Project documentation
```

---

## ▶️ How to Run

### ✅ Prerequisites

* Java 17+
* Maven

### 🚦 Steps

```bash
git clone https://github.com/your-username/chatapp.git
cd chatapp
mvn spring-boot:run
```

Then open [http://localhost:8080](http://localhost:8080) in your browser.

---

## 📡 How It Works

1. Clients connect to the WebSocket endpoint at `/ws` (with SockJS fallback).
2. Messages are sent to `/app/chat`.
3. The server adds a timestamp and broadcasts the message to all subscribers on `/topic/messages`.
4. The front-end receives and displays messages in real time.

---

## 🔐 Limitations & Security Notes

* Works **only on the local network** (LAN).
* ❌ No authentication or message persistence.
* ⚠️ Messages are **not encrypted** — use only for learning or internal LAN communication.
* Can be extended with:

  * JWT Authentication
  * HTTPS support
  * User login system
  * Chat rooms

---

## 🌱 Future Improvements

* 👥 Private & group chats (chat rooms)
* 🔐 User authentication & login
* 🔒 Encrypted TLS communication
* 💡 Front-end revamp (React, Angular, etc.)
* 💾 Message history persistence

---

## 📝 License

MIT License © [José Barroso](https://github.com/your-username)

---

Se quiseres, posso gerar também os **badges** para Java, Spring Boot e Licença, ou criar o `index.html` completo com interface leve para acompanhar este projeto. Desejas isso?
