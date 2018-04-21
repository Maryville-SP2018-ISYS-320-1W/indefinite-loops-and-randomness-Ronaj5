/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 

 
 What do you expect the loop to output?
 
 (a)
 Repeats: 10 times
 Expected output: not sure
 (b)
 Repeats: 0 times
 Expected output: 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
 (c)
 Repeats: Not sure
 Expected output:
 (d)
 Repeats: 1 time
 Expected output: bab
   
 */

/*
 Was your prediction correct?
 
 (a) No
 (b) No
 (c) No 
 (d) No I did not get this one, but I think because the values have not been initialized

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		// copy and paste the loop to test between here, between the println statements
		
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
		System.out.println("ENDING LOOP TEST");
	}

}
