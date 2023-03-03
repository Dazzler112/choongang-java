package ch06.lecture.p11capsule;
//getter 읽는메소드 setter 쓰는 메소드
public class MyClass03 {
	private String name; //특별한 이유 없으면 private 작성!!
	private int age; //왜? 밖에서 접근해서 막 수정할 수 있으니까
	private String address;
	
	//-------------------------------------------------//
	//특별방식
	private boolean married;
	public void setMarried (boolean married) {
		this.married = married;
	}
	//boolean 타입의 getter는 is로 시작
	public boolean isMarried () {
		return this.married;
	}
	//-------------------------------------------------//
	//메소드 통해서 필드에 접근하도록!
	//변경하는 용도로는 setFieldName으로 사용
	public void srtName() {
		//변경
		this.name = name;
	}
	
	//읽을때는 읽는 타입(ex)String name)과 일치 하도록
	public String getName() {
		//읽기
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress () {
		return this.address;
	}
}
