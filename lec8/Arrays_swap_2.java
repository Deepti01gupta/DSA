package lec8;

public class Arrays_swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,1,7,8};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void swap(int[] arr,int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
