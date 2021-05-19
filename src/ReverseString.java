
public class ReverseString {

	public static void main(String[] args) {
		
		String s= "HELLO";
		String t= " ";     // Dummy string to concatenate further
		
		for(int i =s.length()-1;i>=0;i--)
			
     t = t+s.charAt(i);
		
		System.out.println(t);
	
	
/*if (s==t)
{
System.out.println("String is a Palindrom");
}

else
{
 System.out.println("Not a Palindrom");
 
}
	}
*/
	}	
}
