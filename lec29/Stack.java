package lec29;

public class Stack {  // LIFO

	protected int[] arr;
	private int idx=-1;
	
	public Stack() {
		arr=new int[5];
	}
	
	public Stack(int n) {
		arr=new int[n];
	}
	
	// O(1) 
	public boolean isEmpty() {
		return idx==-1;
	}
	
	// O(1) 
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("bklol stack full hai");
		}
		idx++;  // kyuki hamne idx=-1 liya h
		arr[idx]=item;
	}
	
	// O(1) 
	public int size() {
		return idx+1;
	}
	
	// O(1) 
	public boolean isFull() {
		return idx==arr.length-1;
	}
	
	// O(1) 
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("bklol stack khali hai");
		}
		int x= arr[idx];
		idx--;
		return x;
	}
	
	// O(1) 
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("bklol stack khali hai");
		}
		return arr[idx];
	}
	
	// O(N) 
	public void display() {
		for(int i=0; i<=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
