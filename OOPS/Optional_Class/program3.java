import java.util.Optional;
class Employee
  {
    String name;
    Employee(String name) {
        this.name=name;
    }
}
class InvalidEmployeeException extends Exception
  {
    InvalidEmployeeException(String msg)
    {
        super(msg);
    }
}
public class  program3
{
    public static void main(String[] args)
  {
        Employee emp=null;
        try 
          {
           Employee validEmp=Optional.ofNullable(emp).orElseThrow(() -> new InvalidEmployeeException("Employee is null"));
           System.out.println(validEmp.name);
          } catch (InvalidEmployeeException e) 
          {
            System.out.println(e.getMessage());
        }
    }
}
