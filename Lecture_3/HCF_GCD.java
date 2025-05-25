package lec3;

public class HCF_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=36;
		int num2=60;
		while(num2%num1!=0) {
			int rem=num2%num1;
			num2=num1;
			num1=rem;
		}
		System.out.println(num1);

	}

}
