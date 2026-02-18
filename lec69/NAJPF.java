package lec69;

import java.util.*;

public class NAJPF {

//	https://www.spoj.com/problems/NAJPF/
	
	static List<Integer> ll;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			ll = new ArrayList<>();
			String s = sc.next();
			String p = sc.next();
			rabinKarp(s, p);
			StringBuilder sb = new StringBuilder();
			if (ll.size() == 0) {
			    sb.append("NOT FOUND\n");
			} else {
			    sb.append(ll.size()).append("\n");
			    for (int i = 0; i < ll.size(); i++) {
			        sb.append(ll.get(i));
			        if (i < ll.size() - 1) sb.append(" ");
			    }
			    sb.append("\n");
			}
			System.out.println(sb.toString());
		}
		sc.close();

	}

	private static void rabinKarp(String s, String p) {

		if (s.length() == 0 || p.length() == 0)
			return;
		if (p.length() > s.length())
			return;

		long hv = 0, pow = 1, pr = 31, mod = (long) (1e9 + 7);

		for (int i = 0; i < p.length(); i++) {
			hv = (hv + ((p.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			pow = (pow * pr) % mod;
		}

		// Compute prefix, and power array

		long[] dp = new long[s.length()];
		long[] power = new long[s.length()];

		power[0] = 1;
		dp[0] = s.charAt(0) - 'a' + 1;
		pow = 31;

		for (int i = 1; i < s.length(); i++) {
			dp[i] = (dp[i - 1] + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			power[i] = pow;
			pow = (pow * pr) % mod;
		}

		// Answer Calculation

		int len = p.length();
		if (dp[len - 1] == hv)
			ll.add(1);

		for (int i = len; i < s.length(); i++) {
			int k = i - len;
			long curr = (dp[i] - dp[k] + mod) % mod;
			if (curr == (hv * power[k + 1]) % mod)
				ll.add(k + 2);
		}
		return;
	}
}