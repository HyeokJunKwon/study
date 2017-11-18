package ch05;

public class Q5_1 {
	static int m = 19;
	static int n = 1024;
	static int i = 2;
	static int j = 6;
	
	public static void main(String[] args) {
		int result = UpdateBits(m, n, i, j);
		printBinary(result);
	}
	
	private static void printBinary(int num) {
		String b_num = Integer.toBinaryString(num);
		System.out.println(b_num);
	}
	private static int getMask(int i, int j, int max_int) {
		int left = max_int << (j + 1);
		int right = (1 << i) - 1;
		
		System.out.println("left : " + left);
		System.out.println("right : " + right);
		System.out.println("left | right : " + (left | right));
		
		return left | right;
	}
	
	private static int UpdateBits(int m, int n, int i, int j) {
		int max_int = (int)Math.pow(2, 32) - 1;
		int mask = getMask(i, j, max_int);
		int n_cleared = n & mask;
		int m_shifted = m << i;
		
		System.out.println("max_int : " + max_int);
		System.out.println("mask : " + mask);
		System.out.println("n_cleared : " + n_cleared);
		System.out.println("m_shifted : " + m_shifted);
		System.out.println("n_cleared | m_shifted : " + (n_cleared | m_shifted));
		
		return n_cleared | m_shifted;
	}

}
