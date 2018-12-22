
public class beersong {

	static int beercount = 99;
	public static void main(String[] args) {
	     
		while (beercount > 1) {
			System.out.println(beercount+" beer on the wall");
			beercount=beercount-1;
		}
           if (beercount==1) {
        	System.out.println(beercount+" so last beer");
        	beercount=beercount-1;
           }
           if (beercount==0) {
           	System.out.println(beercount+" so its empty");
	}

}
	
}
