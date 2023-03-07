package ch08.example.ex6;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sounds());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
