/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 

 
 What do you expect the loop to output?
 
 (a)
 Repeats:10 times
 Expected output: 11, 21, 31, 41, 51, 61, 71, 81, 91
 (b)
 Repeats:  infinity
 Expected output:
 (c)
 Repeats: infinity
 Expected output:
 (d)
 Repeats: 5 times
 Expected output:
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b)yes
 (c) yes
 (d) No

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// copy and paste the loop to test between here, between the println statements
		//c
		int y = 250;
		do {
		    System.out.println( y );
		} while( y % 3 != 0 );
		System.out.println("ENDING LOOP TEST");

	}

}
