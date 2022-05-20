class Fibonacci_Series
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the first number");
int a=scn.nextInt();
System.out.println("Enter the second number");
int b=scn.nextInt();
System.out.println("Enter the no of series");
int n=scn.nextInt();
System.out.print(" "+a);
System.out.print(" "+b);

for(int i=1;i<=n;i++)
{
int c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}
