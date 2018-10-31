package guru99project;

public class Main_method {

	public static void main(String[] args) {
		
		guru99project gp = new guru99project();
		
		gp.invokechrome();
		gp.printtitlepage();
		gp.login("mngr160177", "hynydej");
		gp.addcustomer();
		String custid = gp.getcustomeriD();		
		System.out.println("customerid"+custid);
		gp.addaccount(custid);
	//	gp.browserclose();

	}

}
