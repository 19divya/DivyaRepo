import java.util.Scanner;


public class BubbleSort {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of number of Rutuja elements: ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.print("Enter elements: ");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			//Sorting
			int temp;
			for (int i=0; i<arr.length-1; i++)
			//optimize code by iterating by going to n-1 as other ele are already sorted
				//outer loop iterates one ele less in each pass
			{
				for(int j=0; j<arr.length - i-1; j++) {
					if(arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			System.out.print("After sorting: ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
		}
	}

