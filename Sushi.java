import java.util.Scanner;

public class crackhead {
	static Scanner dave = new Scanner(System.in);

	public static void main(String[] args) {

		int michelle = dave.nextInt();
		int[] jack = new int[michelle];
		
		
		
		for (int i = 0; i < michelle; i++)
			jack[i] = dave.nextInt();
		int last = jack[0];
		int eel = 0;
		int cnt2 = 0;
		int ans = 0;
		for (int i = 0; i < michelle; i++) {
			if (jack[i] != last) {
				cnt2 = eel;
				eel = 0;
				last = jack[i];
			}
			eel++;
			ans = Math.max(ans, Math.min(eel, cnt2));
		}
		System.out.println(ans * 2);
	}

}
