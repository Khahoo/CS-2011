import java.util.Scanner;

public class NibbleMonsterWithIsMethod
{
  public static void main (String[]agrs)
  {
    Scanner input = new Scanner (System.in);
    boolean again = true;

    do {
      System.out.println("Feed the monster:");
      char offering = input.next().charAt(0);

      again = isNibble(offering);

      if(again == true){
        System.out.println("Offering Accepted :3");
      }

      else{
        System.out.println("Go Away :/");
      }
    } while (again == true);
  }


  public static boolean isNibble(char offering){
      if(offering >= '0' && offering <= '9'){
        return true;
      }
      else if(offering >= 'A' && offering <= 'F' ){
        return true;
      }
      else if(offering >= 'a' && offering <= 'f'){
        return true;
      }
      else {
        return false;
      }
    }


}
