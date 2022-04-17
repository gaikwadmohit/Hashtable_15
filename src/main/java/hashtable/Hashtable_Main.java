package hashtable;

public class Hashtable_Main {
	
	    public static void main(String[] args) {
	    	
	        Implementation_Linkedlist<String, Integer> hashImpl = new Implementation_Linkedlist();
	      
	        String message = "Paranoids are not paranoid because they are paranoid but " +
	                "because they keep putting themselves deliberately into"
	                + " paranoid avoidable situations";

	        String[] msgarray = message.toLowerCase().split(" ");

	        for(String word: msgarray) {
	            
	            Integer value =  hashImpl.get(word);
	           
	            if( value == null)
	                value = 1;
	            else
	                
	                value = value + 1;
	            hashImpl.add(word , value);
	            System.out.println("Value = "+value);
	        }
	        System.out.println(hashImpl);
	        hashImpl.remove("avoidable");
	        System.out.println(hashImpl);
	    }
	}