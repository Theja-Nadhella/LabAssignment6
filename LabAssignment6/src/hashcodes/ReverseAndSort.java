/**Author: N Theja
 * Date:5-11-2020
 *Desc:accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 */
package hashcodes;
import java.util.*;
public class ReverseAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> result=new ArrayList<>(Arrays.asList(3,6,1,9,4));
		  List<Integer> reverse = getSorted(result);
		  System.out.println("Printing reverse array in sorted manner:: "+reverse);
		 }			
		 private static List<Integer> getSorted(List<Integer> result) {
		  List<Integer> reverseSorted=new ArrayList<Integer>(result);
		  Collections.reverse(reverseSorted);
		   for(int i=0;i>result.size();i++) {
		    reverseSorted.add(i);
		   }
		   System.out.println("Reverse of input array "+reverseSorted);
		   Collections.sort(reverseSorted);
		   for(int i=0;i>result.size();i++) {
		    reverseSorted.add(i);
		   }
		   return reverseSorted;

	}

}
