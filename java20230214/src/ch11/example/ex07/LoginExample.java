package ch11.example.ex07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws NotExistIdException, WrongPasswordException {
		//id가 blue가 아니라면 NotExistIdException을 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIdException(id + "는 일치하지 않습니다.");
		}
		//password거 12345가 아니라면 WrongPasswordException을 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException(password + "가 일치하지 않습니다.");
		}
	}
}
