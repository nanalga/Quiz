package quiz01;

import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) {
		
		//중첩 반복문 이용하여 정렬
		//밖 for 앞 숫자
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		
		for(int i = 0; i< arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
			
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Arrays.parallelSort(arr);	//자동정렬
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}

}
