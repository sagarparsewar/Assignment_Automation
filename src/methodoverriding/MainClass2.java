package methodoverriding;

class A {
    public void test() {
        System.out.println("class A");
    }
}

class B extends A {
    @Override
    public void test() {
        System.out.println("class B");
    }
}

class C extends B {
    @Override
    public void test() {
        System.out.println("class C");
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.test(); // Output: class A
        b.test(); // Output: class B
        c.test(); // Output: class C
    }
}