class Strong_number
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number to check that number is strong or not");
int num=sc.nextInt();
int temp=num;
sum=0;
while(num>0)
{
int r=num%10;
int i=1;
int fact=1;
while(i<=r)
{
fact=fact * i;
i++;
}
sum=sum+fact;
num=num/10;
}
if(temp==sum)
{
System.out.println("Number is strong");
}
System.out.println("Number is not strong");
}
}
