public class isPalindrome {
	public static void main (String[] args) {
		String s = IBIO.input("Enter a string: ");
		while(s.length()==1)
		{
			System.out.println("length of string is 1, error");
			s = IBIO.input("Enter a string: ");
		}
		char [] array = s.toCharArray();
		int size = array.length;
		boolean t = false;
		for (int i = 0; i < (size/2); i++)
		{
			if (array[i] != array[size - i - 1])
			{
				t = false;
				break;
			}
		}
		if (t == false)
		{
			System.out.println("String is not a palindrome");
		}
		else
		{
			System.out.println("String is a palindrome");
		}	
	}
}
