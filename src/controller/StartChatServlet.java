package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.MatchMakingService;

@WebServlet("/start-chat")
public class StartChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StartChatServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = "user_" + System.currentTimeMillis();
		session.setAttribute("userId", userId);
		boolean matched = MatchMakingService.joinQueue(userId, session);
		if(matched) {
			response.sendRedirect("pages/chat.jsp");
		} else {
			response.sendRedirect("pages/waiting.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
