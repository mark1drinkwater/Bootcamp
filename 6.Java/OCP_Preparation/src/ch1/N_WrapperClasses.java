package ch1;

public class N_WrapperClasses {
    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        System.out.println(primitive);
        System.out.println(wrapper);

        Double apple = Double.valueOf("200.99");
        // value returns the primitive
        System.out.println(apple.byteValue()); // -56
        System.out.println(apple.intValue()); // 200
        System.out.println(apple.doubleValue()); // 200.99
        System.out.println(Integer.max(4, 100));
    }
}
