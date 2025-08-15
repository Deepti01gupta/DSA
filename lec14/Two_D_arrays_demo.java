package lec14;

public class Two_D_arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][4];
		System.out.println(arr);
		int[][] other = arr;
		System.out.println(arr.length);// row ki lenght
		System.out.println(arr[0].length);// col ki lenght
		System.out.println(other[1][2]);
	}

}
