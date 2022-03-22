import java.util.Scanner;

public class StringBeans
{
  public static void main(String[]agrs)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your first initial ?");
    char initial = input.next().charAt(0);

    System.out.println(initial);

    System.out.println("Enter your name and year of birth?");
    System.out.println("Example : Kahnh2003");
    String nameAndYear = input.next();

    String birthYearString = nameAndYear.substring(nameAndYear.length());
    int birthYear = Integer.parseInt(birthYearString);
    System.out.println(birthYear);
  }
}
