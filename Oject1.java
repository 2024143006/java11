package day11_array;

public class Oject1 {

	public static void main(String[] args) {
		Job samsung=new Job();
		System.out.println(samsung.pay+":"+samsung.distance);

		Job lg=new Job();
		System.out.println(lg.pay+":"+lg.distance);
	}
}
class Job{
	int pay;
	int distance;
	public Job() {
		pay =300;
		distance=30;
	}

}

