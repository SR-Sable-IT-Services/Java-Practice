public class ObjectArrays {

	public static void main(String[] args) 
	{
      Object o[] =new Object[3];
      o[0]=new Integer(12);
      o[1]= new String("vit");
      o[2]=new Long(9145238840l);
      for(int i=0;i<o.length;i++)
      {
    	 System.out.println(o[i]); 
      }
	}

}
/*faq:
define Object Array?
  =>The Array which is declared with 'java.lang.Object' class is known as Object
Array.
  =>This Object Array can hold Dis-Similer objects because 'Object' class is the
ParentClass of all the classes.
(Dis-Similer objects means objects of different classes)

syntax:
Object o[] = new Object[size];*/