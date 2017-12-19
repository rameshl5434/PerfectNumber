import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		int temp,i,count=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("please enter a number ");
		int n = sc.nextInt();
		temp = n;
		for(i=1; i<n; i++)
		{
			if((n%i) == 0)
			{
				count = count+i;
			}
		}
		if( temp == count)
		{
			System.out.println("Entered number is perfect number");
		}
		else
		{
			System.out.println("Entered number is not perfect number");
		}
	}

}
