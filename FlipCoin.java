import java.util.Random;
import java.util.Scanner;
class FlipCoin{
	
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Time You Want A FlipCoin ");
		int numberofFlips = sc.nextInt();

		if(numberofFlips<=0)
		{
		   System.out.println("Enter Positive Integer");
		   

		}
		else
		{
			int numberofHeads = 0;

			System.out.println("Heads");
			for(int i=0;i<numberofFlips;i++)
			{
				if(Math.random()>0.5)
				{
					numberofHeads++;
					System.out.println(numberofHeads);
				}
			}
			double percentofHeads=(numberofHeads*100)/numberofFlips;
			double percentofTails=100-percentofHeads;
		    System.out.println("Head percentage : "+percentofHeads);
		    System.out.println("Tails percentage :"+percentofTails);
		}


	}
}
	