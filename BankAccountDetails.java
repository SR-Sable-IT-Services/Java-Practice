class BankAccountDetails
{
	 long accountNo= 50100393669444L;
	 String accHN ="Vishal Narayan Dutonde";
	static long mobileNo = 9145238840L;
	static int branchCode = 9549;
	static String city = "Mehkar";
	static String state = "Maharastra";


	public static void main(String[] args) 
	{
		BankAccountDetails bad = new BankAccountDetails();
		System.out.println("Account Number :"+bad.accountNo);
		System.out.println("AccountHolderName :"+bad.accHN);
		System.out.println("MobileNumber :"+mobileNo);
		System.out.println("BranchCode :"+branchCode);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
	}
}
