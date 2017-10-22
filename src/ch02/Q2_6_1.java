package ch02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * 주어진 연결리스트가 회문인지 검사하는 함수를 작성하라.
 */
public class Q2_6_1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		String [] array = new String[] {"다", "시", "합", "창", "합", "시", "다"};
		
		// array를 ArrayList로 변환
		List<String> input = new ArrayList<>(Arrays.asList(array));
		list.addAll(input);
		System.out.println(palindromeCheck(list));
	}
	
	private static boolean palindromeCheck(LinkedList<String> list) {
		Stack<String> check = new Stack<>();
		for (int i = 0; i < list.size(); i++) {
			check.push(list.get(i));
		}
		
		LinkedList<String> compareList = new LinkedList<>();
		for (int i = 0; i < list.size(); i++) {
			compareList.add(check.pop());
		}
		
		return list.equals(compareList);
	}
}
