public class Sumation {

	public static void main(String args)
	{
		int i, sum=0;
		int array[] = {10,2,45,6,7,21,89,100,9,11};

		for(i=0;i<10;i++)
		{
			sum=sum+array[i];
		}

		System.out.println(sum);
	}
}