package org.bxjiang.berry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayReverse {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> input = new ArrayList<>(Arrays.asList(array));
        reverse(input);
        System.out.println(input);
        reverse(array);
        System.out.println(Arrays.toString(array));  // remark: reverse the list does not reverse the array
    }

    public static <T> void reverse(List<T> input) {
        ListIterator<T> fwd = input.listIterator();  // next index is 0
        ListIterator<T> rev = input.listIterator(input.size());  // next index is input.size()
        // remark: "input.size() >> 1" get Bb,
        // however, the "q < mid" make the worker stop running after working on Aa, which is what we want.
        for (int p = 0, mid = input.size() >> 1, q = input.size(); p < mid; p++, q--) {
            T temp = fwd.next();
            fwd.set(rev.previous());
            rev.set(temp);
        }
    }

    public static <T> void reverse(T[] input) {
        int N = input.length;
        for (int i = 0; i < N / 2; i++) {
            T tmp = input[i];
            input[i] = input[N - 1 - i];
            input[N - 1 - i] = tmp;
        }
    }
}
