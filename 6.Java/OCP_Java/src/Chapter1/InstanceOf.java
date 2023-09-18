package Chapter1;

import java.time.LocalDateTime;

public class InstanceOf
{
    public static void openZoo(Number time) {
        if(time instanceof String) // DOES NOT COMPILE
            System.out.print(time);
    }


    public static void main (String[] args) {
        short shorty = 5;
        openZoo(shorty );
    }

}
