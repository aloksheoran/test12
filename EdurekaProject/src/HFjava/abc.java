package HFjava;

public class abc {
	int y = 0;
	public static void main(String[] args) {
		int c = 0;
		int x = 0;
		abc[] a = new abc[10];
		
		
		while (x<9) {
			a[x] = new abc();
			a[x].y 	= a[x].y+1;
			c = c+1;
			c = c + a[x].maybeNew(x);
			x=x+1;
			
		}
	 System.out.println(c+" "+ a[1].y);
	}
public int maybeNew (int index) 
{
	if(index<6) {
		
		abc m4 = new abc();
		m4.y = m4.y+1;
		return 1;
	}
	return 0;
}
	
	
}
