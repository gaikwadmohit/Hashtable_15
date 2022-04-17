package hashtable;

public class Hashtable_Main {
	
	    public static void main(String[] args) {
	        Implementation_Linkedlist<String, Integer> hash = new Implementation_Linkedlist<String, Integer>();
	        String message = "“Paranoids are not\r\n"
	        		+ "paranoid because they are paranoid but\r\n"
	        		+ "because they keep putting themselves\r\n"
	        		+ "deliberately into paranoid avoidable\r\n"
	        		+ "situations”";
	        String[] messageArray = message.toLowerCase().split(" ");

	        for(String word: messageArray) {
	           
	            Integer value =  hash.get(word);
	           
	            if( value == null)
	                value = 1;
	            else
	                
	                value = value + 1;
	            hash.add(word , value);
	        }
	        System.out.println(hash);
	    }
	}