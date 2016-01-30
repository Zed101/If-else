package vjezbe.ifelsa;

public class FibonacijevBroj {

	public static void main(String[] args) {
	int first = 0;
	int second = 1;
	int sum = 0;

	for ( int i = 0; i < 18; i++){
		sum = first + second;
		first = second;
		second = sum;
		System.out.println(sum);
		System.out.println(i);
	}
	
	
	
	}
}
