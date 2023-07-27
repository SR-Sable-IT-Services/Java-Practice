public class jaggedArray {

	public static void main(String[] args) {
     Integer a1[]= {1,2,3};
     Integer a2[]= {11,22,33};
     Integer a[][]= {a1,a2};//jagged array is nothing bt which is holding the array object
     System.out.println("===Arrays===");
     for(Integer v[]:a)
     {
    	 for(Integer p:v)
    	 {
    		 System.out.println(p);
    	 }
     }
	}

}
