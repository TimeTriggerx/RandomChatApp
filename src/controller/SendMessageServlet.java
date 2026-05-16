package controller;

import javax.servlet.http.HttpSession;

import service.MessageService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send-message")
public class SendMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SendMessageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		String strangerId = (String) session.getAttribute("strangerId");
		String roomId = MessageService.generateRoomId(userId, strangerId);
		String message = request.getParameter("message");
		String finalMessage = userId + ": " + message;
		MessageService.sendMessage(roomId, finalMessage);
	}

}
