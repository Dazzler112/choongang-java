package ch13.sec02.exma02;

public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
