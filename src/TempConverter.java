import java.util.*;
import java.lang.Math;

public class TempConverter {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat;
        
        do {
            double f;
            double c;
            
            f = input.nextDouble();
            c = (f - 32) * 5 / 9;
            System.out.println(c);
            repeat = input.nextBoolean();
        } while (repeat);
    }
}
