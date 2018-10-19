
public class bezidejno {

	public void ispisiParneBrojeve(int a) {

	}

	public void ispisiNeparneBrojeve(int a) {

	}

	public void ispisiPrimeBrojeve(int a) {

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
