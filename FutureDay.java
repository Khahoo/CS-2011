import java.util.Scanner;

public class FutureDay {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What day is it today?");
    System.out.println("Enter 0 for Sunday" +
                       "\n      1 for Monday" +
                       "\n      2 for Tuesday" +
                       "\n      3 for Wednesday" +
                       "\n      4 for Thursday" +
                       "\n      5 for Friday" +
                       "\n      6 for Saturday");
    System.out.print("\ntoday: ");
    int today = input.nextInt();

    if(today < 0)
    {
      System.out.println("Bruuh, you need to leave");
    }

    else if (today > 6)
    {
      System.out.println("Bruuh, you need to leave");
    }

      else
      {
      System.out.print("how many days into the future? ");
      int daysIntoFuture = input.nextInt();

    // int futureDay = (today + daysIntoFuture)
    //                  - ((today + daysIntoFuture)/7 * 7);
      int futureDay = (today + daysIntoFuture) % 7;

      System.out.println("In " + daysIntoFuture +
                      " days it will be day " + futureDay );
      }
    input.close();
  }
}
