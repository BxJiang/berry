package org.bxjiang.berry;


import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        Integer[] array = {new Integer(1), new Integer(2)};
        Integer[] copy = Arrays.copyOf(array, array.length); // shallow copy
        System.out.println(Arrays.toString(copy));
        System.out.println(new Integer(1) == new Integer(2));
        System.out.println(array == copy);
        System.out.println(Arrays.equals(array, copy));
        System.out.println(array[0] == copy[0]);
    }
}
