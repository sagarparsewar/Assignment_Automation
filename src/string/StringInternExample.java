package string;

public class StringInternExample {
public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = new String ("Hello");
	String s3 = s2.intern();
	//comparing references
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	//Comparing string values 
	System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));


}
}
