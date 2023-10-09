package OCP.Chapter6.overriden;

public class HidingVariables {}

class Carnivore {
    protected boolean hasFur = false;
}
class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur); // true
        System.out.println(c.hasFur); // false
    }
}