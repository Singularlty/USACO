// [codeforces] Two Towers - 800 | solved 233ms 740KB 3/4/23


import java.io.*;
import java.util.*;

public class twotowers {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
		
			
			String tower1 = sc.next();
			String tower2 = sc.next();
			
			int contactPoints = 0;	
			char c = tower1.charAt(0);
			for (int j = 1; j < N; j++) {
				if (tower1.charAt(j) == c) {
					contactPoints++;
				}
				c = tower1.charAt(j);	
			}	

			for (int j = M-1; j >= 0; j--) {
				if (tower2.charAt(j) == c) {
					contactPoints++;
				}
				c = tower2.charAt(j);	
			}
			
			if (contactPoints <= 1){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		sc.close();

	}

}





















