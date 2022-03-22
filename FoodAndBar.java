import java.util.Scanner;

public class FoodAndBar
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);

  //  int foo = 1;
    boolean isFooSmallerThanBar;

    //foo = true;
    int foo = input.nextInt();
    double bar = input.nextDouble();

    //if(foo < bar)
      //isFooSmallerThanBar = true;
    //else
      //isFooSmallerThanBar = false;

      isFooSmallerThanBar = foo < bar;

    System.out.println(isFooSmallerThanBar);
  }
}
