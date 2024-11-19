package day11_array;

public class MathinParam {

	public static void main(String[] args) {
		int even[] = new int[30];
		for(int i =0; i<30; i++) {
			even[i]=i;
		}

		//even은 대괄호안의 숫자들중 첫번째인수의 시작주소를 기억하는 변수다.
		int value=2;
		int sumeven =sum(even, value);
		System.out.println("sumeven=" +sumeven);
		int sumodd =sum(even,1);
		System.out.println("sumodd ="+sumodd);
	}//main
	public static int sum(int[] arr, int v) {
		int sum =0;
		for(int i = 0; i<arr.length; i++) {
			if(i%v==0)
			sum+=arr[i];
		}
		return sum;
	}

}
