/**author: N Theja
 * Date: 5-11-2020
 *Desc:accepts a character array and count the number of times each character is present in the array.
 */
package hashcodes;
import java.util.*;
public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] character= {'m','o','n','s','o','o','n'};
		  Map<Character,Integer> charOccurence=countChars(character);
		  System.out.println(charOccurence);
		 }
		 private static Map<Character, Integer> countChars(char[] character) {
		  Map<Character,Integer> countCharacter=new HashMap<Character,Integer>();
		  for(char ch:character) {
		   if(countCharacter.containsKey(ch)) {
		    countCharacter.put(ch,countCharacter.get(ch)+1);
		   }
		   else {
		    countCharacter.put(ch,1);
		   }
		  }
		  for(Map.Entry<Character,Integer> entry: countCharacter.entrySet()) {
		   countCharacter.put(entry.getKey(),entry.getValue());
		  }
		  return countCharacter;
		 }
	}


