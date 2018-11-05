package guru99project;

public class Main_method_Chrome {

	public static void main(String[] args) {
		
		guru99projectchrome gp = new guru99projectchrome();
		
		gp.invokechrome();
		gp.printtitlepage();
		gp.login("mngr160177", "hynydej");
		gp.addcustomer();
		String custid = gp.getcustomeriD();		
		System.out.println("customerid > "+custid);
		gp.addaccount(custid);
		gp.editaccount(custid);
	//	gp.browserclose();

	}

}
