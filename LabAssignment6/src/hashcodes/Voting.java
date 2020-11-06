/**Author: N Theja
 * Date:5-11-2020
 *Desc: accepts id anf if age>18 then that person is eligible
 */
package hashcodes;
import java.util.*;
public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		  voterList.put(1, 18);
		  voterList.put(2, 59);
		  voterList.put(3, 20);
		  voterList.put(4, 15);
		  List<Integer>voterDetails=votersList(voterList);
		  System.out.println(voterDetails);
		 }
		 private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		  List<Integer> voterDetails=new ArrayList<>();
		  System.out.println("The eligible person's ID are:");
		  for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {		 
			  if(entry.getValue()>18) {			 
		    voterDetails.add(entry.getKey());
		   }
		  }
		  return voterDetails;
	}

}
