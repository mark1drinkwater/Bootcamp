package ch5;

public class C_MethodName_ParamList_MethodSignature {
}


class MethodName {
    public void jog1() {}
//    public void 2jog() {} // DOES NOT COMPILE
//    public jog3 void() {} // DOES NOT COMPILE
    public void Jog_$() {}
//    public _() {} // DOES NOT COMPILE
//    public void() {} // DOES NOT COMPILE
}

class ParameterList {
    public void run1() {}
//    public void run2 {} // DOES NOT COMPILE
    public void run3(int a) {}
//    public void run4(int a; int b) {} // DOES NOT COMPILE
//    public void run5(int a, int b) {}
}

class MethodSignature1 {
    public void visitZoo(String name, int waitTime) {}
//    public void visitZoo(String attraction, int rainFall) {} // DOES NOT COMPILE
}

class MethodSignature2 {
    public void visitZoo(String name, int waitTime) {}
    public void visitZoo(int rainFall, String attraction) {}
}