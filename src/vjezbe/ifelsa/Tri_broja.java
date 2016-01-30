package vjezbe.ifelsa;

public class Tri_broja {
	//Za unesena tri broja ispisi koji je od njih najveci.

	public static void main(String[] args) {
		int a = 873;

		int treca = a % 10;
		a = a / 10;
		System.out.println(treca);
		int druga = a % 10;
		a = a / 10;
		System.out.println(druga);
		int prva = a % 10;
		System.out.println(prva);
		
		int zbir = treca + druga + prva;
		System.out.println("Zbir cifara" + zbir);
		if ( prva > druga && prva > treca) {
			System.out.println("prva najveca");
		}
		if (druga > prva && druga > treca){
			System.out.println("druga najveca");
		}
		if( treca > prva && treca > druga){
			System.out.println("treca najveca");
		}
	}

}
