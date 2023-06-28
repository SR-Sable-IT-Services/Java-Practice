final class Employee{
private final int empId;
private final String empName;
private final long empNo;
private final String empDip;
private final int empPin;

    public Employee(int empId,String empName,long empNo,String empDip,int empPin)
    {
        this.empId=empId;
        this.empName=empName;
        this.empNo=empNo;
        this.empDip=empDip;
        this.empPin=empPin;
    }

   public int getEmpId()
    {
        return empId;
    }

   public String getEmpName()
    {
        return empName;
    }
 

   public long getEmpNo()
    {
        return empNo;
    }


   public String getEmpDip()
    {
        return empDip;
    }


   public int getEmpPin()
    {
        return empPin;
    }
    
}

public class ImmutableClass{
     public static void main(String args[]){

     Employee e=new Employee(123, "Rushi", 8459022351L, "DevOps", 441501);
     System.out.println("Employee Id : "+e.getEmpId());
     System.out.println("Employee Name : "+e.getEmpName());
     System.out.println("Employee Number : "+e.getEmpNo());
     System.out.println("Employee Dipartment : "+e.getEmpDip());
     System.out.println("Employee Pin : "+e.getEmpPin());
}
}
