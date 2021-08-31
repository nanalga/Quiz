package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	public static void main(String[] args) {
		method1();
		
		String str = method2("메서드2");
		System.out.println("method2 : " + str);
		
		double result3 = method3(1, 2, 1.5);
		System.out.println("method3 : " + result3);
		
		String result1 = calMethod4(3);
		System.out.println("method4 : " + result1);
		
		calMethod5("메서드", 5);
		
		int max = maxNum(5, 1);
		System.out.println("maxNum : "+ max);
		
		int abs = abs(-3);
		System.out.println("abs : " + abs);
		
		char[] cAarr = {'a','p','p','l','e'};
		String result6 = method6(cAarr);
		System.out.println("method6 : "+result6);
		
		int[] iArr = {1,2,3};
		int result7 = method7(iArr);
		System.out.println("method : "+ result7);
		
		String[] result8;
		result8 = method8("자바", "어렵다");
		System.out.println(Arrays.toString(result8));
		
		
		int[] arr = seat(10);
		System.out.println(Arrays.toString(arr));
	}
	
	static void method1() {
		System.out.println("method1 : 안녕");
	}
	
	static String method2(String str) {

		return str;
	}
	
	static double method3(int num1, int num2, double dNum) {
		double sum = 0.0;
		sum = num1 + num2 + dNum;
		return sum;
	}
	
	static String calMethod4(int num) {
		if(num % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	
	static void calMethod5(String str, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println("method5 : "+str);
		}
	}
	
	static int maxNum(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	static int abs(int num) {
		if(num < 0) {
			 num = -num;
		}
		return num;
	}
	
	static String method6(char[] ch) {
		String str = "";
		for(int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		return str;
	}
	
	static int method7(int[] iArr) {
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			sum += iArr[i];
		}
		return sum;
	}
	
	static String[] method8(String str1, String str2) {
		String[] strArr = new String[2];		
		//String[] strArr = {a, b};
		strArr[0] = str1;
		strArr[1] = str2;
		
		return strArr;
	}
	
	static int[] seat(int size) {		
		int[] arr = new int[size];
		int index = 0;
		
		start:while(true) {
			int ran = (int)(Math.random() * size)+1;
			//중복 검사
			for(int i = 0; i < index; i++) {
				if(arr[i] == ran) {
					continue start;	//중복될 경우 처음으로 간다
				}
			}
			
			arr[index] = ran;
			index++;
			
			if(index == size) break;	//탈출
		}
		
		return arr;
	}
	
	
	
	

}
