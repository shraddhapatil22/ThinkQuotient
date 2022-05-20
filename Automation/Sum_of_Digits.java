class Sum_of_Digits
{
public static void main(String args[])
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int sum=0;
while(n>0)
{
 int r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("The sum of digits "+n+ " is " +sum);
}
}
