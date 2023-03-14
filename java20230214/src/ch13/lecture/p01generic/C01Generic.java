package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");
		
		String s1 = null//어디서 꺼내서 쓰고싶으면 get불러오고 스트링을 쓰고싶은대 					
		Object o2 = o1.getItem();//오브젝트는 스트링이다 라고 할수 없으니 강제형변환
		if(o2 instanceof String) {//제너릭 없던시절 별거 아닌 코드에도 너무 길다...
			s1 = (String) o2;		//제너릭 사용! 다음파일로
		}
		if(s1 != null) {
		System.out.println(s1.length());
		}
	}
}
class MyClass01{
//	item;//필드의 타입이 결정 되지 않았을때 제너릭 없었던 시절의 최선의 방법은object
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	
}