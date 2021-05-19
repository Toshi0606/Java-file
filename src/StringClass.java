
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String a= " Java Tutorials";
		
		System.out.println(a);
		
		System.out.println(a.indexOf(3));
		System.out.println(a.indexOf("v"));
		System.out.println(a.charAt(2));
		System.out.println(a.trim());
		System.out.println(a.concat("is Awesome"));
		System.out.println	(a.isEmpty());
		System.out.println(a.toUpperCase());
		System.out.println(a.substring(5));
		System.out.println(a.length());
		System.out.println(a.replace("a", "z"));
		
		String arr[] =a.split("a");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
	}

}
