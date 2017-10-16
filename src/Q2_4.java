import java.util.LinkedList;
import java.util.Scanner;

public class Q2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�   : ");
		// ex) 1 2 3 4 5
		String input = sc.nextLine();
		System.out.print("���Ұ� : ");
		// ex) 3
		int x = Integer.parseInt((sc.nextLine()));
		
		sc.close();
		
		System.out.println("���   : " + listDivision(input, x));
		
	}
	
	private static LinkedList<Integer> listDivision(String input, int x) {
		LinkedList<Integer> inputList = new LinkedList<>();
		LinkedList<Integer> resultList = new LinkedList<>();
		
		String [] arr = input.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			inputList.add(Integer.parseInt(arr[i]));
		}
		
		for (int i = 0; i < inputList.size(); i++) {
			if (inputList.get(i) < x) {
				resultList.addFirst(inputList.get(i));
			} else {
				resultList.addLast(inputList.get(i));
			}
		}
		
		return resultList;
	}
}




