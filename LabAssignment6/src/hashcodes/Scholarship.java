/**Author: N Theja
 * Date:5-11-2020
 * Desc:accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
 */
package hashcodes;
import java.util.*;
public class Scholarship {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,Integer> student=new HashMap<>();
		  student.put(1, 87);
		  student.put(2, 99);
		  student.put(3, 77);
		  student.put(4, 80);
		  Map<Integer,String> medalDetails=getStudents(student);
		  System.out.println(medalDetails);
		 }

		 private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		  Map<Integer,String> medalDetails=new HashMap<>();
		  for(Map.Entry<Integer, Integer> entry:student.entrySet()) {
		   if(entry.getValue()>90) {
		    medalDetails.put(entry.getKey(),"Gold Medal");
		   }
		   else if(entry.getValue()>=80 && entry.getValue()<90) {
		    medalDetails.put(entry.getKey(),"Silver Medal");
		   }
		   else if(entry.getValue()>=70 && entry.getValue()<80) {
		    medalDetails.put(entry.getKey(),"Bronze Medal");
		   }
		   
		  }
		  return medalDetails;
	}

}
