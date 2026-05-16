package service;

import java.util.Map;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpSession;

public class MatchMakingService {
	
	private static Map<String, HttpSession> waitingUsers = new LinkedHashMap<>();
	
	public static boolean joinQueue(String userId, HttpSession session) {
		if(waitingUsers.isEmpty()) {
			waitingUsers.put(userId, session);
			return false;
		}
		
		String strangerId = waitingUsers.keySet().iterator().next();
		HttpSession strangerSession = waitingUsers.get(strangerId);
		waitingUsers.remove(strangerId);
		session.setAttribute("strangerId", strangerId);
		strangerSession.setAttribute("strangerId", userId);
		return true;
	}
}
