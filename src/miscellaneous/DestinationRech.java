package miscellaneous;

public class DestinationRech {
/*
 * Given coordinates of a source point (x1, y1) determine if it is possible to reach the destination point (x2, y2). From any point (x, y) there only two types of valid movements: 
(x, x + y) and (x + y, y). Return a boolean true if it is possible else return false. 
Note: All coordinates are positive. 
Asked in: Expedia, Telstra
Examples: 
 

Input : (x1, y1) = (2, 10)
        (x2, y2) = (26, 12)
Output : True
(2, 10)->(2, 12)->(14, 12)->(26, 12) 
is a valid path.

Input : (x1, y1) = (20, 10)
        (x2, y2) = (6, 12)
Output : False
No such path is possible because x1 > x2
and coordinates are positive
 */
	
	public static boolean isReachiable(int x1, int y1, int x2, int y2) {
		
		if(x1> x2 || y1 > y2) {
			return false;
		}
		if(x1==x2 && y1==y2) {
			return true;
		}
		return isReachiable(x1 + y1, y1, x2, y2) || isReachiable(x1, y1 + x1, x2, y2);
	}
	public static void main(String[] args) {
		System.out.println(isReachiable(2, 10, 26, 12));
	}
}
