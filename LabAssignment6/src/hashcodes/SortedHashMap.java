/** Author: N Theja
 * Date: 5-11-2020
 * Desc:accepts a hash map and return the values of the map in sorted order as a List.
 */
package hashcodes;
import java.util.*;
public class SortedHashMap {
	public static void main(String[] args) {
	HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
	hashMap.put(1,"Theja");
	hashMap.put(2,"Rama");
	hashMap.put(3,"Sita");
	hashMap.put(4,"Hanuma");
	List<String> sortedHashMap=getValues(hashMap);
	sortedHashMap=getValues(hashMap);
	  System.out.println(sortedHashMap);	  
	 }

	 private static List<String> getValues(HashMap<Integer, String> hashMap) {
	  
	  List<String> sortedHashMap=new ArrayList<String>();
	  for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
	   sortedHashMap.add(entry.getValue());
	  }
	  Collections.sort(sortedHashMap);  
	  return sortedHashMap;
}
}
