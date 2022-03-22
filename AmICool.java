public class AmICool
{
  public static void main(String[]args)
  {

    boolean isCool1, isCool2, isCool3;

    isCool1 = Math.random() < 0.05;
    isCool2 = Math.random() < 0.08;
    isCool3 = Math.random() < 0.06;

    if(isCool1 && isCool2 && isCool3) {
      System.out.println("Icey Cold");
      // if(isCool1 && isCool2){
      //   System.out.println("You impressed 2 judges");
      // }
    //   else if(isCool1 && isCool3) {
    //     System.out.println("You impressed 2 judges");
    //   }
    //   else if(isCool2 && isCool3) {
    //   System .out.println("You impressed 2 judges");
    // }
    //   else {
    //     System.out.println("You impressed 1 judge");
    //   }
    }

    else if(isCool1 || isCool2 || isCool3) {
      System.out.println("Icey Warm");
      if(isCool1 && isCool2){
        System.out.println("You impressed 2 judges");
      }
      else if(isCool1 && isCool3) {
        System.out.println("You impressed 2 judges");
      }
      else if(isCool2 && isCool3) {
      System .out.println("You impressed 2 judges");
    }
      else {
        System.out.println("You impressed 1 judge");
      }
    }
    else {
      System.out.println("NO!");
    }

  }
}
