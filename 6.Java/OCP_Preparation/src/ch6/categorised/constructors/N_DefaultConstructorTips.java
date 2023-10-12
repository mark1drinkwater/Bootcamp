package ch6.categorised.constructors;

public class N_DefaultConstructorTips {
}

class Mammal {
    public Mammal(int age) {}
}
//class Seal extends Mammal {} // DOES NOT COMPILE

//class Elephant extends Mammal {
//    public Elephant() {} // DOES NOT COMPILE
//}


//class Seal extends Mammal {
//    public Seal() {
////        super(); // DOES NOT COMPILE
//    }
//}


//class Elephant extends Mammal {
//    public Elephant() {
//        super(); // DOES NOT COMPILE
//    }
//}


class Seal extends Mammal {
    public Seal() {
        super(6); // Explicit call to parent constructor
    }
}


class Elephant extends Mammal {
    public Elephant() {
        super(4); // Explicit call to parent constructor
    }
}