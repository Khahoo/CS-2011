/*
 * Computes human age equivalent of pets...
 * (NOTE: not highly scientific!)
 */

import java.util.Scanner;

public class PetToHumanYearsConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int PET_TO_HUMAN_YEARS_CONVERSION_FACTOR = 7;
    //PET_TO_HUMAN_YEARS_CONVERSION_FACTOR = 8; <-- this won't work because
    //                                          we can't change value of a
    //                                          constant

    System.out.println("What is your pet's name?");
    String petName = input.next();

    System.out.print("How old is " + petName + "? ");
    double petYears;
    petYears = input.nextDouble();

    System.out.println("What specie is " + petName + "? ");
    System.out.println ("Enter a * :" +
                        "\n\t0 = Dog" +
                        "\n\t1 = Cat" +
                        "\n\t2 = Human" +
                        "\n\t3 = Bird");
    int petSpecie = input.nextInt();

    double humanAgeEquivalent = petYears * PET_TO_HUMAN_YEARS_CONVERSION_FACTOR;

    if(petYears < 0)
    {
      System.out.println("Stfu, age must be positive ! ");
      System.exit(1);
    }

    if(petYears > 110)
    {
      System.out.println("Bruhh, are you even serious !");
      System.out.println("Get out now");
      System.exit(2);
    }

    if(petSpecie < 0 || petSpecie > 3)
    {
      System.out.println("What kind of animal is that ?");
      System.exit(3);
    }

    System.out.println(petYears + " is " +
                       humanAgeEquivalent + " in human years.");

    input.close();
  }
}
