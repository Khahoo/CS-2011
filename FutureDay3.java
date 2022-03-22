import java.util.Scanner;
// khanh and jonathan
// this program will tells the user what day in the futere depend on the user
// input, for example if user in put is monday and they want to know what day
// will it be in 4 days, the program will caculate and display friday as the
// result
public class FutureDay3 {
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
// for this problem, we use if and else if statement in order to change number
// into english name, so if the futureDay = 0 or any number between 0 - 6, it
// will print the english name based on the number the futureDay got, if future
// day is 2, it will dispaly Tuesday and so on
    if(futureDay == 0){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Sunday" );
    }
    else if(futureDay == 1){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Monday" );
    }
    else if(futureDay == 2){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Tuesday" );
    }
    else if(futureDay == 3){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Wednesday" );
    }
    else if(futureDay == 4){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Thursday" );
    }
    else if(futureDay == 5){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Friday" );
    }
    else if(futureDay == 6){
      System.out.println("In " + weeks + " weeks and " + extraDays +
                        " days it will be day " + "Saturday" );
    }
    // System.out.println("In " + weeks + " weeks and " + extraDays +
    //                  " days it will be day " + futureDay );
    input.close();
  }
}
