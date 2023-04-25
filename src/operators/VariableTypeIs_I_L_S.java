package operators;

public class VariableTypeIs_I_L_S {
      private int instanceVariable;
      private static int staticVariable;
      
      public void exampleMethod() {
    	  int localVariable=0;
    	  System.out.println(localVariable);
      }
      public static void main (String[]args) {
    	  VariableTypeIs_I_L_S obj = new VariableTypeIs_I_L_S();
    			  obj.exampleMethod();
      }
}
