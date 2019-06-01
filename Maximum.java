import java.util.Scanner;

public class Maximum
{
	int max;
	int[] array;
	int n;
	int max2;

	public static void main(String[] args)
	{
		Maximum m = new Maximum();
		m.input();
		m.max();

	}

	void input()
	{
		int i;

		System.out.println("Please enter the limit of the array: ");
 		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		array = new int[n];
		System.out.println("Please enter the array: ");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}

	}

	void max()
	{	
		int i;
		int temp;
		max=array[0];

		for(i=0;i<n;i++)
		{
			if(array[i]>array[0])
			{
				max=array[i];
				max=max2;
				max2=array[i];
			//	temp=array[i];
			//	array[i]=array[0];
			//	array[0]=temp;
			}
		}
		//max2=array[1];

		//for(i=1;i<n;i++)
		//{
		//	if(array[i]>max2)
		//	{
		//		max2=array[i];
		//	}
		//}

		System.out.println("Largest value in this array is: "+ max2);
		System.out.println("The second largest value in this array is: "+ max);
	}

}