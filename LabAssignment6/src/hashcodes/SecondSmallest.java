/**Author: N Theja
 * Date:5-11-2020
 *Desc:accepts an array of integer elements and return the second smallest element in the array
 */
package hashcodes;
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numArray[]= {1,9,5,7,3};
		  int secondSmallestElement=getSecondSmallest(numArray);
		  System.out.println("The Second Smallest element in the list is : "+secondSmallestElement);
		 }

		 private static int getSecondSmallest(Integer[] numArray) {
		  List<Integer> element=Arrays.asList(numArray);
		  Collections.sort(element);
		  System.out.println("Array after sorting:: "+element);
		  Integer secondSmallest=element.get(1);
		  return secondSmallest;

	}

}
