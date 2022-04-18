import java.util.Scanner;

public class ICanHazString
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner(System.in);
    // get some text from the user
    String text= getTexFromUser(input);

    int numVowels, numConsonants;
    numVowels = countVowels(text);
    numConsonants = countConsonants(text);
    // tell user how many vowels are in that text
    System.out.println("This text has " + numVowels + " vowels.");
    // tell user how many consonants are in that text
    System.out.println("This text has " + numConsonants + " consonants.");
  }


  public static String getTexFromUser(Scanner input)
  {
    System.out.println("Please enter something!");
    String text = input.nextLine();
    return text;
  }


  public static int countVowels(String str)
  {
    int numVowels = 0;
    // examine every character in str
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      // if it is a vowel
      if(isVowel(ch)){
        // increse numVowels by 1
        numVowels ++;
      }
    }
    return numVowels;
  }


  public static boolean isVowel(char c)
  {
    switch(Character.toUpperCase(c)){
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      case 'Y': return true;
    }
    return false;
  }

  public static boolean isConsonants(char c)
  {
    return Character.isLetter(c) && !isVowel(c);
  }


  public static int countConsonants(String str)
  {
    int numConsonants = 0;
    // examine every character in str
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      // if it is a consonants
      if(isConsonants(ch)){
        // increse numConsonants by 1
        numConsonants ++;
      }
    }
    return numConsonants;
  }

}
