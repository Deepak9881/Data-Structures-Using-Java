package Queue;

public class QueueusingArray {
	int data[];
	int front,rear;
	int size;
	public QueueusingArray(int  size) {
		this.size=size;
		this.data = new int [size];
		front=rear=-1;
	}
	
	public void enque(int value) {
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}if(rear==-1) {
			front=0;
		}
		data[++rear]=value;	
		//System.out.println(rear);
	}
	
	public int deque() {
		if(isFull()) {
			System.out.println("queue is empty");
			return -1;
		}
		int val= data[front++];
		if(front==rear+1) {
			front=rear=-1;
		}
		return val;
	}
	public boolean isEmpty() {
		if (rear==-1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(rear==size-1)
			return true;
	     return false;
	}
	
	public void display() {
		System.out.print("queue elements are :");
		int x=front;
		while(x!=rear+1) {
			System.out.print(data[x++]+"--->");
			
		}
	}
	
	

}
