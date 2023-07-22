class Encapsu
    {
	private String name;// private variable 
	private int id; //private variable
	public void setId(int id)//public method
	{
		this.id =id;
	}
	public int getId()
	{ 
		return id;
	}
	public void setName(String name)//public method
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	}
public class Encapsulation1 {

	public static void main(String[] args) {
		
		Encapsu en =  new Encapsu();
		en.setName("vishal");
		en.setId(101);
		
		System.out.println(" EmpName :"+en.getName());
		System.out.println(" EmpId :"+en.getId());


	}

}
