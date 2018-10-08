/**
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 /**
 
 *  1) public void oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  7) sumN            - uses a while loop to find and return the sum of the first 
 *                       n integers. 
 *                       
 *  8) perfectSquaresF - uses a for loop to print the first n perfect squares.
 *
 *  9) sumSquaresW     - uses a while loop find and return the sum of the first n 
 *                       perfect squares.
 *
 * 10) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 * 11) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 13) divBy5or7Sum    - uses a while loop to find and return the sum of all values in 
 *                       the set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 14) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *                       printed, and if the number is divisible by 5, "buzz" should
 *                       be printed. Sample output:
 *
 *                       1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *                       
 * 15) sumDigits       - uses a loop to find and return the sum of the digits in an int.
 *
 * 16) countEvens      - uses a loop to count the number of even digits in an int.
 *
 * 17) hasDigit        - uses the appropriate type of loop to return true if a number n
 *                       contains the digit d and false otherwise.
 *
 * 18) moreEvens       - returns true if a number n has more even digits than odd digits
 *                       and false otherwise.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        for (int i = 1; i <= 30; i ++) {
            System.out.print(i + " ");
        }
    }
    
    public static void oneToThirtyW()
    {
        int i = 1;
        
        while (i <= 30)
        {
            System.out.print(i + " ");

            i++;
        }
    }
        
    public static void twentyToZeroF()
    {
        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    public static void twentyToZeroW()
    {
        int i = 20;
        
        while (i >= 0)
        {
            System.out.print(i + " ");
            
            i--;
        }
    }
    
    public static void countMtoN(int m, int n)
    {
        int i = m;
        
        while (i <= n)
        {
            System.out.print(i + " ");
            
            i++;
        }
    }
    
    public static void sumN(int n)
    {
        int i = 1;
        int sum = 0;
        
        while (i <= n)
        {
            sum += i;
            
            i++;
        }
        System.out.print(sum);
    }
    
    public static void perfectSquaresF(int n)
    {
       int sum = 0;
        
       for (int i = 1; i <= n; i++)
       {
           sum += i * i;
       }
       System.out.print(sum);         
    }
    
    public static void sumSquaresW(int n)
    {
        int i = 1;
        int sum = 0;
        
        while (i <= n)
        {
            sum += i * i;
            
            i++;
        }
    }
    
    public static void iLoveJava(int n)
    {
        int i = 1;
        
        while (i<=n) {
            System.out.print("I love Java!");
            
            i++;
        }
    }
    
    public static void divBy2and9()
    {
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 0 && i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void divBy3and8()
    {
        int i = 1;
        
        while (i <= 100) {
            if (i % 3 == 0 && i % 8 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void divBy5or7Sum()
    {
        int i = 1;
        
        while (i <= 10000) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void bizzBuzz()
    {
        int i = 1;
        
        while (i >= 1) {
            if (i % 3 == 0) {
                System.out.println("Bizz");
            }
            
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
    
    public static void sumDigits(int d)
    {
       int i = d;
       int sum = d;
       while (i >= 1)
       {
           sum = d + i;
           
           i++;
       }
    }
    
    public static void countEvens()
    {
        int i = 1;
        
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void hasDigit(int d)
    {
        int i = 1;
        int sum = 1;
        
        while (i >= 1) {
            if (true) {
                System.out.print(true);
            } else {
                System.out.print(false);
            }
        }
    }
    
    public static void moreEvens()
    {
         int i = 1;
         
         while (i >= 1) {
             if (i % 2 == 0 || i % 3 == 0) {
                 System.out.print(true);
               } else {
                 System.out.print(false);
             }
         }
    }
    
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        sumN(1);
        countMtoN(1, 5);
        twentyToZeroW();
        twentyToZeroF();
        countMtoN(1, 3);
        sumSquaresW(1);
        perfectSquaresF(1);
        sumN(1);
        iLoveJava(1);
        divBy2and9();
        divBy3and8();
        divBy5or7Sum();
        bizzBuzz();
        moreEvens();
        hasDigit(5);
        countEvens();
        sumDigits(1);
        // test your methods here
    }
 }
 