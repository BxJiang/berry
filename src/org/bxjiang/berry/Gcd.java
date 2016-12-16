package org.bxjiang.berry;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(8, 100));
    }

    /**
     * greatest common divisor
     *
     * @return ...
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
