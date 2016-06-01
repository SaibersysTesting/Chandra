import java.util.Scanner;


public class EvenrOdd {

	public static void main(String args[]){
		int num;
	      System.out.println("Enter the Value ");
	      Scanner in = new Scanner(System.in);
	 
	      num = in.nextInt();
	      
	      if((num%2)==0)      /* Checking whether remainder is 0 or not. */
	           System.out.println("The number is even: "+num);
	      else
	           System.out.println("The number is odd"+num);
	      
	}
}
