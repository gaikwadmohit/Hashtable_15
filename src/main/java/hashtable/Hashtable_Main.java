package hashtable;

public class Hashtable_Main {
	
	    public static void main(String[] args) {
	        Implementation_Linkedlist<String, Integer> hash = new Implementation_Linkedlist<String, Integer>();
	        String message = "India is a great country where people speak different languages but the national language is Hindi. India is full of different castes, creeds, religion, and cultures";
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