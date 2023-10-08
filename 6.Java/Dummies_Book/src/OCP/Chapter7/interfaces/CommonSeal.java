package OCP.Chapter7.interfaces;

interface HasTail {
    public int getTaiLength();
}

interface HasWhiskers {
    public int getNumOfWhiskers();
}

abstract class HarborSeal implements HasTail, HasWhiskers {

}

//public class CommonSeal extends HarborSeal {} // Does not compile
// Must implement the methods
public class CommonSeal extends HarborSeal {
    @Override
    public int getTaiLength() {
        return 5;
    }
    @Override
    public int getNumOfWhiskers() {
        return 25;
    }
}