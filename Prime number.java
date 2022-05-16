class Prime number
{
 public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
for(int i=2;i<n;i++)
{
 if(n%i==0)
{
 a=0;
break;
}
}
if(a==1)
{
System.out.println("Number "+n+ " is a prime number");
}
else
{
System.out.println("Number "+n+ " is a not prime number");
}
}