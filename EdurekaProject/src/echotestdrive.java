
public class echotestdrive {

	public static void main(String[] args) {
		echo e1 = new echo();
		echo e2 = new echo();
		int x = 0;
		while (x>5)   {	
			e1.hello();
		
			if(x==3) {				
				e2.count = e2.count+1;
			}
			if (x==4) {
				e2.count = e2.count + e1.count;
			}
			
			x=x+1;
		}
		System.out.println(e2.count);
				
			}
			

	}


