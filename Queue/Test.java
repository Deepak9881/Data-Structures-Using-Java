package Queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		QueueusingArray a=new QueueusingArray(5);
//		a.enque(10);
//		a.enque(20);
//		a.enque(30);
//		a.enque(40);
//		a.display();
//		System.out.println(a.deque());
//		System.out.println(a.deque());
//		System.out.println(a.deque());
//		System.out.println(a.deque());
//		//System.out.println(a.deque());
//		a.enque(40);
//		a.enque(40);
//		a.display();
		
		
		QueueusingLL l=  new QueueusingLL();
		l.enque(10);
		l.enque(101);
		l.enque(200);
		l.enque(40);
		l.enque(80);
		l.display();
		System.out.println();
		System.out.println((l.deque()).getData());
		System.out.println((l.deque()).getData());
		System.out.println((l.deque()).getData());
		System.out.println((l.deque()).getData());
		System.out.println((l.deque()).getData());
		System.out.println((l.deque()).getData());
		l.display();
	}
		
}
