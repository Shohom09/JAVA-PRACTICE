import java.util.Scanner;

public class String_Compare 
{

	String word1;
	String word2;

	static Scanner s= new Scanner(System.in);


	public static void main(String[] args)
	{
		String_Compare s = new String_Compare();

		boolean bool2 = false;
		s.input();
		bool2=s.compare();

		if(bool2==true)
			{
			System.out.println("You have entered the same word");
			}

			else
			{
			System.out.println("The words are not the same word");
			}
	}


	
	void input()
	{
		System.out.println("Please a word: ");	
		word1=s.next();

		System.out.println("Please another word: ");	
		word2=s.next();
	}

	boolean compare()
	{
		boolean bool = true;

		if(word1.length()!=word2.length())
		{
		bool = false;
		}
		else
		{
			for(int i=0;i<word1.length();i++)
			{
				if(word1.charAt(i)!=word2.charAt(i))
				{
				bool = false;
				break;
				}
				
			}
			
			
		}
		return bool;
	}
}	