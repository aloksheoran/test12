package HFjava;

public class Forloop_3 {

	public static void main(String[] args) {
		
		String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		
		String days = ""; 
		
		for (String workday1:workdays) {
			
			days = days + "|" + workday1;
			
		}
		
		System.out.println(days);
		
	}

	}
