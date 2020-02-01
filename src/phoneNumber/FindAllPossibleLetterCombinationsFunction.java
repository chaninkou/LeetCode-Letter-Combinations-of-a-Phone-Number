package phoneNumber;

import java.util.LinkedList;
import java.util.List;

// Linkedlist is good at removing and adding, but search worst time is O(n)
// ArrayList is good at searching in O(1), but removing worst time is O(n) if it needs to remove the last element
public class FindAllPossibleLetterCombinationsFunction {
    public List<String> letterCombinations(String digits) {
        // Using LinkedList cause it can also act as a queue where ArrayList can't
        LinkedList<String> result = new LinkedList<>();
        
        // If the string is empty, then just return empty list
        if(digits.length() == 0){
            return result;
        }
        
        // Add an empty string to set up, we need this since i starts from 0
        result.add("");
        
        // Mapping of all of the numbers to characters, access the letter that they represent by their index
        // No need to do = new String[]{...};
        String[] char_map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        // Go through digit by digit
        for(int i = 0; i < digits.length(); i++){
            // get the integer value of current character of digits, 
            // or else it will be 50 instead of 2 since '2' is 50
        	// Character.getNumericValue() could work too
            int index = digits.charAt(i) - '0';
            
            // If there is empty string (thats why we add empty string at start) so add one letter, 
            // then there is only one letter in the queue add one letter again, 
            // then two letter in the queue  and so on
            
            // Example: a->b->c , this is after first i iteration
            // then: peek() will check the length to be 1 == 1
            // so remove a, use a to add
            // so, b -> c -> ad -> ae -> af
            // then: peek() will check the length to be 1 == 1
            // so c -> ad -> ae -> af -> c -> bd -> be -> bf 
            // then: peek() will check the length to be 1 == 1
            // so c -> ad -> ae -> af -> c -> bd -> be -> bf -> cd -> ce -> cf 
            // This while loop will keep going until we get the correct length
            while(result.peek().length() == i){
                // remove() in LinkedList is like the pop() value from the queue, first it will be "", then one letter, then two letter, and so on
                String permutation = result.remove();
                
                // We will add each letter from the current map index into the queue, which is 'a','b','c' or so on
                for(char letter : char_map[index].toCharArray()){
                	
                	// Whatever in the front of the linked list will get added with the combination
                    result.add(permutation + letter);
                }
            }
            
        }
        
        return result;
    }
}
