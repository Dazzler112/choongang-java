package Ch14.lecture.p05concurrency;

public class C02ConCurrency {
	//synchronized 블럭 (동기화 블럭)
	
	static int field =0; //쓰레드로 fields++ 하면 0을 필드에 올리고 ++로 1로 올라가고 set하면서 1이 되는대 1하면서 동시에 b에서도 1-2-3이런순으로 올라가니 필드값이 2가 됬다가 1이 됬다가 왔다갔다함
	public static void main(String[] args) {
	//intrinsic lock
	//monitor lock
	//monitor
	//lock  아래 object 부르는 이름
	Object o = new Object();
//	Object o1 = new Object(); 이렇게 하면 우리가 원하는 결과는 나오지 않는다
		Thread a = new Thread(() -> {
			for(int i=0; i < 100000; i++) {
				synchronized (o) {
					field++;	//획득-실행-반납 = 싱크로나이즈 파라미터 를 획득해야 수가 올라갈수 있음 쓰레드 끼리 서로 경쟁한다				
				}
			}
		});
		
		Thread b = new Thread (() -> {
			for(int i =0; i < 100000; i++) {
				synchronized (o) {//<-o1 이렇게하면 원하는값 안나옴
					field++;					
				}
			}
		});
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(field);
	}
}
