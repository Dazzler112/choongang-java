package Ch14.lecture.p05concurrency;
//해결방법2
public class C03SyncronizedMethod {
	public static void main(String[] args) {
		Box box = new Box();
		Thread a = new Thread(()-> {
			for(int i = 0; i < 100000; i++) {
			box.increase();
			}
		});
		Thread b = new Thread(()-> {
			for(int i = 0; i < 100000; i++) {
			box.increase();
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
		System.out.println(box.item);
	}
}

class Box {
	public int item = 0; 
	
	public synchronized void increase() {//메인에 받는값이 같으면 메소드 자체에 syncronized를 넣어주면 된다
//		synchronized (this) {//메소드에 syncronized를 넣으면 this가 생략된거나 같다
			item++;
			
//		}
			
	}
}