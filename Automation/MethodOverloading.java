public class MethodOverloading
{  
static int sub(int x, int y)   
{  
return x - y;  
}  
static double sub(double x, double y)   
{  
return x - y;  
}  
public static void main(String[] args)   
{  
int a = sub(45, 23);  
double b = sub(23.67,10.5);  

System.out.println("subtraction : " +a);  
System.out.println("subtraction : " +b);  
}  
}