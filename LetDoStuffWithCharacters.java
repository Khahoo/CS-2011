public class LetDoStuffWithCharacters
{
  public static void main(String[]agrs)
  {
    char bigA, smallA ;

    bigA = 65;
    smallA = 97;

    //
    // System.out.println("bigA: " + bigA);
    // System.out.println("smallA: " + smallA);
    //
    // System.out.println((char)0x41);

    // char letter = 'K';
    // System.out.println("My Unicode is " + letter);
    // System.out.println("My next unicode is " + ++letter);

    char randomLetter = (char)('A' + Math.random()*('Z' - 'A'+1));

    System.out.println(randomLetter);

    System.out.println(bigA + smallA);
    System.out.println("" + bigA + smallA);

  }
}
