



public class Segundo {
	
	public static void main(String[] args) {
		
		System.out.println(retorno(5));
		
	}
	
	static int retorno(int n) {
		
		if(n > 0 && n !=9) {
			for ( int i =1; i< n; i++) {
				if (Math.sqrt(i+n) % 2 == 0) {
					return i;
					
				}
				
			}
		}
		return -1;
	}
	
}
	