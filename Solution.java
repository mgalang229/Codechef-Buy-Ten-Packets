import java.util.Scanner;

/*

possible combinations:
4 2 2 2
4 4 2
2 2 2 2 2

*/

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			int a = x * 3 + y;
			int b = 2 * y + x;
			int c = x * 5;
			System.out.println(Math.min(a, Math.min(b, c)));
		}
		fs.close();
	}
}
