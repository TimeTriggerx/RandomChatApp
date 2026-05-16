package service;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class MessageService {
	private static Map<String, List<String>> chatRooms = new HashMap<>();
	
	public static String generateRoomId(String user1, String user2) {
		
		if(user1.compareTo(user2) < 0) {
			return user1 + "_" + user2;
		}
		return user2 + "_" + user1;
	}
	
	public static void sendMessage(String roomId, String message) {
		
		chatRooms.putIfAbsent(roomId, new ArrayList<>());
		chatRooms.get(roomId).add(message);
	}
	
	public static List<String> getMessages(String roomId) {
		return chatRooms.getOrDefault(roomId, new ArrayList<>());
	}
}
