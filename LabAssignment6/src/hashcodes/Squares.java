/**Author: N Theja
 * Date:5-11-2020
 * Desc:accepts an array of numbers and returns the numbers and their squares in Hashmap
 */
package hashcodes;
import java.util.*;
public class Squares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sqNumber[]= {4,5,3,12,10};
		  Map<Integer,Integer> squareNum=getSquares(sqNumber);
		  System.out.println(squareNum);		  
		 }

		 private static Map<Integer, Integer> getSquares(int[] sqNum) {		  
		  Map<Integer,Integer> squareMap=new HashMap<>();
		  for(int square:sqNum) {
		   squareMap.put(square,square*square);
		  }
		  return squareMap;
	}
}
