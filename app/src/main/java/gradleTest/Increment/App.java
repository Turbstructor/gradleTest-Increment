/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleTest.Increment;

import java.util.Scanner;

public class App {
    public static int total;
    public static int i;

    public static int getSum(int n)
    {
        total = 0;
        i = n;

        if(i > 0)
        {
            while(i > 0)
            {
                total += i;
                i -= 1;
            }
        }
        else
        {
            while(i < 0)
            {
                total += i;
                i += 1;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Sum of numbers from 1 to 10 is " + getSum(num));
    }
}
