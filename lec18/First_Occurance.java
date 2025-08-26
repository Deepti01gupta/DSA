package lec18;

public class First_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,5,2,4,5};
		int t=4;
		System.out.println(find(arr,t,0));
	}
	
	public static int find(int[] arr, int t, int idx) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==t) {
			return idx;
		}
		return find(arr,t,idx+1);
	}

}
