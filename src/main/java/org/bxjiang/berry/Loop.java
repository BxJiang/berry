package org.bxjiang.berry;

/**
 * Loops consist of three parts:
 * 1. worker => do the main processing of data;
 * 2. checker => check if the loop is going to execute again;
 * 3. iterator => update the status of the loop.
 *
 * trace a loop:
 * 1. check first => worker does "not" work at 'the last round'(the checker reject for
 * the first time);
 * 2. work first => worker work at 'the last round'.
 */
public class Loop {
    public static void main(String[] args) {
        System.out.println("=============== CWI(0-99) ===============");
        cwi();
        System.out.println("=============== CIW(1-100) ===============");
        ciw();
        System.out.println("=============== WCI(0-100) ===============");
        wci();
        System.out.println("=============== WIC(0-99) ===============");
        wic();
    }

    public static void cwi() {
        // form 1
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }

        System.out.println();

        // form 2
        int j = 0;
        while (j < 100) {
            System.out.print(j);
            j++;
        }

        System.out.println();
    }

    public static void ciw() {
        // form 1
        int i = 0;
        while (i < 100) {
            i++;
            System.out.print(i);
        }

        System.out.println();

        // form 2
        int j = 0;
        while (j++ < 100) {
            System.out.print(j);
        }

        System.out.println();
    }

    public static void wic() {
        // from 1
        int i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 100);

        System.out.println();

        // form 2
        int j = 0;
        do {
            System.out.print(j);
        } while (++j < 100);

        System.out.println();

    }

    public static void wci() {
        // form 1
        int i = 0;
        do {
            System.out.print(i);
        } while (i++ < 100);

        System.out.println();

        // form 2
        int j = 0;
        j--; // to get rid of the first iteration
        do {
            j++;
            System.out.print(j);
        } while (j < 100);

        System.out.println();

    }

    // as I know, no one want to iterate first.
}
