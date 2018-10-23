
public class bezidejno {

	public void ispisiParneBrojeve(int a) {

		for(int i=0; i<a; i++)
		if(a % 2 == 0)
			System.out.println(a);
		



	}

	public void ispisiNeparneBrojeve(int a) {

		for (int i = 0; i < a; i++) {

			if (i % 2 != 0) {

				System.out.println(i);
			}

		}

	}

	public void ispisiPrimeBrojeve(int a) {


		boolean prime=false;
		for(int i=2; i<=a; i++) {
			for(int j=2; j<a; j++) {
				if(i%j==0 && i!=j) {
					prime=false;
					break;
				}
				else {
					prime=true;
					continue;
				}
			}
			if(prime)
				System.out.println(i);
		}


	}

	public void ispisiUnazad(int a) {
		System.out.println("Brojevi od " + a + " do nule.");
		if (a > 0) {
			for (int i = a; i >= 0; i--)
				System.out.print(i + " ");

		} else {
			for (int i = a; i <= 0; i++)
				System.out.print(i + " ");
		}
	}

}
