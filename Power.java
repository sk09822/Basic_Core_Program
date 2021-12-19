import java.util.Scanner;
class Power{
	public static void main(String[] args )
	{
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        int i = 0;                
        int powerOfTwo = 1;       

        
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   
            powerOfTwo = 2 * powerOfTwo;                 
            i = i + 1;
        }
       sc.close(); 
	}
}



	
