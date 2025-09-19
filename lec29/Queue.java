package lec29;

public class Queue {

	protected int[] arr;
	protected int front=0;
	private int size=0;
	
	public Queue() {
		arr=new int[5];
	}
	
	public Queue(int n) {
		arr=new int[n];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("bklol queue full hai");
		}
		int idx=(front + size)%arr.length;
		arr[idx]=item;
		size++;
	}
	
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("bklol queue khali hai");
		}
		int x=arr[front];
		front=(front+1)%arr.length;
		size--;
		return x;
	}
	
	public int getFront() throws Exception{
		if(isEmpty()) {
			throw new Exception("bklol queue khali hai");
		}
		int x=arr[front];
		return x;
	}
	
	public boolean isFull() {
		return size==arr.length;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		for(int i=0; i<size; i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
