package ch6.categorised;

class Animal {
    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}


class B2_Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);
        // Subclass has access to public and protected variables and methods.
        name = n;
        // So direct access to age is not possible
        //        age  = 5; Nope
    }
    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }

    public static void main(String[] args) {
        var lion = new B2_Lion();
        lion.setProperties(3, "Simba");
        lion.roar();
    }
}