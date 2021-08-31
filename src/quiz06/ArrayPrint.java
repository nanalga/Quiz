package quiz06;

public class ArrayPrint {
	/*
	 * Arrays.toString기능을 따라해보기(int배열, String배열, char배열)을 각각 받아서 
	 * 배열 내부의 요소를 문자열의 형태로 가로로 더해서 반환해주는 메서드를 오버로딩
	 */
	String iArr(int[] arr) {
		String str = "";
		str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(arr.length-1 == i) break;
				str += ", ";
		}
		str +="]";
		return str;
	}
	String iArr(String[] sArr) {
		String str = "[";
		for(int i = 0; i < sArr.length; i++) {
			str += sArr[i];
			if(sArr.length-1 == i) break;
				str += ", ";
		}
		str += "]";
		return str;
	}
	String cArr(char[] cArr) {
		String str = "[";
		for(int i = 0; i < cArr.length; i++) {
			str += cArr[i];
			if(cArr.length-1 == i) break;
			str += ", ";
		}
		str += "]";
		return str;
	}

}
