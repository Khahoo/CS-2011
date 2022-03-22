

import java.util.Scanner;

public class PizzasAndPeopleWithInputValidation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many pizzas? ");
    int Pizzas = input.nextInt();
    if(Pizzas < 0) {
      System.exit(1);
    }
    System.out.print("How many slices per pizza? ");
    int SlicesPerPizzas = input.nextInt();
    if(SlicesPerPizzas < 0) {
      System.exit(2);
    }
    System.out.print("How many people? ");
    int People = input.nextInt();
    if(People < 0) {
      System.exit(3);
    }

    int Leftover = (Pizzas*SlicesPerPizzas)%People;

    System.out.println("If you split all this evenly pizza among " + People + " people, ");
    System.out.println("you will have " + Leftover + " slices left over.");
    System.out.println("Mmmm! Cold Pizza...");

    input.close();

  }
}
