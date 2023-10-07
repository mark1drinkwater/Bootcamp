package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}

public class CombiningGenerics {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        // ? --> Literally ANY class
        List<? extends A> list2 = new ArrayList<A>();
        // ? extends A --> A, B, C
        List<? super A> list3 = new ArrayList<A>();
        // ? super A --> A, Object

        A a = new A();
        B b = new B();
        C c = new C();

        List<? super C> list4 = new ArrayList<A>();
        // ? super C -->  C, B, A

    }
    <T> T first(List<? extends T> list) {
        return list.get(0);
    }
}