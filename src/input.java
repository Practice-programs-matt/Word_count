import java.util.Scanner;


public class input {

	public static String text()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text");
		String input = scan.nextLine();
		return input;
	}
	
	public static int wordCount(String text)
	{
		int word_count = 0;
		int length = text.length();
		int m = 0;
		int k = 0;
		int last_word_length =length - lastWord(text);
		
		while (k <= length - last_word_length  && m == 0)
		{
			if (k == length - last_word_length-1) 
			{
				m = 5;// ends loops
			}
			else
			{
				k = text.indexOf(" ", k + 1);
			}
			word_count ++;	
		}
		return word_count;
	}
}
