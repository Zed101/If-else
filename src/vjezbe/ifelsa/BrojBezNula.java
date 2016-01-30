package vjezbe.ifelsa;

public class BrojBezNula {

	public static void main(String[] args) {
		int n = 110120;
		
//		String smahf = String.valueOf(n);
//		int duz = smahf.length();

		int length = String.valueOf(n).length();
		int zadnja = 0;
		String brojbez0 ="";
	
		
	
		while(length != 0){
			zadnja = n % 10;
			n = n / 10;
			if (zadnja != 0){
				brojbez0= zadnja + brojbez0;
				System.out.println(brojbez0 + " broj bez nule" );
			}
			length--;
			
		System.out.println(zadnja);
		}
	}

}
