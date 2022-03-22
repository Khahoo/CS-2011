import java.util.Scanner;
/*Jacob Hertz
Khanh Le
CS 2011
Section 06*/
/*This is a program that will give the output of the number of pizza slices
after all the pizzas have been evenly distributed. It will use the user's input
from the number of pizzas, number of slices per pizza, and the number of people
to compute the answer.*/

public class PizzasAndPeople
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("How many pizzas? ");
    int numWholePizzas = input.nextInt();

    System.out.println("How many slices per pizza? ");
    int numSlicesOfPizza = input.nextInt();

    System.out.println("How many people?");
    int numPeople = input.nextInt();

    int numSlicesLeftOver = ((numWholePizzas * numSlicesOfPizza)% numPeople);



    System.out.println("If you split all this pizza evenly among " + numPeople +
    " you will recieve " + numSlicesLeftOver + " slices left over.");
  }
}
