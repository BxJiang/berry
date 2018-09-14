package org.bxjiang.berry;

/**
 * two situations:
 * 1.  A B   (even length)
 * 2. a b c  (odd length)
 */
public class MidPoint {
    public static void main(String[] args) {
        char[] abc = {'a', 'b', 'c'};
        char[] AB = {'A', 'B'};
        System.out.println(midAb(AB) + "" + midAb(abc));
        System.out.println(midAa(AB) + "" + midAa(abc));
        System.out.println(midBb(AB) + "" + midBb(abc));
        System.out.println(midBc(AB) + "" + midBc(abc));
    }

    // return Ab
    public static char midAb(char[] array) {
        int head = 0;
        int tail = array.length - 1;
        int mid = (head + tail) / 2;
        return array[mid];
    }

    public static char midAa(char[] array) {
        int head = 0;
        int tail = array.length - 1;
        int mid = (head + tail - 1) / 2;
        return array[mid];
    }

    public static char midBb(char[] array) {
        int head = 0;
        int tail = array.length - 1;
        int mid = (head + tail + 1) / 2;
        return array[mid];
    }

    public static char midBc(char[] array) {
        int head = 0;
        int tail = array.length - 1;
        int mid = (head + tail) / 2 + 1;
        return array[mid];
    }
}
