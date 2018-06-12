package com.company;


import org.w3c.dom.ranges.Range;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int sum = firstNum + secondNum;

        System.out.println(sum);

*/

       //Task 1.2
     /*   Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 100;
        int last = number % 10;

        boolean result = first == last;

        System.out.println(result);

       */

     //Task 1.3
      /*  Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean result = false;

        char[] letter = word.toUpperCase().toCharArray();

        for (int i = 0; i < letter.length; i++)
        {
            char z = letter[i];
            if (z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U')
                result = true;
        }

        System.out.println(result);
        */

      //Task 1.4 - Range overlap
      /*  Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int sumx = x2-x1;
        int sumy = y2-y1;

        if(sumx<sumy) {
            for (int i = y1; i <= y2; i++) {
                if ((x1 == i) || (x2 == i)) {
                    result = true;
                    break;
                }
            }
        }
        else
        {
            for (int i = x1; i <= x2; i++) {
                if ((y1 == i) || (y2 == i)) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println(result);
        */


      //Task 1.5 - Kaladont
       /* Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        char[] l1 = word1.toCharArray();
        char[] l2 = word2.toCharArray();

        boolean result = false;

        if (l1[l1.length-2] == l2[0] && l1[l1.length-1] == l2[1])
                        result = true;


        System.out.println(l1[l1.length-2]);
        System.out.println(l2[0]);
        System.out.println(l1[l1.length-1]);
        System.out.println(l2[1]);
        System.out.println(result);
        */

    }
}
