package Com.basic;

public class ArrayProgram {

	public static void main(String[] args) {
		int[] ar= {2,4,23,20,29,72,9,73,65};
		
		int bigger=0;
		for(int a:ar)
		{
			if(bigger<a)
			{
				bigger=a;
			}
		}
		System.out.println("Bigger:-"+bigger);

	}

}