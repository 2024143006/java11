package day11_array;

public class CharArray {

	public static void main(String[] args) {
	String name ="TaeHyeon";
	System.out.println("name:"+name);
	//자신의 이름을 문자배열을 만들어 넣으시오.
	char[] nameArr2 = {'A','B','c'};
	char[] nameArr =name.toCharArray();
	for(int i =0; i<nameArr.length; i++) {
		System.out.println(nameArr[i]);
	}
	}

}
