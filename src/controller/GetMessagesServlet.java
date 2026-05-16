package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.MessageService;

@WebServlet("/get-messages")
public class GetMessagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetMessagesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		String strangerId = (String) session.getAttribute("strangerId");
		String roomId = MessageService.generateRoomId(userId, strangerId);
		List<String> messages = MessageService.getMessages(roomId);
		
		for(String message : messages) {
			response.getWriter().println(message);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
