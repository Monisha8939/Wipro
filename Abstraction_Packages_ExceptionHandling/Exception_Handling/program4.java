class InvalidCountryException extends Exception
  {
    public InvalidCountryException(String message) 
    {
        super(message);
    }
}
public class  program4
  {
    public void registerUser(String username, String userCountry) throws InvalidCountryException 
    {
        if (!userCountry.equalsIgnoreCase("India")) 
        {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else
        {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args)
    {
        UserRegistration userReg = new UserRegistration();
        try {
            userReg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) 
          {
            System.out.println("InvalidCountryException:"+e.getMessage());
        }
      try 
        {
            userReg.registerUser("Mini", "India");
        } catch (InvalidCountryException e) 
        {
            System.out.println("InvalidCountryException:"+e.getMessage());
        }
    }
}
