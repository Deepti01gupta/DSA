package lec12;

public class Time_and_space_complexity {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//
//		System.out.println(end - start);
		
		// constant time is equal to n is independent time.
		// time complexity of syso is O(1) which is constant.
		// linear search : O(N)
		// find max element in array : O(N)
		// reverse a array : O(N/2)
		
		// binary search : O(log N) base 2
		
		
		// O(N)
		int n = 10000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			i++;
		}

		 // O(Log N) base 2;
		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
		}

		// O(Log N) base 2;
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}

		// O(N)
		while (i <= n) {
			System.out.println("Hey");
			i += 2;
			i += 3;
		}
		
		// O(Log N) base 6;
		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
			i *= 3;
		}
		
		// O(Log N) base 6;
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			n /= 3;
		}
		
		// O(N/k)
		int k = 3;
		while (i <= n) {
			System.out.println("Hey");
			i += k;
		}
		
		// O(Log N) base k;
		while (i <= n) {
			System.out.println("Hey");
			i *= k;
		}

		// O(N^2)
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
			}
		}

		// O(Sqrt(N))
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		}
		
		// O(N^4) = O(N * N^2 * N/2)
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
				}
			}
		}
		
		// O(Log N) base 2;
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
		}

		// O(N/2 * N/2 * log(N) base 2)
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				}
			}
		}
		
		// O(N * log(N))
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}

		// bubble : worse = N^2 , best = O(N)
		// Selection : worse = N^2 , best = O(N)
		// Insertion : worse = N^2 , best = O(N)

		// minimum swaping = selection sort
		
		// kadens algo : O(N)
	}
}
