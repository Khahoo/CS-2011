/* *
 * Demonstration of how to read a word, an integer, and a floating point
 * number from user input.
 *
 * NOTE: this program expresses disapproval regardless of input -- don't
 *       take it personally!
 *
 * ALSO: methods next(), nextInt() and nextDouble() are token-based!
 *       What happens when user responds to the first prompt with
 *       two words (or two tokens)? See comments in code...
 */
import java.util.Scanner;

public class CrankyInputMonster {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What does your mom call you? ");
    String name = input.next(); // This call to next() will "swallow"
                                // one word. If the user enters two
                                // or more words, what happens to the
                                // ones that are not consumed by the
                                // Scanner? They stay in the buffer.

    //input.reset(); You might think that this would clear the buffer,
    //               but it does not.

    input.nextLine(); // But this will work, because the nextLine() method
                      // is not token-based -- it will swallow all the tokens
                      // till the end of the line. (In this case we are not
                      // saving these extra words anywhere, but we could.)
                      // And what if the user only entered one word, the one
                      // that was swallowed by next() already? Not a problem:
                      // nextLine() will just swallow the... well, nothing --
                      // technically the empty string. When we use nextLine(),
                      // the Scanner closes its gob whenever it encounters
                      // end-of-line.

    System.out.print(name + "... ");
    System.out.println("Yikes! Sorry your mom does not love you...");

    System.out.print("What is your favorite (whole) number? ");
    int favoriteNumber = input.nextInt(); // If the user entered two numbers
                                          // the second one would be swallowed
                                          // by nextDouble() below.
    System.out.println("How original!");

    System.out.print("Say, " + name + ", what's your GPA? ");
    double gpa = input.nextDouble();
    System.out.println("Yeah, I wouldn't expect much of you...");

    input.close();
  }
}
