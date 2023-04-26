package operators;

public class NonS_P_D_P_AND_Public {
	// variables
	private int privateVariable=10;
	int defultVarable=15;
	protected int protectedVariable = 20;
	public int publicVariable=25;
	// Method 
	private void privateMethod() {
		System.out.println(" this is a private method.") ;
	}
	void defaultMethod() {
		System.out.println("this is a defult method.");	
	}
	protected void protectedMethod() {
		System.out.println("this is  protected method.");
		}
	public void publicMethod() {
		System.out.println("this is a public method.");
	}
  public static void main(String[] args) {
	  NonS_P_D_P_AND_Public obj = new NonS_P_D_P_AND_Public();
	  
	  System.out.println(obj.defultVarable);
	  System.out.println(obj.protectedVariable);
	  System.out.println(obj.publicVariable);
	   // call method 
	  obj.defaultMethod();
	  obj.protectedMethod();
	  obj.publicMethod();
}
}
