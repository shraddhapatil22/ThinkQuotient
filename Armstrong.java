class Armstrong
{
public static void Main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int num=scn.nextInt();
int sum=0;
temp = num;

while(num>0)
{
int r=num%10;
sum=sum + (r*r*r);
num=num/10;
}
if (temp == sum)
{
System.out.println("Its armstrong number");
}
else
{
System.out.println("its not armstrong number");
}
}
}


