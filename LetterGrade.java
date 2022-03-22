// Khanh and Jonathan
// This program let the user know what letter grade they got when the user enter
// their percent of their grade for ex if the user input is 90 the program will
// print out letter A grade as the result
import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your score out of 100? ");
    int score = input.nextInt();
// We fixed this by changing the position of the number because if score > 60 is
// the first statement then when the user input is 90 it will still be C because
// 90 > 60 which is true
    String letterGrade;
    if (score >= 90)
      letterGrade = "A";
    else if (score >= 80)
      letterGrade = "B";
    else if (score >= 70)
      letterGrade = "C";
    else if (score >= 60)
      letterGrade = "D";
    else
      letterGrade = "F";

    System.out.println("Your grade is " + letterGrade);
  }
}
