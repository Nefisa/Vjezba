
public class bezidejno {
	
	public void ispisiParneBrojeve(int a) {
		
	}
	
	public void ispisiNeparneBrojeve(int a) {
		
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
		
	}

}
