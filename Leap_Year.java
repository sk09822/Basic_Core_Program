import java.util.Scanner;
class Leap_Year{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();

		if(year < 1000 ){

			

			System.out.println("Enter a valid Year");

		}
		else if( year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
}