@FunctionalInterface
public interface A {
 void show();// interface contain only one abstract methods in  functional interface 
}

public class B implements A{  // interface to class we use implements keywords 
@Override  
public void show()
  {
	  System.out.println("hi sir");
  }
}


/*functional interface means it contains only one abstract method in interface 
 */
package main;
import test.*;
public class FunctionalInterface {
   
	public static void main(String[] args) {
	B ob = new B();
		ob.show();
	}

}
