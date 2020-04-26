package naveenInterviewQuestions;

public class String_Manipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		String s = "   Welcome Hyderabad  ";
		
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s', 9));  // Hard coded
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //2nd occurrence of 's'
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));  //-1
		
		System.out.println(str.equals(str1));  // String Comparison 
		
		System.out.println(str.equalsIgnoreCase(str1));  //ignore case sensitive 
		
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(0, 9));
		
		System.out.println(s.trim());  // Remove before space and after space
		
		System.out.println(s.replace(" ", ""));
		
		String s1 = "Hello_Wrold_Test_Selenium";
		String s2[] = s1.split("_");
		for(int i=0; i<s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		
		String s3 = "venkat";
		System.out.println(s3.concat("esh"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);   //Very very Important
		System.out.println(x+y+(a+b));
		
		

	}

}
