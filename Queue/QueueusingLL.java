package Queue;

public class QueueusingLL {
 Node front, rear;
int size;


public QueueusingLL() {
	super();
	this.front = null;
	this.rear = null;
	this.size = 0;
}

public void enque(int data) {
	Node node=new Node(data);
	if(rear==null) {
		front=rear=node;
		return;
	}
	else {
		rear.setNext(node);
		rear=node;
	}
}

public Node deque() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return null;
	}
	
	Node temp=front;
	front=front.getNext();
	return temp;
	
}

public void display() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return;
	}
	Node temp=front;
	System.out.print("queue elements");
	while(temp!=null) {
		System.out.print(temp.getData()+"-->");
		temp=temp.getNext();
	}
}

public boolean isEmpty() {
	if(rear==null)
		return true; 
	return false;
}


}
