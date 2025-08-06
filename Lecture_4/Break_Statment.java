package lec4;

public class Break_Statment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		for (int i = 1; i <= n; i++) {
		    if (i % 11 == 0) {
		        break;
		    }
		    System.out.println(i);
		}

	}

}
