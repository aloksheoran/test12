
public class drumkitTestdrive {

	public static void main(String[] args) {
		
		DrumKit d = new DrumKit();
		if (d.snare == true) {			
			d.playsnare();
		}
   d.playtophat();
   d.snare = false;
   
	}

}
