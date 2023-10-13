package ch6.categorised;

class B2_Lion extends B1_Animal {
    protected void setProperties(int agea, String n) {
        setAge(agea);
        // Subclass has access to public and protected variables and methods.
        name = n;
        // So direct access to age is not possible
//                age  = 5; //Nope
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