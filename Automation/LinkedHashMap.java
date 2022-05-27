package Hashmap;

public class LinkedHashMap {

    public static void main(String[] args) 
    {
      
        LinkedHashMap evenNumbers = new LinkedHashMap();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);

      
        LinkedHashMap numbers = new LinkedHashMap();
        ((LinkedHashMap) numbers).put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);
    }

	void put(String string, int i) {
		
	}
}
