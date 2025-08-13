package lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
		int[] arr=new int[5];
		System.out.println(arr);
		int[] other=arr;   // same address is assign as of arr
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr.length);   // to find length of array
	}

}


// java k ander array ek class
// this class is non primitive data types
