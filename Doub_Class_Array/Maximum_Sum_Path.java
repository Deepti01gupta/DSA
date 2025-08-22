package Doub_Class_Array;

public class Maximum_Sum_Path {

//	https://leetcode.com/problems/get-the-maximum-score/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1= {2,4,5,8,10};
		int[] num2= {4,6,8,9};
		int ans=maxSum(num1, num2);
		System.out.println(ans);
	}
	
	public static int maxSum(int[] num1, int[] num2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0;  // use long to avoid overflow
        long ans = 0;
        
        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                ans += Math.max(sum1, sum2) + num1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            } else if (num1[i] < num2[j]) {
                sum1 += num1[i];
                i++;
            } else {
                sum2 += num2[j];
                j++;
            }
        }
        
        while (i < num1.length) {
            sum1 += num1[i++];
        }
        while (j < num2.length) {
            sum2 += num2[j++];
        }
        
        ans += Math.max(sum1, sum2);
        
        return (int)(ans % 1_000_000_007);
    }

}
