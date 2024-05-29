import java.util.*;
public class xyzzzz
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           System.out.println("Enter n ");
            int n = scanner.nextInt();
            System.out.println("In increasing order :");
            printInc(n);
            System.out.print("Factorial of n : ");
            System.out.println(facttorial(n));
            System.out.print("Sum of n nos. : ");
            System.out.println(sum(n));
            System.out.print("Fibonacci series of n : ");
            System.out.println(fibonacci(n));
        }
        public static void printInc(int n)
        {
            if(n==1)
            {
                System.out.println(1);
                return ;
            }
            printInc(n-1);
            System.out.println(n);
        }
        public static int facttorial(int n)
        {

            if(n==0)
            {
               return 1;
            }
            //int f1=facttorial(n-1); fact = n*f1;
            int fact = n * facttorial(n-1);
            return fact;
        }
        public static  int sum(int n)
        {
            if(n==0)
            {
                return  0 ;
            }
            int s = n + sum(n-1);
            return  s;
        }

        public static int fibonacci(int n)
        {
            int n1 = 0;
            int n2 = 1;
            if(n==0 || n==1)
            {
                return n;
            }
            int fact = fibonacci(n-1)+ fibonacci(n-2);
            return  fact;
        }

    }



