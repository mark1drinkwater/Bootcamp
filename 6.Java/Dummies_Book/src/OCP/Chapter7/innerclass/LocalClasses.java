package OCP.Chapter7.innerclass;

public class LocalClasses {

    public void processDate() {
        final int length = 5;
        int width = 10;
        int height = 2;

        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // Does not compile
            }
        }
//        width = 2;
    }

}
