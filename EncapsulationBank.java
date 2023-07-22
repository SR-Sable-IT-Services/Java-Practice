//A Account class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.
class Account 
  { 
	 private long accNo;
	 private String name,eMail;
	 private float accBal;
	 
	 public void setAccNo(long accNo)
	 {
		 this.accNo =accNo;
	 }
	 public long getAccNo()
	 {
		 return accNo;
	 }
	 
	 public void setName(String name)
	 {
		 this.name =name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void setEMail(String EMail)
	 {
		 this.eMail =eMail;
	 }
	 public String geteMail()
	 {
		 return eMail;
	 }
	 
	 public void setAccBal(float accBal)
	 {
		 this.accBal =accBal;
	 }
	 public float getAccBal()
	 {
		 return accBal;
	 }
  }


public class EncapsulationBank {

	public static void main(String[] args) {
		Account ob =new Account();	
		ob.setAccNo(50100393669444L);
        ob.setName("Vishal Dutonde");
        ob.setEMail("Vishaldutonde777@gmail.com");
        ob.setAccBal(2711f);
        System.out.println("AccountNumber :"+ob.getAccNo());
        System.out.println("AccountHolderName :"+ob.getName());
        System.out.println("EMail :"+ob.geteMail());
        System.out.println("AccountBalance :"+ob.getAccBal());
	}
}
