package operators;


public class StaticVariableScope {
    static class A {
        static int i = 10;
        public static A a1;
    }

    static class B {
        public static void main(String[] args) {
            System.out.println(A.i);
            A.a1 = new A();
            System.out.println(A.a1.i);
        }
    }
}