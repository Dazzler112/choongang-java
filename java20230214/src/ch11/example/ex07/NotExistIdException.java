package ch11.example.ex07;

public class NotExistIdException extends Exception{
	public NotExistIdException() {}
	public NotExistIdException(String message) {
		super(message);
	}
}
