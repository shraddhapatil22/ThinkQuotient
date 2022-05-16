Class Fibonaocci
{
public static void main(String[] args)
{
 java.util.Scanner sc=new java.util.Scanner(System.in);
 System.out.println("Enter the first number");
int a=scn.nextInt();
System.out.println("Enter the second number");
int b=scn.nextInt();
System.out.println(Enter no.of series ");
int n=scn.nextInt();
System.out.print(a+" ");
System.out.print(b+" ");

for(int i=1;i<=n;i++)
{
 int c=a+b;
System.out.println(c+" ");
a=b;
b=c;
}
}
}


