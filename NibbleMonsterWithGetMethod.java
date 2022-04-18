import java.util.Scanner;

public class NibbleMonsterWithGetMethod
{
  public static void main (String[]agrs)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("How Many? :3");
    int user = input.nextInt();

    for(int i = 0; i < user ; i++ ){
    System.out.println("Gimmie Food :3");
    char offering  = input.next().charAt(0);
    System.out.println(getResponse(offering));
    }
  }

  public static String getResponse(char offering){
    if(offering >= '0' && offering <= '9'){
      return "yummy";
    }
    else if(offering >= 'A' && offering <= 'F' ){
      return "yummy x2";
    }
    else if(offering >= 'a' && offering <= 'f'){
      return "yummy x3";
    }
    else {
      return "ewwww";
    }
  }

}
