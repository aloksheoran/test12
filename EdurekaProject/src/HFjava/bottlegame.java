package HFjava;

public class bottlegame {

	public static void main(String[] args) {
		int beernum = 99;
		String word = "bottles";
		
		while (beernum > 0) {
			
			if (beernum == 1) {
				word = "bottle";			
							
			}
			
			System.out.println(beernum + " " + word + "of beer on the wall");
			System.out.println(beernum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");	
			beernum = beernum-1;
			
			if (beernum>0) {
				
				System.out.println(beernum+ "" + word + " of beer on the wall");
			}
			else {
				System.out.println("no more bottles");
			}
			
			
		}

	}

}