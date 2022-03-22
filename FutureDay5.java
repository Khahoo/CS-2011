import java.util.Scanner;
// khanh and jonathan
// this program will tells the user what day in the futere depend on the user
// input, for example if user in put is monday and they want to know what day
// will it be in 4 days, the program will caculate and display friday as the
// result
public class FutureDay5 {
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
    System.out.print("how many days into the future? ");
    int daysIntoFuture = input.nextInt();
    int futureDay = (today + daysIntoFuture) % 7;
    int weeks, extraDays;
    weeks = daysIntoFuture / 7;
    extraDays = daysIntoFuture % 7;
    // We changedfrom If-else statement to switch, we have like 6 cases of them
    // represent each day of the weeks, and we use futureDay
    // which is how many day into the future to let the program known which case
    // to use.
  String msg = "";

  switch(futureDay) {
    case 6 : msg = "Weekend";break;
    case 5 : msg = "Workday";break;
    case 4 : msg = "Workday";break;
    case 3 : msg = "Workday"; break;
    case 2 : msg = "Workday"; break;
    case 1 : msg = "Workday"; break;
    case 0 : msg = "Weekend"; break;
  }

  System.out.println("In "  + extraDays +
                     " it will be " + msg);

    input.close();
  }
}
