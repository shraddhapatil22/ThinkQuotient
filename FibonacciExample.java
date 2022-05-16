public class FibonacciExample
{             
public static void main(String[] args)
{
// a and b will always contain the last two terms
// c will always contain the next term
int a = 0, b = 1, c; 
int n = 10; //We are calculating the series till the 6th term.  
System.out.println("The first " + n + " terms of the Fibonacci series are:");
for(int j = 0; j < n; j++)
{
               if (j == 0)
                              System.out.print(a + " ");
               else if( j == 1)
                               System.out.print(b + " ");
               else
                               {
                                              //calculating next term
                                              c = a + b;
                                              System.out.print(c + " ");
                                              //Updating the last two terms
                                              a = b;
                                              b = c;
                               }
}
}
}