import java.util.Scanner;

public class InteractiveRepeater {

		static Scanner scobj = new Scanner(System.in);

		public static void whileRepeater(String inp) 
		{
			System.out.println(inp);
		}

		// Define the main method.
		public static void main(String[] args)
		{
			int i = 1;
			while (i > -1) {
				whileRepeater("Why would a Pop-Tart want to live inside a toaster?");
				System.out.print("Do you want to hear it again (-1 for no)?");
				i = scobj.nextInt();
			}
		}
	}