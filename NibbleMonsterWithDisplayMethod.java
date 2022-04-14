import java.util.Scanner;

public class NibbleMonsterWithDisplayMethod
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("How Many? :3");
    int user = input.nextInt();

    for(int i = 0; i < user ; i++ ){
    System.out.println("Gimmie Food :3");
    char offering  = input.next().charAt(0);
    displayResponse(offering);
    }
  }

    public static void displayResponse(char offering){
      if(offering >= '0' && offering <= '9'){
        System.out.println("yummy");
      }
      else if(offering >= 'A' && offering <= 'F' ){
        System.out.println("yummy x2");
      }
      else if(offering >= 'a' && offering <= 'f'){
        System.out.println("yummy x3");
      }
      else{
        System.out.println("Ewwwww");
      }
    }

}
