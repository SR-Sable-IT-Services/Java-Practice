// functional interface using lymbda exprection
public interface FIUsingLymbda {
  void show(); // abstract method // function interface contains only one abstract method
}
public class FunctionalInterfaceUsingLymbda {

	public static void main(String[] args) {
		FIUsingLymbda ob =()->System.out.println("hi all using lymbda exprection");
		ob.show();
	}

}
