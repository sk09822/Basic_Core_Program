import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("Creating a 2 Dimensional Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the no.of Columns: ");
		int column = sc.nextInt();
		sc.close();
		int[][] arr = new int[rows][column];
		int z = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = z;
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "  ");
				z++;
			}
			System.out.println();
		}
	}
}
