// khanh and jonathan
// In this problem we use 13 different case for every month and 1 case for
// the user when the number is not from 1 to 12. This program will tells
// what season base on the month the user entered. for ex if the user input
// is 7, the program will print July and in the summer
import java.util.Scanner;

public class Seasons {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Month As Number: ");
    int month = input.nextInt();

    String msg = "";

    switch(month) {
      case 12 : msg = "December"; break;
      case 11 : msg = "November"; break;
      case 10 : msg = "October"; break;
      case 9 : msg =  "September"; break;
      case 8 : msg =  "August"; break;
      case 7 : msg = "July"; break;
      case 6 : msg = "June"; break;
      case 5 : msg = "May"; break;
      case 4 : msg = "April"; break;
      case 3 : msg = "March"; break;
      case 2 : msg = "February"; break;
      case 1 : msg = "January"; break;
      default : msg = "Enter a number between 1 - 12";
    }

    String season = "";

    switch(month) {
      case 12 : season = " is in the Winter";break;
      case 11 :
      case 10 :
      case 9 : season = " is in the Autumn";break;
      case 8 :
      case 7 :
      case 6 : season = " is in the Summer";break;
      case 5 :
      case 4 :
      case 3 : season = " is in the Spring";break;
      case 2 :
      case 1 : season = " is in the Winter";break;
    }
    System.out.println(msg + season);
  }
}
