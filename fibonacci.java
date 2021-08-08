
public class fibonacci {
	public static void main(String[] args) {
		int range = 8;
    	int	firstnum = 0;
		 int secnum = 1;
			int	sum;
			System.out.println(firstnum+ " " +secnum);
		for(int i = 2;i<8;++i) {
			
			sum = firstnum + secnum ;
			System.out.println(" "+sum);
			firstnum = secnum  ;
			secnum = sum ;
			
		
		}
	}
	
	
}


