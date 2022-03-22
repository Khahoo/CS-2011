import java.util.Scanner;

public class NibbleMonster
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Monster Hungry, need foodddddd");

    System.out.println("Feed monster nibble :333");
    String nibble = input.nextLine();

    String msg="";

    int levelFood = nibble.charAt(0);

    // this switch statement will include number, lowercase, and uppercase
    // To be more specific from numbet 48 to 57 will be the in[ut (1-9)
    // 65 to 70 will be the input for (uppercase A - F)
    // and lastly, 97 to 102 will be the input for (lowercase a -f)
    // this progam will only take the first char of the string and
    // display msg differently
    switch(levelFood) {
     case 48 :
     case 49 :
     case 50 :
     case 51 :
     case 52 :
     case 53 :
     case 54 :
     case 55 :
     case 56 :
     case 57 : msg ="I mean, their not much to expect from you ://"; break;
     case 65 :
     case 66 :
     case 67 :
     case 68 :
     case 69 :
     case 70 : msg = "At least, I don't feel hungry anymore :))";break;
     case 97 :
     case 98 :
     case 99 :
     case 100 :
     case 101 :
     case 102 : msg = "Adopt me, please, UwU *heart* ,<3, :33";break;
     default : msg = "Ewwww, I don't want to eat that piece of trash";break;
     }
     // Default msg is for any char not in the range of a-f

    System.out.println(msg);
    input.close();


    }
}
