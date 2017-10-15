import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int cnt = 1;
		String temp = "";
		String[] arr = text.split("");
		
		for (int i = 0; i < text.length(); i++) {
//			sb.append(arr[i]);
//			sb.append(cnt);
			if (i == text.length() - 1) break;
			if (arr[i].equals(arr[i + 1])) {
				cnt++;
//				temp = arr[i];
			} else {
				sb.append(arr[i]);
				sb.append(cnt);
			}
		}
		
		sc.close();
		if (sb.length() > text.length()) {
			System.out.println(text);
		} else {
			System.out.println(sb);
		}
	}
}
