package ch09.Example.ex07;

public class Chatting {
	class Chat{
	void start() {}
	void sendMessage(String message) {}
	}
void startChat(String chatId) {
//	String nickName = null;
//	nickName = chatId; //재정의 불가 effectively final이니까
	String nickName = chatId; //올바른 답변1
	Chat chat = new Chat() {
		@Override
		public void start() {
			while(true) {
				String InputData = "안녕하세요.";
				String message = "[" + nickName +"]" + InputData;
				sendMessage(message);
			}
		}
	};
	chat.start();
	}
}