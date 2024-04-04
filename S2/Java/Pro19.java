import java.util.*;

class AuthException extends Exception{
   public AuthException(String input){
      super(input);
   }
}

public class Pro19{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      String userName = "MBITS";
      String pwd = "mbits";
      try{
        System.out.print("Enter UserName: ");
        String nameInput = input.next();
        System.out.print("Enter Password: ");
        String passwordInput = input.next();
        
        if(nameInput.equals(userName) && passwordInput.equals(pwd)){
           throw new AuthException("Valid User");
        }else{
           throw new AuthException("Not Valid User");
        }
      }catch(AuthException e){
         System.out.println(e.getMessage());
      }
   }
}
