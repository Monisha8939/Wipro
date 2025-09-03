class NegativeValueException extends Exception
  {
    public NegativeValueException(String message) 
    {
        super(message);
    }
}
class OutOfRangeException extends Exception
  {
    public OutOfRangeException(String message)
    {
        super(message);
    }
}
import java.util.Scanner;
public class program3
  {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        final int NUM_STUDENTS=2;
        final int NUM_SUBJECTS=3;

        try {
            for (int i=1;i<= NUM_STUDENTS;i++) 
            {
                System.out.println("Enter name of student " + i + ":");
                String name = scanner.nextLine();

                int[] marks = new int[NUM_SUBJECTS];
                int sum = 0;

                for (int j = 0; j < NUM_SUBJECTS; j++) {
                    System.out.println("Enter mark"+(j+1)+"for"+name+":");
                    String input = scanner.nextLine();
                    int mark;
                    try
                    {
                        mark=Integer.parseInt(input);
                    } catch (NumberFormatException e) 
                      {
                        throw new NumberFormatException("Invalid input. Please enter an integer.");
                    }

                    if (mark<0) 
                    {
                        throw new NegativeValueException("Negative marks not allowed.");
                    }

                    if (mark>100) 
                    {
                        throw new OutOfRangeException("Marks must be between 0 and 100.");
                    }
                    marks[j]=mark;
                    sum +=mark;
                }
                double avg=sum/(double) NUM_SUBJECTS;
                System.out.println("Average marks of "+name +":"+avg);
            }

        } catch (NumberFormatException e)
          {
            System.out.println("Error"+ e.getMessage());
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println("Custom Error"+ e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
