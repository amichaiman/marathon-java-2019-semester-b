package fourteen;

class A {
    static int j = 7;
    int i;
    int p = 10;

    public A() {
        i = 12;
    }
    int j() {
        return i + j;
    }
}
class B extends A {
    public B() {
        p = 4; }
    public B( int i ) {
        this.i = j + i;
    }
}
class C extends B {
    public static void main( String[] args) {
        A q5 = new B( 2 );
        System.out.println( q5.j() );
//        A q6 = new A();
//        System.out.println( q6.j() );
//        C q7 = new C();
//        System.out.println( q7.p );
//        System.out.println( C.j );
        Integer i = new Integer(3);
        i.valueOf("4");
        Integer.valueOf("3");
    }
}



class D {
    static int a;
}

class F {
    public static void main(String[] args) {
        D d = new D();
        d.a =4;
    }
}


