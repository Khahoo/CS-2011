import java.util.Scanner;

public class FeetToMeters
{
  public static void main (String[] arg)
  {
    Scanner input = new Scanner(System.in);

    final double ONE_FOOT_TO_METER = 0.305;

    System.out.println("Enter a Value for feet :");
    double foot = input.nextDouble();
    double meter = foot * ONE_FOOT_TO_METER;
    System.out.println(foot + " feet is " + meter + " meters. ");

    input.close();
  }
}
