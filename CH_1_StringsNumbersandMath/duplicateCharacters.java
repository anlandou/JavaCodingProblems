/*“Counting duplicate characters: Write a program that counts duplicate characters from a given string.”

Excerpt From: Anghel Leonard. “Java Coding Problems.” Apple Books. */

/*MY SOLUTION ===== Works only for hello , not Antananarivo*/ 

public class duplicateCharacters{

    public static void main (String args []){
    
    String noun = "Hello"; 
    String city = "Antananarivo"; 
    
    int counter = 0; 
    
       for(int i = 0; i < noun.length(); i++){
    	   
         char temp  = noun.charAt(i); 
         
//         int j = noun.length()-1; 
           
            for(int j = 0; j < noun.length(); j++ ) {
        	 if(temp == noun.charAt(j) && i !=j) {
        		 
        		 counter++;
        	 }
            }
       }
      
       System.out.println("There are " + counter + " duplicate characters"); 
    }

}