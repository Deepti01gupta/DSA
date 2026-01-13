package cf_ques_graph;

import java.util.*;

public class Mocha_and_Hiking {
	
//	https://codeforces.com/group/ibNhxWfOek/contest/341358/problem/A
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            boolean allZero = true;
            boolean allOne = true;

            for (int i = 0; i < n; i++) {
                if (a[i] != 0) allZero = false;
                if (a[i] != 1) allOne = false;
            }

            if (allZero) {
                for (int i = 1; i <= n + 1; i++) {
                    System.out.print(i + " ");
                }
            } else if (allOne) {
                System.out.print((n + 1) + " ");
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
            } else {
                int pos = -1;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] == 0 && a[i + 1] == 1) {
                        pos = i;
                        break;
                    }
                }

                for (int i = 1; i <= pos + 1; i++) {
                    System.out.print(i + " ");
                }

                System.out.print((n + 1) + " ");

                for (int i = pos + 2; i <= n; i++) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

