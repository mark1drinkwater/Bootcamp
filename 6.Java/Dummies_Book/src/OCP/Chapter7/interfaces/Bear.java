package OCP.Chapter7.interfaces;

interface Herbivore{ public void eatPlants(); }
interface Omnivore{ public void eatPlants(); }

//interface Omnivore{ public int eatPlants(); } Does not compile, return types differ and are not covariant.

public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlants() {

    }
}
