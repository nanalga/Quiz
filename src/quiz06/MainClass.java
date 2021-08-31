package quiz06;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		ArrayPrint ap = new ArrayPrint();
		int[] iArr = {1,2,3,4};
		System.out.println(Arrays.toString(iArr));
		System.out.println(ap.iArr(iArr));
		String[] sArr = {"자바자바"};
		System.out.println(ap.iArr(sArr));
		char[] cArr = {'a','p','p','l','e'};
		System.out.println(ap.cArr(cArr));
	}

}
