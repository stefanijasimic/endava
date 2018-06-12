package Task1;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int sum = firstNum + secondNum;
            int diff = firstNum - secondNum;

            System.out.println(sum);
            System.out.println(diff);
   }

}
