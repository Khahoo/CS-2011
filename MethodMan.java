public class MethodMan {
  public static void main (String[] args) {
    //System.out.println("Hello World");
    displayHelloWorld();
    System.out.println("------");
    displayHelloWorld(5);
    System.out.println("------");
    getHelloWorldMsg();

  }

  public static void displayHelloWorld() {
    //                 get the String from getHelloWorldMsg() first
    //                         v
    //  and then pass it       v
    //  to prinltn method      v
    //           v             v
    //           v             v
    System.out.println(getHelloWorldMsg());
    return; // <-- doesn't need to be here because method is void
  }

  public static void displayHelloWorld(int times) {
    for (int i = 0; i < times; i++) {
      displayHelloWorld();
      // return; // <-- what happens if you uncomment this line?
    }
  }

  public static String getHelloWorldMsg() {
    return "Hello World!";
    // return null; // <-- return the correct sort of nothing
  }
}
