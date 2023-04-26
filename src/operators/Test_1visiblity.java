package operators;

public class Test_1visiblity {
	//private : instance variables declared as private can only be 
	//accessed within the same class where it is declared it cannot 
	//accessed from any other class
class test{
	private int privateVar;
}

//defaultvar: Instance variables declared with visiblity can be accessed with
// the same package . it cannot accessed from any other package including subclass in other packages

class test_1{
	int defautVar;
	}
//protected:An instance declared as protected can be accessed within the same package and also by any
//subclass,regardless of the package.
public class test_2{
	protected int protectedVar;
}
//public :An instance variables declared as public can be accessed from anywhere
//including other packages and subclass.
public class test_3{
	public int publicVar;
}
}
