package types;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type int: min size: " + Integer.MIN_VALUE + " max size: " + Integer.MAX_VALUE);
        System.out.println("Type double: min size: " + Double.MIN_VALUE + " max size: " + Double.MAX_VALUE);
        System.out.println("Type long: min size: " + Long.MIN_VALUE + " max size: " + Long.MAX_VALUE);
        System.out.println("Type float: min size: " + Float.MIN_VALUE + " max size: " + Float.MAX_VALUE);
        System.out.println("Type byte: min size: " + Byte.MIN_VALUE + " max size: " + Byte.MAX_VALUE);
        System.out.println("Type short: min size: " + Short.MIN_VALUE + " max size: " + Short.MAX_VALUE);
        char min = Character.MIN_VALUE;
        char max = Character.MAX_VALUE;
        System.out.println("Type char: min size: " + (int) min + " max size: " + (int) max);
        int[] array = new int[]{1,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
    }
}
