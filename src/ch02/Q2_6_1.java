package ch02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * �־��� ���Ḯ��Ʈ�� ȸ������ �˻��ϴ� �Լ��� �ۼ��϶�.
 */
public class Q2_6_1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		String [] array = new String[] {"��", "��", "��", "â", "��", "��", "��"};
		
		// array�� ArrayList�� ��ȯ
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
