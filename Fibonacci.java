import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args)
    {

        int n, t1 = 0, t2 = 1;
        Scanner s= new Scanner(System.in);
       System.out.println("Enter a value: ");
        n= s.nextInt();   
        System.out.println("Fibonacci Series upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}